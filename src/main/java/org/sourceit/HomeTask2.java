package org.sourceit;

import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("exr 1");
        System.out.println(+decimalToBinary(2));
        System.out.println("exr 2");
        System.out.println(+decimalToOctal(43));
        System.out.println("exr 3");
        System.out.println(+decimalToHex(512));
        System.out.println("exr 4");
        System.out.println(+binaryToDecimal(1100100));
        System.out.println("exr 5");
        System.out.println(+octalToDecimal(144));
        System.out.println("exr 6");
        System.out.println(+hexToDecimal(64));
        System.out.println("exr 7");
        System.out.println(generateTwoDimensionArray(10,10));
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

    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long sum(int n) {
        return 0;
    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {
        return -1;
    }

}
