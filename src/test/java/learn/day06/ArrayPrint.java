package learn.day06;

/**
 * ArrayPrint
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-12-07 15:46
 */
public class ArrayPrint {
    public static void main(String[] args) {
//        int[] arr = new int[100];
        //角标从0开始的，最大的角标是数组的长度-1

        //给数组赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }

        //数组的遍历
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //int[] arr2 = {1, 2, 3};

        int[] arr = {1, 7, 6, 5, 4, 3, 2, 9, 8};


        System.out.println("排序前数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }

        //选择排序
//        for (int x = 0; x < arr.length - 1; x++) {
//
//            for (int y = x + 1; y < arr.length; y++) {
//                if (arr[x] > arr[y]) {
//                    int temp = arr[x];
//                    arr[x] = arr[y];
//                    arr[y] = temp;
//                }
//            }
//        }

        //冒泡排序
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length - 1 - x; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("排序前数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }
    }
}
