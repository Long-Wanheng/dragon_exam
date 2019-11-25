package learn.day02;

/**
 * TeachOne
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-26 00:01
 */
public class TeachOne {
        /*
       *  自增运算符 ++today;跟 today++的区别：
       *  ++在前面的时候 是先+1 然后赋值(--today同理)
       *  ++在后面的时候 是先赋值 然后 +1(today--同理)
       *
       *  int number = ++today;
       *  等价于:
       *  today = today +1;
       *  int number = today;
       *  ==============================
       *  int number = today++;
       *  等价于
       *  int number = today;
       *  today = today + 1;
       *  ======================================
       *   +=;
       *   today += 1;
       *   等价于 today = today + 1;
       *   -=:
       *   today -= 1;
       *   等价于 today = today - 1;
       *   *=:
       *   today *= 1;
       *   等价于 today = today * 1;
       *   /=:
       *   today /= 1;
       *   等价于 today = today / 1;
       *   ================================
       *   取余运算符: %
       *   int number = 4 % 3;
       *   因为 4除以3的余数为1
       *   所以 int number = 4 % 3;的结果为 1
       *   =================================
       *    /运算符
       *    int number = 7 / 3;
       *    结果是 2
       *    为什么?因为 7 ÷ 3 = 2 ......余数为1
       *    在java中 一个数除以另一个数时 只保留能整除的部分，不能整除的部分不会保留
       *    (即小数部分直接被忽略)
       *
       */

}
