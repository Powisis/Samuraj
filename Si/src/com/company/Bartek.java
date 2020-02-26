package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Bartek {

    public static void main(String[] args) throws IOException {
        System.out.println("Wynik: ");
        var arr = Algorytm2(1, 0.0001, 1000, 2);
        System.out.println("fmax: " + arr[0]);
        for (var i = 1; i < arr.length; i++)
            System.out.println("x" + i + ": " + arr[i]);
    }

    public static double[] Algorytm2(double T, double y, int M, int fin) throws IOException {
        var xmax = NextRandomArr(-2, 2, 2);
        var fmax = f(xmax);
        var excel = new ArrayList<String>();

        var fw = new FileWriter("D:\\si-2.txt");
        fw.flush();
        fw.append("Lp;Fmax" + ";" + "Xs1" + ";" + "Xs2" + ";" + "Xmax1" + ";" + "Xmax2" + "\r\n");

        for (var Conte = 1; Conte < M; Conte++) {
            var xk = new double[xmax.length];
            if (Conte == 1)
                xk = xmax;

            var xs = new double[xmax.length];

            var w = NextDouble(0, 1);
            if (w == 1.00)
                for (int i = 0; i < xs.length; i++)
                    xs[i] = xk[i] + y * NextDouble(0, 1);
            else
                for (int i = 0; i < xs.length; i++)
                    xs[i] = xk[i] - y * NextDouble(0, 1);

            if (f(xs) > fmax) {
                fmax = f(xs);
                xmax = xs;
                xk = xs;
            }

            else {
                var z = NextDouble(0, 1);
                if (z < Math.E * (- (f(xs) - f(xk)) / T)) {
                    fmax = f(xs);
                    xmax = xs;
                    xk = xs;
                }
            }

            fw.append(Conte + ";" + fmax + ";" + xs[0] + ";" + xs[1] + ";" + xmax[0] + ";" + xmax[1] + "\r\n");
        }

        var arr = new double[1 + xmax.length];
        for (var i = 1; i < arr.length; i++)
            arr[i] = xmax[i - 1];
        arr[0] = fmax;

        return arr;
    }

    private static double NextDouble(double min, double max) {
        if (min == -2 && max == 2)
            return -2 + 4 * new Random().nextDouble();

        if (min == 0 && max == 1)
            return  new Random().nextDouble();

        return Math.random() * ((max - min) + 1) + min;
    }

    private static double[] NextRandomArr(double min, double max, int size) {
        var arr = new double[size];
        for (var i = 0; i < size; i++)
            arr[i] = NextDouble(min, max);

        return arr;
    }

    private static double f(double[] x) {
        return - Math.pow(x[0], 2) - Math.pow(x[1], 2) + 2;
    }
}
