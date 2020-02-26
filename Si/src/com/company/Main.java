package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        algorytm1(M);

    }
    private static double metoda1(double a, double b) {
        double wynik = -Math.pow(a, 2) - Math.pow(b, 2) + 2;
        return wynik;
    }

    private static double losuj(){
        Random r = new Random();
        return -2 + 4 * r.nextDouble();
    }


    private static void algorytm1(int M) throws FileNotFoundException {
        double x1, x2;
        double wynik = 0;

        PrintWriter zapis = new PrintWriter("best_step.txt");
        PrintWriter zapisC = new PrintWriter("current.txt");
        for (int i = 0; i < M; i++) {
            double a =  losuj();
            double b =  losuj();
            double tymczasowa = metoda1(a,b);
            if (tymczasowa > wynik) {
                wynik = tymczasowa;
                x1 = a;
                x2 = b;
            }
            zapis.println(wynik);
            zapisC.println(tymczasowa);
        }
        zapis.close();
        zapisC.close();
        System.out.println(wynik);
    }
}
