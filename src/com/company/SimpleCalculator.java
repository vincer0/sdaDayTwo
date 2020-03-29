package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        /**
         * Zadanie 6
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Program wykonuje podstawowe obliczenia matematyczne...");

        char enter;

        do {
            System.out.println("Podaj pierwszą liczbę");
            float firstNumber = input.nextFloat();

            System.out.println("Podaj symbol operacji matematycznej: (+, -, *, /)");
            char operator = input.next().charAt(0);

            float secondNumber;
            float result = 0;

            switch (operator) {
                case '+':
                    System.out.println("Podaj druga liczbe: ");
                    secondNumber = input.nextFloat();
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    System.out.println("Podaj druga liczbe: ");
                    secondNumber = input.nextFloat();
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    System.out.println("Podaj druga liczbe: ");
                    secondNumber = input.nextFloat();
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    System.out.println("Podaj druga liczbe: ");
                    secondNumber = input.nextFloat();
                    while (secondNumber == 0) {
                        System.out.println("Podales 0 nie wolno dzielic przez zero podaj inna liczbe");
                        secondNumber = input.nextFloat();
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Podales zly operator! Koncze");
                    return;
            }
            System.out.println("Wynik: " + result);
            System.out.println("Czy chcesz kontynuować? T/N");
            enter = input.next().charAt(0);
        } while (enter != 'n');
    }
}
