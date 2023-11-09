package com.atwt.boot.controller;


import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.controller
 * @Author: wutao
 * @CreateTime: 2023-10-27  20:52
 * @Description: TODO
 * @Version: 1.0
 */
public class Maopao {

    public static void main(String[] args) {

        int[] array = new int[]{1, 43, 45, 64, 3, 454, 546, 4};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j <array.length-1-i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        for (int j = 0; j < 10; j++) {
//            for (int i = 10; i >j; i--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
