package Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Zad2 {

    public static void main(String[] args) throws IOException {
        //Określamy dla ilu zmiennych ma być wyliczona funkcja
        int variables = 10;

        //Tutaj jeszcze przygotowujemy plik dla Excela
        ArrayList<String> list = new ArrayList<String>();
        String textHeader = "lp;temp;best";
        for (int i = 1; i <= variables; i++) {
            textHeader += ";x" + i;
        }
        list.add(textHeader);

        //Tutaj już liczymy
        double best = 0.00;
        for (int i = 0; i < 500; i++) {
            //Generujemy tyle zmiennych ile określiliśmy na początku metody
            ArrayList<BinaryNumber> variableList = new ArrayList<BinaryNumber>();
            for (int c = 0; c < variables; c++)
                variableList.add(new BinaryNumber(-5.21, 5.21, 3));

            var temp = mathFunction(variableList);
            if (temp > best || i == 0)
                best = temp;

            //Teraz generujemy wiersz dla Excela
            String excelLine = (i + 1) + ";" + temp + ";" + best;
            for (BinaryNumber e : variableList)
                excelLine += ";" + e.getDouble();

            list.add(excelLine);
        }

        FileWriter fw = new FileWriter("D:\\Programy Java\\Si\\src\\Lab2\\lab2alg2.txt");
        fw.flush();
        for (String s : list) {
            fw.append(s + "\r\n");
        }
        fw.close();

        System.out.println("\r\n\r\nPomyślnie zakończono wykonywanie algorytmu z zadania 2");

    }



    public static double mathFunction(ArrayList<BinaryNumber> binaryNumbers) {
        //Zmienne z odgórnie narzuconymi wartościami
        double A = 10.00;
        double n = 10.00;

        double result = A * n;
        for (BinaryNumber e : binaryNumbers)
            result += Math.pow(e.getDouble(), 2.00) - A * Math.cos(Math.toRadians(2 * Math.PI * e.getDouble()));

        return result;
    }
}
