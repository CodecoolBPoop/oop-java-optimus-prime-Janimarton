package com.codecool;

public class Main {

    public static void main(String[] args) {
        int examinedInterval = 100;
        boolean[] primArray = new boolean[examinedInterval];

        for (int i = 2; i < (Math.sqrt(primArray.length) + 1); i++) {
            for (int j = i * i; j < examinedInterval; j = j + i) {
                primArray[j] = true;

            }
        }
        for (int i = 2; i < primArray.length; i++) if (!primArray[i]) System.out.print(i + "  ");

    }
}
