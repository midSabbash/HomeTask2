package org.sourceit;

import java.util.Random;

import static java.lang.Math.pow;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.print("exr 1 > ");
        System.out.println(+decimalToBinary(2));
        System.out.print("exr 2 > ");
        System.out.println(+decimalToOctal(43));
        System.out.print("exr 3 > ");
        System.out.println(+decimalToHex(100));
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
//toBinary
    public static long decimalToBinary(int number) {
        long a = 0;
        int[] array = binaryArray(number);
        for (int i = binary(number) - 1; i != -1; i--) {
            a = a * 10 + array[i];
        }
        return a;
    }
    public static int binary(int binaryNumbers) {
        int q = 0;
        while (binaryNumbers != 0) {
            binaryNumbers /= 2;
            q++;
        }
        return q;
    }
    public static int[] binaryArray(int binaryNumbers2) {
        int y = binary(binaryNumbers2);
        int[] mass = new int[y];
        int i = 0;
        while (binaryNumbers2 != 0) {
            int a = binaryNumbers2 % 2;
            mass[i] = a;
            binaryNumbers2 /= 2;
            i++;
        }
        return mass;
    }

//toOctal
    public static long decimalToOctal(int number) {
        long a = 0;
        int[] array = arrayOctal(number);
        for (int i = digitsOctal(number) - 1; i != -1; i--) {
            a = a * 10 + array[i];
        }
        return a;
    }
    public static int digitsOctal(int octalNumbers) {
        int q = 0;
        while (octalNumbers != 0) {
            octalNumbers /= 8;
            q++;
        }
        return q;
    }
    public static int[] arrayOctal(int octalNumber2) {
        int y = digitsOctal(octalNumber2);
        int[] mass = new int[y];
        int i = 0;
        while (octalNumber2 != 0) {
            int a = octalNumber2 % 8;
            mass[i] = a;
            octalNumber2 /= 8;
            i++;
        }
        return mass;


    }

//toHex
    public static long decimalToHex(int number) {
            long a = 0;
            int[] mas = arrayHex(number);
            for (int i = digitsHex(number) - 1; i != -1; i--) {
                a = a * 100 + mas[i];
            }
            return a;
        }
    public static int digitsHex(int hexNumber) {
        int q = 0;
        while (hexNumber != 0) {
            hexNumber /= 16;
            q++;
        }
        return q;
    }
    public static int[] arrayHex(int hexNumber2) {
        int y = digitsHex(hexNumber2);
        int[] mass = new int[y];
        int i = 0;
        while (hexNumber2 != 0) {
            int a = hexNumber2 % 16;
            mass[i] = a;
            hexNumber2 /= 16;
            i++;
        }
        return mass;
    }


//fromBinary
    public static long binaryToDecimal (long bin){
        long array[] = arrayCount(bin);
        int i = 0;
        long g = 0;
        while(i != arrayLength(bin)){
            g = g + array[i] * (long)Math.pow(2,i);
            i++;
        }
        return g;
    }
    public static long[] arrayCount (long binary) {
        long[]array = new long[arrayLength(binary)];
        int i = 0;
        while (binary != 0) {
            long a = binary % 10;
            array[i] = a;
            binary /= 10;
            i++;
        }
        return  array;
    }


//fromOctal
    public static int octalToDecimal(long octal) {
        long array[] = arrayCount2(octal);
        int i = 0;
        long g = 0;
        while(i != arrayLength(octal)){
            g = g + array[i] * (long)Math.pow(8,i);
            i++;
        }
        return (int)g;
    }
    public static long[] arrayCount2 (long binary) {
        long[]array = new long[arrayLength(binary)];
        int i = 0;
        while (binary != 0) {
            long a = binary % 10;
            array[i] = a;
            binary /= 10;
            i++;
        }
        return  array;
    }

//arrayLengthCounter
    public static int arrayLength (long binary){
    int count = 0;
    while(binary != 0){
        binary = binary / 10;
        count++;
    }
    return count;
}


//fromHex
    public static int hexToDecimal(long hex) {
        long array[] = arrayCount3(hex);
        int i = 0;
        long g = 0;
        while(i != arrayLength1(hex)){
            g = g + array[i] * (long)Math.pow(16,i);
            i++;
        }
        return (int)g;
    }
    public static long[] arrayCount3 (long binary) {
        long[]array = new long[arrayLength(binary)];
        int i = 0;
        while (binary != 0) {
            long a = binary % 100;
            array[i] = a;
            binary /= 100;
            i++;
        }
        return  array;
    }
    public static int arrayLength1 (long binary) {
        int count = 0;
        while (binary != 0) {
            binary = binary / 100;
            count++;
        }
        return count;
    }


/////
    public static int[][] generateTwoDimensionArray(int rows, int columns) {

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] =  1 + (int) (Math.random() * (9));
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