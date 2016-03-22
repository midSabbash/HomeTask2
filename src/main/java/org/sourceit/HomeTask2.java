package org.sourceit;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.print("exr 1 > ");
        System.out.println(+decimalToBinary(2));
        System.out.print("exr 2 ");
        System.out.println(+decimalToOctal(43));
        System.out.print("exr 3 ");
        System.out.println(+decimalToHex(512));
        System.out.print("exr 4 ");
        System.out.println(+binaryToDecimal(1100100));
        System.out.print("exr 5 ");
        System.out.println(+octalToDecimal(144));
        System.out.print("exr 6 ");
        System.out.println(+hexToDecimal(64));
        System.out.print("exr 7 ");
        System.out.println(generateTwoDimensionArray(10,10));
        System.out.print("exr 8 ");
        System.out.println();
        System.out.print("exr 9 ");
        System.out.println(getSimple(10));
        System.out.print("exr 10 ");
        System.out.println(+sum(20));
        System.out.print("exr 11 ");
        System.out.println(+product(10,12));

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
                arr[i][j] = random.nextInt();
            }
        }
        return arr;
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param input двумерный массив
     * @return индекс строки
     */
    public static int findMaxProduct(int[][] input) {
        return 1;
    }


    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {
       return null;
    }

    public static long sum(int n) {
        if(n<0) return 0;
        long r;
        if (n==1) return 1;
        r = sum(n-1)+n;
        return r;
    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {
        if(second > 1) {
            return first + product(first, --second);
        }
        return first;
    }

}
