package com.atguigu.java;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();

        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
//        int max = util.getMax(arr);
//        System.out.println("最大值是：" + max);
//        int min = util.getMin(arr);
//        System.out.println("最小值是：" + min);
//        int sum = util.getSum(arr);
//        System.out.println("数组总和是：" + sum);
//        int avg = util.getAvg(arr);
//        System.out.println("数组平均值：" + avg);

        System.out.println("排序前：");
        util.print(arr);
        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);
    }
}
