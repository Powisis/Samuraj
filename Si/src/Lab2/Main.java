package Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj zakres minimalny");
        int min = scanner.nextInt();
        System.out.println("Podaj zakres maxymalny");
        int max = scanner.nextInt();
        System.out.println("Podaj ile ma być liczb po przecinku");
        int liczbyPoPrzecinku  = scanner.nextInt();

        ArrayList<String> list = new ArrayList<String>();
        list.add("lp;temp;best;x1;x2");
        double najlepsza = 0.00;
        for(int i=0; i < 500; i++) {
            BinaryNumber x1 = new BinaryNumber(min, max, liczbyPoPrzecinku);
            System.out.println("");
            BinaryNumber x2 = new BinaryNumber(min, max, liczbyPoPrzecinku);


            double tymczasowa = mathFunction(x1 , x2);
            if(tymczasowa > najlepsza || i == 0)
                najlepsza = tymczasowa;
            list.add((i + 1) + ";" + tymczasowa + ";" + najlepsza + ";" + x1.getDouble() + ";" + x2.getDouble());
        }
        FileWriter fw = new FileWriter("D:\\Programy Java\\Si\\src\\Lab2\\lab2alg1.txt");
        fw.flush();
        for (var s : list)
            fw.append(s + "\r\n");
        fw.close();

        System.out.println("\r\n\r\nPomyślnie wykonywano pierwszy algorytm");
    }


    private static double mathFunction(BinaryNumber x1, BinaryNumber x2) {
        return - Math.pow(x1.getDouble(), 2.00) - Math.pow(x2.getDouble(), 2.00) + 2;
    }

}
