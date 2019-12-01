package learn.day03;

/**
 * TeachOne
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-01 21:59
 */
public class TeachOne {

    public static void main(String[] args) {
        /*
        * 前面我们已经讲完了for循环的基本使用
        * 今天主要讲for循环的作用域、continue、break关键字以及for循环嵌套
        */
        for (int i = 1; i <= 10; i++) {
            /*
            * 在for循环中定义的变量 是for循环的局部变量
            *
            * 即 这个变量只能在这个for循环中使用
            *  在for后面的()中的变量 比如上面的 int i = 0;
            *  这个变量的作用域是整个for循环循环执行结束后 i的内存空间会被释放
            *  (即i只属于这个for循环 循环执行完了 i这个变量也就消失了)
            *
            *  在for循环的 {}中定义的变量 如下面的 int temp = 2;
            *  作用域仅限于当前循环
            *  意思是 每一次循环 都会声明一个 int类型的 名字为 temp 且值为2的变量
            *  每次执行一次循环 temp这个变量都会消失
            *
            *  举个例子: for循环刚开始 i = 0 此时判断 i <10 符合条件
            *  然后执行{}里面的内容 此时定义一个变量 为 temp 值为 2
            *  {}中的内容执行完后 temp这个变量就消失了 然后 执行 i++ 此时 i = 2 然后判断 i <10
            *  再执行{}里面的内容 这时 会重新定义一个temp的变量
            *
            *  下面的代码可以证明
            *
            */
            int temp = 2;
            System.out.println("第 " + i + "次循环" + "temp的值为" + temp);
            temp++;
        }
        /*
        * 执行上面的代码可以看出 虽然每次输出语句执行后 temp都进行了自增操作，
        * 但是每次打印出的temp的值都是 2 这就是因为
        * temp这个变量是每次循环都会去声明的 每次循环执行完都会消失
        *
        * 这个就是for循环的变量作用域
        */
    }
}
