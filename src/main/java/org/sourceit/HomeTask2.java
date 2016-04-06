package org.sourceit;

import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.print("exr 1 > ");
        System.out.println(+decimalToBinary(2));
        System.out.print("exr 2 > ");
        System.out.println(+decimalToOctal(43));
        System.out.print("exr 3 > ");
        System.out.println(+decimalToHex(512));
        System.out.print("exr 4 > ");
        System.out.println(+binaryToDecimal(1100100));
        System.out.print("exr 5 > ");
        System.out.println(+octalToDecimal(144));
        System.out.print("exr 6 > ");
        System.out.println(+hexToDecimal(64));
        System.out.print("exr 7 > ");
        System.out.println(generateTwoDimensionArray(10,10));
        System.out.print("exr 8 > ");
        System.out.println(findMaxProduct(generateTwoDimensionArray(4,4)));
        System.out.print("exr 9 > ");
        System.out.println(getSimple(30));
        System.out.print("exr 10 > ");
        System.out.println(+sum(1));
        System.out.print("exr 11 > ");
        System.out.println(+product(-2,-5));
    }

    public static long decimalToBinary(int number) {
        int b;
        String temp = "";
        while(number !=0){
            b = number%2;
            temp = b + temp;
            number = number/2;
        }
        long d = new Long(temp);
        return d;
    }

    public static long decimalToOctal(int number) {
        int b;
        String temp = "";
        while(number !=0){
            b = number%8;
            temp = b + temp;
            number = number/8;
        }
        long d = new Long(temp);
        return d;

    }

    public static long decimalToHex(int number) {
        int b;
        String temp = "";
        while(number !=0){
            b = number%16;
            temp = b + temp;
            number = number/16;
        }
        long d = new Long(temp);
        return d;
    }

    public static int binaryToDecimal(long binary) {
        int a;
        a = (Integer.parseInt(String.valueOf(binary), 2));
        return a;
    }

    public static int octalToDecimal(long octal) {
        int a;
        a = (Integer.parseInt(String.valueOf(octal),8));
        return a;
    }

    public static int hexToDecimal(long hex) {
        int a;
        a = (Integer.parseInt(String.valueOf(hex), 16));
        return a;
    }

    public static int[][] generateTwoDimensionArray(int rows, int columns) {

        int[][] arr = new int[rows][columns];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] =  1 + random.nextInt(9);
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();

            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        return arr;
    }

    public static int findMaxProduct(int[][] input) {
        int a = 1;
        int line = 0;
        for(int i = 0; i < input.length; i++) {
            for (int j = 0, x = 1; j < input[i].length; j++) {
                x = x * input[i][j];

                if (j == input[i].length - 1) {
                    if (a < x) {
                        a = x;
                        line = i;
                    }
                }
            }
        }
        return line;
    }

    public static int[] getSimple(int n) {
        int quantity = 0;
        int cell = 0;

        for(int i = 2; i < n; i++)
            if (simple(i)){
                quantity++;
                System.out.print(i+" ");
            }
        int [] array = new int[quantity];
        for(int j = 2;j<n;j++){
            if(simple(j)) {
                array[cell] = j;
                cell++;
            }
        }
        return array;
    }

    static boolean simple(int digit){
        boolean pudge = true;
        for(int i = 2; i <= digit/2 ; i++){
            if(digit % i == 0) {
                pudge = false;
            }
        }
        return pudge;
    }

    public static long sum(int n) {
        if(n<0) return 0;
        return sum(n-1)+n;
    }

    public static int product(int first, int second) {
        if (first == 0 || second == 0) return 0;
        if (first < 0) return (second *-1 + product(first +1, second));
        if (second < 0) return (first *-1 + product(first, second +1));
        return (first > 0 & second > 0)? first + product(first, second -1):0;
    }
}