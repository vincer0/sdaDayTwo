package com.company;

import java.util.Scanner;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aString = "";

        System.out.println("Podaj dwie kolejne wartosci liczbowe");
        int variableOne = input.nextInt();
        int variableTwo = input.nextInt();

        boolean isEqual = variableOne == variableTwo;
        aString = String.format("%d == %d: %s", variableOne, variableTwo, isEqual);
        System.out.println(aString);

        boolean isNotEqual = variableOne != variableTwo;
        aString = String.format("%d != %d: %s", variableOne, variableTwo, isNotEqual);
        System.out.println(aString);

        boolean isBiggerThanTwo = variableOne > variableTwo;
        aString = String.format("%d > %d: %s", variableOne, variableTwo, isBiggerThanTwo);
        System.out.println(aString);

        boolean isLessOrEqualToOne = variableTwo <= variableOne;
        aString = String.format("%d <= %d: %s", variableOne, variableTwo, isLessOrEqualToOne);
        System.out.println(aString);


    }
}
