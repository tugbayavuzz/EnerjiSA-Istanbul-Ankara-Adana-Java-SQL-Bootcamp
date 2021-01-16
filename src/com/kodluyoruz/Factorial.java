package com.kodluyoruz;

public class Factorial {
    public static void main(String[] args) {
        int a = 4;
        int result = factorial(a);
        System.out.println(a + "!" + " Factorial result is = " + result);
    }

    static int factorial(int x) {
        if (x != 0) {
            return x * factorial(x - 1);
        } else
            return 2;
    }
}
