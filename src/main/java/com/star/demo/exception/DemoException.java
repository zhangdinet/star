package com.star.demo.exception;

import java.util.concurrent.ExecutionException;

/**
 * Created by zhangdi on 2015/9/11.
 */
public class DemoException {

    public static void main(String[] args) {
        makeZeroExecption();
        makeArrayException();
    }

    public static void makeZeroExecption() {
        int a = 10;
        int b = 0;
        try {
            a = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        a = 10;
    }

    public static void makeArrayException() {
        int[] arr = {2, 3};
        try {
            System.out.println(arr[1]);
            System.out.print(arr[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 10;
        a++;
    }

}
