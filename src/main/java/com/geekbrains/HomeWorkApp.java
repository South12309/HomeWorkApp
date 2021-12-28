package com.geekbrains;

public class HomeWorkApp {

    public static void main(String[] args) {

    }

    public static void replaceNumber() {
        int[] array = {1, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                array[i] = 0;
            else
                array[i] = 1;
        }
    }

    public static void createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void less6multiply2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
    }

    public static void fillDiagonal() {
        int lengthArray = 10;
        int[][] array = new int[lengthArray][lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            for (int j = 0; j < lengthArray; j++) {
                if ((i == j) || (lengthArray - 1 - j == i))
                    array[i][j] = 1;
            }
        }
    }

    public static int[] createArray(int len, int initValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initValue;
        }
        return array;
    }

    public static void findMinMaxArray() {
        int lengthArray = 10;
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = i;
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < lengthArray; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
    }

    public static boolean checkBalance(int[] array) {
        int[] directSumArray =new int[array.length];
        int[] reversSumArray = new int[array.length];

        int directSum=0;
        int reversSum=0;

        for (int i = 0; i <array.length; i++) {
            directSum = array[i] + directSum;
            directSumArray[i] =directSum;
        }

        for (int i = array.length-1; i >=0; i--) {
            reversSum = array[i] + reversSum;
            reversSumArray[array.length-1-i] =reversSum;
        }

        for (int i = 0; i < array.length-1; i++) {
            if (directSumArray[i] == reversSumArray[array.length - 2 - i])
                return true;
        }

        return false;
    }

    public static void offsetElementsOfArray(int[] array, int n) {

       if (n>0) {
           for (int i = 0; i < Math.abs(n); i++) {
               int temp = array[0];

               for (int j = 1; j < array.length; j++) {
                   array[j-1]=array[j];
               }
               array[array.length-1]=temp;
           }

       } else if(n<0) {
           for (int i = 0; i < Math.abs(n); i++) {
               int temp = array[array.length-1];

               for (int j = array.length-2; j >=0; j--) {
                   array[j+1]=array[j];
               }
               array[0]=temp;
           }

       }


    }



}
