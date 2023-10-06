package pl.gornik;

import pl.gornik.ksiazka.Ksiazka;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ksiazka> KsiazkaList = new ArrayList<>();
        Ksiazka ksiazka = new Ksiazka("Pan Tadeusz", "ksiąg", 70.00, 300, 1);
        System.out.println(ksiazka.wypiszInformacje());
        System.out.println(ksiazka.obliczKwote());

        Ksiazka ksiaz1;
        String name;
        String kategoria;
        int ilosc;
        double price;
        int sztuki;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj tytul ksiazki: ");
            name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Podaj kategorie księgi: ");
            kategoria = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Podaj cene: ");
            price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj ilosc stron: ");
            ilosc = scanner.nextInt();
            System.out.println("Podaj ilosc sztuk: ");
            sztuki = scanner.nextInt();
            ksiaz1 = new Ksiazka(name, kategoria, price, ilosc, sztuki);
            KsiazkaList.add(ksiaz1);
        }
        System.out.println(KsiazkaList);
    }
}