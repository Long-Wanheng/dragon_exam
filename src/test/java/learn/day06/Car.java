package learn.day06;

/**
 * Car
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-07 17:30
 */
public class Car {

    public static void main(String[] args) {
        /*
        *  public公共的,
        *  static静态的
        *  void 是没有返回值的
        *  main是方法名字
        */
        ArrayPrint.print();
        String phoneNumber = "蔡徐坤";
        phone(phoneNumber);
        System.out.println("电话打完了");
        /*
        * 静态的 只能调用静态的，而不能掉用非静态的
        *
        * return代表的意思是 不再执行这个方法直接返回
        */
        return;
    }

    public static String phone(String phoneNumber) {
        System.out.println("正在打电话给...." + phoneNumber);
        return "10";
    }
}
