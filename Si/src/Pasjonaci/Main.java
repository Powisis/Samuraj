package Pasjonaci;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Trasa> Trasy;

    public static void main(String[] args) throws IOException {
        Trasy = new ArrayList<Trasa>();
        var lines = Files.readAllLines(new File("D:\\Pobrane\\lpg.txt").toPath());
        lines.remove(0);
        for (var i = 0; i< lines.size(); i++){
            var dane = lines.get(i).split("\\t");

            if(i == 0 )
                Trasy.add(new Trasa(dane[0],dane[1], 45.00,30.00));
            else
                Trasy.add(new Trasa(dane[0],dane[1], Trasy.get(i - 1).pb95 , Trasy.get(i - 1).lpg));
        }
        Zadanie1();
        Zadanie2();
    }

    private static void Zadanie1(){
        System.out.println("Zadanie 1 ");
        System.out.println("Tankowań Pb95: " + Trasa.tankowalPb95);
        System.out.println("Tankowań LPG: " + Trasa.tankowalLPG);

        var ile_razy = 0;
        for(var t: Trasy)
            if(t.tylkoLPG)
                ile_razy++;


        System.out.println("Dni w których używał tylko LPG " + ile_razy);
    }

    private static void Zadanie2(){
        for(var i =0; i<Trasy.size();i++)
            if(Trasy.get(i).lpg < 5.25){
                System.out.println("Wynik: " + Trasy.get(i).data);
                break;
            }
    }


}
