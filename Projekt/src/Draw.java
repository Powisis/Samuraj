import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class Draw {

    static Random r = new Random();
    static List<String> givenList = Arrays.asList("Marek", "Bartosz", "Robert", "Kacper");
    public static List<Losowanie> objectList = new ArrayList<Losowanie>();
    List<Losowanie> readFromFile = new ArrayList<Losowanie>();
    static LocalDate myObj = LocalDate.now();

    private static void values(){
        Losowanie first = new Losowanie();
        first.drawID = 0;
        first.userID = 0;
        first.day = myObj.getDayOfWeek();
        objectList.add(first);
    }

    public static int draw() {
        int randomIndex = r.nextInt(givenList.size());
        String randomElement = givenList.get(randomIndex);
        return randomIndex;
    }

    public static void drawing(){
        Losowanie los = new Losowanie();
        los.Losuj();
        objectList.add(los);
    }

    public static void write() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("PlikTekstowy.txt");
        for (Losowanie x: objectList){
            zapis.println(x.pobierzJSON());
        }
        zapis.close();
    }

    public static void read() throws IOException {
        FileReader fileReader = new FileReader("PlikTekstowy.txt");
        String text = "";
        while (true){
            int znak = fileReader.read();
            if(znak > 0)
                text+= (char) znak;
            else
                break;;
        }
        fileReader.close();

        List<String> linie = Arrays.asList(text.split("\r\n"));
        System.out.println(text);
        objectList = new ArrayList<Losowanie>();
        Gson gson = new Gson();
        for(String s: linie){
            objectList.add(gson.fromJson(s, Losowanie.class));
        }
    }





    public static void main(String[] args) throws IOException {

        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("Wybeirz co chcesz zrobic");
        System.out.println("1. Wylosuj kogoś");
        System.out.println("2. Zapisz do pliku");
        System.out.println("3. Kto dzisiaj został wylosowany(odczyt z pliku)");
        System.out.println("4. Jaki dziś dzień");
        System.out.println("5. Kto został najczęsciej wylosowany w ...");
        System.out.println("9. Exit");
        System.out.println("===========================================================");
        System.out.println("");

//        values();

//        Losowanie los1 = new Losowanie();
//        los1.Losuj();
//        objectList.add(los1);
//        System.out.println(los1.name());


        /* TO CO ZAPISUJE SIĘ DO PLIKU
        System.out.println(los.name());
        System.out.println(los.pobierzJSON());


        System.out.println(los1.name());
        System.out.println(los1.pobierzJSON());
*/


        Scanner scanner = new Scanner(System.in);

        pętla:     while (true) {

            int wybór = scanner.nextInt();
            switch (wybór) {
                case 1:
                    drawing();
                    System.out.println(" Wylosowano: "+ objectList.get(0).name());
                    break;
                case 2:
                    write();
                    System.out.println("Pomyślnie zapisano");
                    break;
                case 3:
                    read();
                    System.out.println("Dzisiaj został wylosowany: "+ objectList.get(0).name());
                    break;
                case 4:
                    System.out.println("Dzisiaj mamy: " + objectList.get(0).getDay());
                    break;
                case 9:
                    System.out.println("Do widzenia");
                    break;
                default:
                    break;

//                break pętla;
            }
        }



    }
}
