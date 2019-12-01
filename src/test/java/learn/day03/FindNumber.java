package learn.day03;

/**
 * FindNumber
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-01 22:28
 */
public class FindNumber {
    public static void main(String[] args) {
        /*
        * 本类代码主要讲解break的使用
        *
        * 题目: 从 1-10中 找到幸运数字 8 并且 打印幸运数字(要求使用 break)
        */
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次for循环");
            if (i == 8) {
                System.out.println("找到幸运数字：" + i);
                break;
            }
        }
        /*
        * 执行上述代码 会发现 for循环仅执行了 8次 第9、第10次并没有执行
        * 为什么？
        *   与continue不同的是 break是跳出(即跳出这个for循环，这个for循环执行结束)
        *   当break执行后 不管for已经执行了几次，还有几次要执行 都不会在执行此次for循环
        *
        *
        *   *******************重点***************************
        *   break 关键字的语义是终止其所在的循环或语句(不仅仅是在for循环中可以用break)
        *   break 语句只是结束他所在的循环 如果是循环嵌套，不会终止他外部的循环(这个后面会讲)
        *   跟continue相同 break语句要放在其所在代码块的最后一行(即 {}中的最后一行)
        */
    }
}
