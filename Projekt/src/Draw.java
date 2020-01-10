import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Draw {

    static Random r = new Random();
    static List<String> givenList = Arrays.asList("Marek", "Bartosz", "Robert", "Kacper");
    public static List<Losowanie> objectList = new ArrayList<Losowanie>();
    List<Losowanie> readFromFile = new ArrayList<Losowanie>();
    public static LocalDate myObj = LocalDate.now();

    private static void values(){
            LocalDate longTimeAgo = myObj.minusDays(99);
            for (int i = 0; i < 100; i++) {
                Losowanie los = new Losowanie();
                los.Losuj();
                los.date = longTimeAgo;
                los.day = longTimeAgo.getDayOfWeek();
                objectList.add(los);
                longTimeAgo = longTimeAgo.plusDays(1);
            }
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

    public static void read() {
        try {
            FileReader fileReader = new FileReader("PlikTekstowy.txt");
            BufferedReader bfReader = new BufferedReader(fileReader);
            bfReader.lines().forEach(System.out::println);
            bfReader.close();
        }
        catch (FileNotFoundException error) {
            System.err.println("Plik nie istnieje");
            }
            catch (IOException e) {
            System.err.println("Mamy obowiazek obsługi IOException");
            }


    }

    public static String NAME(){
//        try{
//            objectList.get(objectList.size()-1).name();
//        }
//        catch (IndexOutOfBoundsException error2){
//            System.err.println("Przekroczenie zakresu");
//        }
        if(!objectList.isEmpty()) {
            return objectList.get(objectList.size()-1).name();
        }
        else
             return "\n\r Przekroczenie zakresu, lista jest pusta";
    }






    public static void main(String[] args) throws IOException {

        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("Wybeirz co chcesz zrobic:");
        System.out.println("1. Wylosuj kogoś");
        System.out.println("2. Zapisz do pliku");
        System.out.println("3. Kto dzisiaj został wylosowany (odczyt z pliku)");
        System.out.println("4. Wylosuj ostatnie 100 dni");
        System.out.println("5. Jaki dziś dzień");
        System.out.println("6. Kto został najczęsciej wylosowany w ...");
        System.out.println("9. Exit");
        System.out.println("===========================================================");
        System.out.println("");



        Scanner scanner = new Scanner(System.in);

        pętla:     while (true) {

            int wybór = scanner.nextInt();
            switch (wybór) {
                case 1:
                    drawing();
                    System.out.println(" Wylosowano: " + NAME());
                    break;
                case 2:
                    write();
                    System.out.println("Pomyślnie zapisano");
                    break;
                case 3:
                    read();
                    System.out.println("Dzisiaj został wylosowany: " + NAME());
                    break;
                case 4:
                    values();
                    System.out.println("Pomyslnie przeprowadzono loswanie 100 ostatnich dni");
                    break;
                case 5:
                    System.out.println("Dzisiaj mamy: " + objectList.get(0).getDay());
                    break;
                case 6:
                    System.out.println("Najczęściej wylosowany w ...");
                    String dzień = scanner.next();
                    Statistics.statystykaNaJedenDzień(dzień);
                    break;
                case 9:
                    System.out.println("Do widzenia");
                    System.exit(0);
                    break;
                default:
                    System.exit(0);

            }
        }



    }
}
