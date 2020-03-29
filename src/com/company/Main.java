package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj dwie kolejne wartosci liczbowe");
        int variableOne = input.nextInt();
        int variableTwo = input.nextInt();

        boolean isEqual = variableOne == variableTwo;
        System.out.println(String.format("%d > %d: %s", variableOne, variableTwo, isEqual));

        boolean isNotEqual = variableOne != variableTwo;
        System.out.println(String.format("%d > %d: %s", variableOne, variableTwo, isNotEqual));

        boolean isBiggerThanTwo = variableOne > variableTwo;
        System.out.println(String.format("%d > %d: %s", variableOne, variableTwo, isBiggerThanTwo));

        boolean isLessOrEqualToOne = variableTwo <= variableOne;
        System.out.println(String.format("%d > %d: %s", variableOne, variableTwo, isLessOrEqualToOne));


    }
}
