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
        //char[] toCharArray()
        //byte[] getBytes()
        //boolean equals(String str)
        //boolean equalsIgnoreCase(String str)
        //int campareTo(String str)
        //int campareToIgnoreCase(String str)
        //int indexOf(int i)
        //int indexOf(String str)
        //int lastIndexOf(int i)
        //int lastIndexOf(String str)
        //String substring(int startString)
        //String substring(int startString, int stopString)
        //String replace(char orginal, char zamiennik)
        //String trim()
        //String toLowerCase()
        //String toUpperCase()
        //String[] split(String regex, int limit)
        //String[] split(String regex)
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
