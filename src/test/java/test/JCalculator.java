package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JCalculator
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-04 22:59
 */

public class JCalculator extends JFrame implements ActionListener {
    //定义计算器按钮名字
    private final String[] str = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
    };
    //定义计算器按钮数组
    JButton[] buttons = new JButton[str.length];  //buttons for numbers
    //定义清零按钮
    JButton reset = new JButton("CE");         //button for reset
    //定义的是计算器文本域以及文本域的默认内容
    JTextField display = new JTextField("0");  //textfied for result

    //构造器也叫构造方法，用new关键字创建的对象都必须走构造器
    public JCalculator() {
        //super()走的是父类构造器定义的是标题
        super("计算器");
        //定义字体、大小什么的
        Font font = new Font("Consolas", Font.BOLD, 18);

        //定义一个面板
        JPanel pnlHead = new JPanel(new BorderLayout());
        //设置面板属性
        pnlHead.add(display, BorderLayout.CENTER);
        pnlHead.add(reset, BorderLayout.EAST);
        //设置字体
        display.setFont(font);
        reset.setFont(font);

        //定义的是按键的面板区域
        JPanel pnlBody = new JPanel(new GridLayout(4, 4));
        //用for循环一个一个把上面str数组定义的名字生成按钮
        for (int i = 0; i < str.length; i++) {
            buttons[i] = new JButton(str[i]);
            buttons[i].setFont(font);
            pnlBody.add(buttons[i]);
        }

        //设置格式
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(BorderLayout.NORTH, pnlHead);
        getContentPane().add(BorderLayout.CENTER, pnlBody);

        //给按钮设置监听器，用来监听鼠标点击事件什么的
        for (int i = 0; i < str.length; i++) {
            buttons[i].addActionListener(this);
        }
        reset.addActionListener(this);
        display.addActionListener(this);

        //设置一些大小啊 什么的属性
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 280);
        setVisible(true);
    }

    //事件的触发(比如鼠标点击了按钮)
    public void actionPerformed(ActionEvent e) {
        //获取事件来源
        Object source = e.getSource();
        //获取事件的命令，也就是你点击了那个按钮
        String cmd = e.getActionCommand();
        //如果是清零按钮
        if (source == reset) {
            //调用清零方法
            handleReset();
            //如果用户点击的是是数字或者点
        } else if ("0123456789.".indexOf(cmd) >= 0) {
            //调用方法
            handleNumber(cmd);
        } else {
            //如果都不是 那用户肯定点击的是计算符号的按钮，加减乘除之类的
            handleOperator(cmd);
        }
    }

    //用户是否第一次点击数字以及小数点
    boolean isFirstDigit = true;
    //计算器最开始的值是0
    double number = 0.0;
    //操作符
    String operator = "=";

    public void handleNumber(String key) {
        //如果是第一个数字
        if (isFirstDigit) {
            //把文本域设置为点击的按钮
            display.setText(key);
            //如果用户点击的不是小数点
        } else if (!key.equals(".")) {
            //把文本域的内容设置为之前的内容加上用户点击按钮对应的值
            display.setText(display.getText() + key);
            //如果文本域中的没有包含小数点
        } else if (display.getText().indexOf(".") < 0) {
            //把文本域的内容设置为之前的内容加上小数点
            display.setText(display.getText() + ".");
        }
        //用户点击了按钮，那再点击就肯定不是第一个数字了 所以设置为false
        isFirstDigit = false;
    }

    //清零方法
    public void handleReset() {
        //把文本域归为0，按钮归位...
        display.setText("0");
        isFirstDigit = true;
        operator = "=";
    }

    //计算方法
    public void handleOperator(String cmd) {
        /*这个是把文本域的内容转成double类型的 用于计算
        *  为什么是double类型的呢？
        *   因为我们知道java中的除法是不会保留小数点的,所以 我们用double类型来计算
        */
        double dDisplay = Double.valueOf(display.getText());
        //用一个switch判断用户点击的是什么运算符
        switch (operator) {
            case "+":
                //如果是加号，那就计算加法
                number += dDisplay;
                break;
            case "-":
                //如果是减号，那就计算减法
                number -= dDisplay;
                break;
            case "*":
                //如果是乘号，那就计算乘法
                number *= dDisplay;
                break;
            case "/":
                //如果是除号，那就计算除法
                number /= dDisplay;
                break;
            case "=":
                //如果是等于，那就直接赋值
                number = dDisplay;
                break;
        }
        //把计算的结果放到文本域上
        display.setText(String.valueOf(number));
        //设置运算符符为用户刚刚点击的运算符
        operator = cmd;
        //此时用户再点击，就算是第一次点击了，所以设置他为true
        isFirstDigit = true;
    }

    public static void main(String[] args) {
        //这里用到了一个表达式，是新创建一个线程这个我们先不讲
        SwingUtilities.invokeLater(() -> {
            //第一部创建对象，走构造器
            new JCalculator();
        });
    }
}

