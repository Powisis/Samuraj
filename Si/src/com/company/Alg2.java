package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Alg2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Podaj liczbe iteracji: ");
        int M = scanner.nextInt();

        double[] arr = algorytm2(M);
        System.out.println("fmax: " + arr[0]);
        for (int i = 1; i < arr.length; i++)
            System.out.println("x" + i + ": " + arr[i]);
    }

    private static double[] algorytm2(int M) throws IOException {
        double w;
        double o = rand();
        double[] Xmax = NextRandomArr(-2, 2, 2);
        double Fmax = function(Xmax);

        System.out.println("Podaj T:");
        double T = scanner.nextDouble();
        System.out.println("Podaj y:");
        double y = scanner.nextDouble();

        PrintWriter zapis = new PrintWriter("2.1.txt");
        PrintWriter zapisC = new PrintWriter("2.2.txt");

        System.out.println(M);

        for (int k = 0; k < M; k++) {
            double[] Xk = new double[Xmax.length];
            double[] Xsr = new double[Xmax.length];

            if(k == 1)
                Xk = Xmax;

            w = rand();
            if (w == 1.00){
                for (int i = 0; i < Xsr.length; i++)
                    Xsr[i] = Xk[i] + y*rand();
            }
            else
                for (int i = 0; i < Xsr.length; i++)
                    Xsr[i] = Xk[i] + y*rand();


            if(function(Xsr) > Fmax){
                Fmax = function(Xsr);
                Xmax =  Xsr;
                Xk = Xsr;
            }
            else {
                double Z = rand();
                if (Z < Math.E * (- (function(Xsr) - function(Xk)) / T)) {

//                    if (Z < Math.pow(Math.E, -(function(Xsr) - function(Xk))/T)){
                    Fmax = function(Xsr);
                    Xmax =  Xsr;
                    Xk = Xsr;
                }
            }
            zapis.println(Fmax);
            zapisC.println(Xsr[0]);

        }
        zapis.close();
        zapisC.close();


        double[] arr = new double[1 + Xmax.length];
        for (int i = 1; i < arr.length; i++)
            arr[i] = Xmax[i - 1];
        arr[0] = Fmax;

        return arr;
    }


    private static double function(double[] a) {
        double wynik = -Math.pow(a[0], 2) - Math.pow(a[1], 2) + 2;
        return wynik;
    }

    private static double[] NextRandomArr(double min, double max, int size) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = losuj();
        }
        return arr;
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
