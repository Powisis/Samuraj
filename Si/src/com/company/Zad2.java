package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Podaj liczbe iteracji: ");
        int M = scanner.nextInt();
        algorytm2(M);
    }


    private static void algorytm2(int M) throws FileNotFoundException {
        double x1, x2 = 0;
        double Xk = 0, w, Xsr = 0;
        double o = rand();
        double wynik = 0;
        double temp = 0;
        double tempXk = 0;
        System.out.println("Podaj T:");
        double T = scanner.nextDouble();
        System.out.println("Podaj y:");
        double y = scanner.nextDouble();
        PrintWriter zapis = new PrintWriter("2.1.txt");
        PrintWriter zapisC = new PrintWriter("2.2.txt");
        for (int i = 0; i < M; i++) {
            double a =  losuj();
            double b =  losuj();
            double tymczasowa = metoda(a,b);
            if(i == 1){
                Xk = tymczasowa;
                w = losuj();
                if (w == 1){
                    Xsr = Xk + y*o;
                }
                else
                    Xsr = Xk - y*o;
            }
            temp = metoda2(Xsr);
            tempXk = metoda2(Xk);
            if(temp > wynik){
                wynik = temp;
                x2 =  Xsr;
                Xk = Xsr;
            }
            else {
                double Z = rand();
                if (Z < Math.pow(Math.E, -(wynik - tempXk)/T)){
                    wynik = temp;
                    x2 =  Xsr;
                    Xk = Xsr;
                }
            }
            zapis.println(wynik);
            zapisC.println(tymczasowa);
        }
        zapis.close();
        zapisC.close();
        System.out.println(wynik);
//        System.out.println(x2);
    }
    private static double metoda(double a, double b) {
        double wynik = -Math.pow(a, 2) - Math.pow(b, 2) + 2;
        return wynik;
    }

    private static double metoda2(double a) {
        double wynik = -Math.pow(a, 2) - Math.pow(a, 2) + 2;
        return wynik;
    }

    private static double losuj(){
        Random r = new Random();
        return -2 + 4 * r.nextDouble();
    }

    private static double rand(){
        Random r = new Random();
        return r.nextDouble();
    }

}
