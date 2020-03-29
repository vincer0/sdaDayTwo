package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Witaj, wybierz temat rozmowy z konsultantem");
        int opcja = input.nextInt();

        switch (opcja) {
            case 1:
                System.out.println("Nowa oferta operatora");
                break;
            case 2:
                System.out.println("Obsługa biezacego rachunku");
                break;
            case 3:
                System.out.println("Usługi dodatkowe");
                break;
            case 4:
                System.out.println("Reklamacje");
                break;
            case 9:
                System.out.println("Kontakt bezposrednio z konsultantem");
                break;
            default:
                System.out.println("Błędna opcja, wybierz inną");
        }
    }
}
