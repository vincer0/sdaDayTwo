package com.company;

import java.util.Scanner;

public class InstallmentsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Zadanie 5
         */
        System.out.println("Program obliczający wysokość rat");
        float installment;
        float rate;
        float interest;
        System.out.print("Podaj cenę towaru: (od 100zl do 100 000zl) ");
        float price = input.nextFloat();

        while ((price > 100_000) || (price < 100)) {
            System.out.println("Podales zla cene towaru, podaj inna: ");
            price = input.nextFloat();
        }

        System.out.println("Podaj ilość rat: (od 6 do 48)");
        int numberOfInstallments = input.nextInt();
        while ((numberOfInstallments > 48) || (price < 6)) {
            System.out.println("Podales zla ilosc rat, podaj inna ilosc: ");
            numberOfInstallments = input.nextInt();
        }
        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            rate = 2.5f;
        } else if (numberOfInstallments > 12 && numberOfInstallments <= 24) {
            rate = 5f;
        } else {
            rate = 10.0f;
        }
        System.out.println(String.format("Wybrales %d rat, oprocentowanie wynosi %.1f%%", numberOfInstallments, rate));
        interest = (price * rate) / 100;
        installment = price / numberOfInstallments + interest;
        System.out.println(String.format("Rata wynosi: %.2f", installment));
    }
}
