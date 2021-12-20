package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args) {
        
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a+b;
        if (sum>10 && sum<=20) {
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegativePrint(int a) {
        if (a>=0)
            System.out.println("Число положтельное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean isPositiveOrNegativeReturn(int a) {
        if (a>=0)
            return false;
        else
            return true;
    }

    public static void printStringSeveralTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }

    }

    public static boolean isLeapYear (int year) {
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            return true;
        }
        else
            return false;
    }

}
