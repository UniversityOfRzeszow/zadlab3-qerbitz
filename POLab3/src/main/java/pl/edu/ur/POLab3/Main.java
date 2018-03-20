/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Krzysztof Plesniak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int fiborek(int fib) {
        if (fib == 1) {
            return 1;
        }
        if (fib == 2) {
            return 1;
        } else {
            return fiborek(fib - 2) + fiborek(fib - 1);
        }
    }

    public static int potegaiter(int a, int b) {
        int wynik = 1;
        if (b == 0) {
            return 1;
        }
        for (int i = 0; i < b; i++) {
            wynik *= a;
        }
        return wynik;
    }

    public static int potegarek(int a, int b) {
        int wynik = 1;
        if (b == 0) {
            return 1;
        } else {
            return a * potegarek(a, --b);
        }
    }

    public static void zadanie1() {   //1.4
        System.out.println("Podaj liczbe: ");
        Scanner wczytaj = new Scanner(System.in);
        int liczba = wczytaj.nextInt();

        int przesuniecie = 5;

        liczba = liczba << przesuniecie;
        System.out.println("<<: " + liczba);

        liczba = liczba >> przesuniecie;
        System.out.println(">>: " + liczba);

        liczba = liczba >>> przesuniecie;
        System.out.println(">>>: " + liczba);

    }

    public static void zadanie2() {                 //1.7
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj wartość logiczną(true/false) X: ");
        boolean x = wczytaj.nextBoolean();
        System.out.println("Podaj wartość logiczną(true/false) Y: ");
        boolean y = wczytaj.nextBoolean();
        System.out.println("NOT   !X= " + (!x));
        System.out.println("NOT   !Y= " + (!y));
        System.out.println("XOR    X^Y= " + (x ^ y));
        System.out.println("XOR    Y^X= " + (y ^ x));

    }

    public static void zadanie3() {

        String slowo1 = "Hello";
        String slowo2 = "World";
        String slowo3 = "Programowanie";
        String slowo4 = "Obiektowe";
        Boolean a = true;
        Boolean b = false;
        int xdd=15;
            

        System.out.println(slowo1.toCharArray());       //kopiuje lancuch jako tablice char

        System.out.println(slowo1.getBytes());          //zamienia na tablice bajtow

        System.out.println(slowo1.equals(slowo2));      //porownuje dwa stringi

        System.out.println(slowo1.equalsIgnoreCase(slowo2));   //porownuje pomijajac wielkosc znakow

        System.out.println(slowo1.compareTo(slowo2));  //porownuje ciag znakow do innego

        System.out.println(slowo1.indexOf('o'));            //zwraca indeks pierwszego wystapienia obiektu

        System.out.println(slowo1.lastIndexOf('o'));        //zwraca indeks ostatniego wystapienia obiektu

        System.out.println(slowo3.substring(3));        //zwraca czesc ciagu znaku od podanego indeksu startowego

        System.out.println(slowo3.substring(1, 4));    //zwraca czesc ciagu znaku od podanego indeksu startowego do koncowego

        System.out.println(slowo3.replace('o', 'k'));   //zamienia podana litere na inna

        System.out.println(slowo2.trim());              //usuwa biale znaki

        System.out.println(slowo2.toLowerCase());       //zamienia na male litery

        System.out.println(slowo2.toUpperCase());       //zamienia na duze litery
    }

    public static void main(String[] args) {

        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        Scanner wczytaj = new Scanner(System.in);

        System.out.println("Podaj nr zadania 1-5: ");
        int wybor = wczytaj.nextInt();
        switch (wybor) {
            case 1:
                zadanie1();
                break;

            case 2:
                zadanie2();
                break;

            case 3:
                zadanie3();
                break;

            case 4:
                int wynik3a = potegaiter(2, 5);        //3.3
                System.out.println("Iteracyjnie potega: " + wynik3a);        //3.3
                int wynik3b = potegarek(2, 5);         //3.3
                System.out.println("Rekurencyjnie potega: " + wynik3b);        //3.3
                break;
            case 5:
                int n = wczytaj.nextInt();        //3.4
                int wynik = fiborek(n);           //3.4
                System.out.println(wynik);      //3.4
                break;
        }

    }

}
