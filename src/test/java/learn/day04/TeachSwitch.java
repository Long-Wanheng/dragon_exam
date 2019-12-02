package learn.day04;

/**
 * TeachSwitch
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-02 23:17
 */
public class TeachSwitch {
    public static void main(String[] args) {
        /*
        * switch是选择分支语句 语法格式为switch(){}
        * 在switch的()中的值不可以是随便的类型
        * 他可以是int byte,short，char还可以是字符串(String)跟枚举(字符串跟枚举不是基本数据类型，这个我们后边会讲到)
        *(其他类型switch暂时不支持)
        *
        *case后面跟的必须是一个确定的值，比如 1、2 还有char类型的'A' 字符串类型的"A"(char类型用单引号 字符串(String)用双引号)
        * 他会根据switch的()里面的值去跟case后面的值进行匹配 然后执行case后面的代码
        *
        * default是一个默人的，如果switch()里面的值跟case后面的值都没有匹配上，那他一定会走default
        * 比如 我们把下面的today的值改成不在1-7范围内的数字 那最后的执行结果一定是未知
        *
        * ************重点************
        * 昨天我们学过break关键字，他的意思是跳出，在switch中 我们同样可以使用break关键字
        *
        * 在每个case后面的一般都会有一个break; 如果不写break; 他会一直往下匹配
        * 比如 我们把下面的break;都去掉，执行下面的代码 他会从今天星期二 一直打印到未知
        *
        * 虽然java语法没有强制规定必须写break; 但是我们一般都是要写break;的
        * 写了break;他就不会继续往下匹配了
        * 因为我们的目的 只是要找到今天是星期几就可以 找到了就可以跳出了
        * ***************************************************************
        *
        */
        int today = 2;
        switch (today) {
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期日");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}
