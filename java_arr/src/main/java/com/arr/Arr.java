package com.arr;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("杨辉三角行数：");
        int n = scanner.nextInt();
        int[][] yangHui = new int[n][];
        for (int i = 0; i < yangHui.length; i++) {
            //给每个一维数组开辟空间
            yangHui[i] = new int[i + 1];
            //每行
            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                }
            }
        }
        //输出杨辉三角
        for(int i = 0; i < yangHui.length; i++) {
            for(int j = 0; j < yangHui[i].length; j++) {//遍历输出该行
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();//换行.
        }
    }
}
