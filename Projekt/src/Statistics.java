import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Statistics extends Draw{

    public static int Marek = 0;
    public static int Bartosz = 0;
    public static int Robert = 0;
    public static int Kacper = 0;


    static File file = new File("D:\\Programy Java\\Projekt\\PlikTekstowy.txt");
    static ArrayList<String[]> arrayOfPeople = new ArrayList<>();
    static ArrayList<String[]> arrayOfTimes = new ArrayList<>();

    public static void dailyStatisticsMonday(){
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(","); //returns the array of srings computed by splitting this string around matches of the given delimtiter
                arrayOfPeople.add(personData);
            }

            for(int i = 0; i< arrayOfPeople.size(); i++){
                String[] personData = arrayOfPeople.get(i);

                if(personData[0].contains("0") && personData[5].contains("MONDAY"))
                    Marek +=1;
                if(personData[0].contains("1") && personData[5].contains("MONDAY"))
                    Bartosz +=1;
                if(personData[0].contains("2") && personData[5].contains("MONDAY"))
                    Robert +=1;
                if(personData[0].contains("3") && personData[5].contains("MONDAY"))
                    Kacper +=1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }

//            System.out.println(maxNumber);
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            if (maxNumber == Kacper)
                System.out.println("Kacper, " + Kacper + " razy");

        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }



    public static void dailyStatisticsTuesday(){
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String num = input.nextLine();
                    String[] personData = num.split(",");
                    arrayOfPeople.add(personData);
                }

                for(int i = 0; i< arrayOfPeople.size(); i++){
                    String[] personData = arrayOfPeople.get(i);

                    if(personData[0].contains("0") && personData[5].contains("TUESDAY"))
                        Marek +=1;
                    if(personData[0].contains("1") && personData[5].contains("TUESDAY"))
                        Bartosz +=1;
                    if(personData[0].contains("2") && personData[5].contains("TUESDAY"))
                        Robert +=1;
                    if(personData[0].contains("3") && personData[5].contains("TUESDAY"))
                        Kacper +=1;
                }

                int[] number = {Marek, Bartosz, Robert, Kacper};
                int maxNumber = 0;
                for(int i=0; i<number.length; i++){
                    if(maxNumber<number[i])
                        maxNumber=number[i];
                }
                if (maxNumber == Marek)
                    System.out.println("Marek, " + Marek + " razy");
                else if (maxNumber == Bartosz)
                    System.out.println("Bartosz,  " + Bartosz + " razy");
                else if (maxNumber == Robert)
                    System.out.println("Robert, " + Robert + " razy");
                else
                    System.out.println("Kacper, " + Kacper + " razy");

            } catch (FileNotFoundException e) {
                System.err.format("File Does Not Exist\n");
            }
        }

    public static void dailyStatisticsWenesday() {
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfPeople.add(personData);
            }

            for (int i = 0; i < arrayOfPeople.size(); i++) {
                String[] personData = arrayOfPeople.get(i);

                if (personData[0].contains("0") && personData[5].contains("WEDNESDAY"))
                    Marek += 1;
                if (personData[0].contains("1") && personData[5].contains("WEDNESDAY"))
                    Bartosz += 1;
                if (personData[0].contains("2") && personData[5].contains("WEDNESDAY"))
                    Robert += 1;
                if (personData[0].contains("3") && personData[5].contains("WEDNESDAY"))
                    Kacper += 1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            else if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            else if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            else
                System.out.println("Kacper, " + Kacper + " razy");

        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }

    public static void dailyStatisticsThursday(){
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfPeople.add(personData);
            }

            for(int i = 0; i< arrayOfPeople.size(); i++){
                String[] personData = arrayOfPeople.get(i);

                if(personData[0].contains("0") && personData[5].contains("THURSDAY"))
                    Marek +=1;
                if(personData[0].contains("1") && personData[5].contains("THURSDAY"))
                    Bartosz +=1;
                if(personData[0].contains("2") && personData[5].contains("THURSDAY"))
                    Robert +=1;
                if(personData[0].contains("3") && personData[5].contains("THURSDAY"))
                    Kacper +=1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            else if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            else if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            else
                System.out.println("Kacper, " + Kacper + " razy");

        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }

    public static void dailyStatisticsFriday(){
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfPeople.add(personData);
            }

            for(int i = 0; i< arrayOfPeople.size(); i++){
                String[] personData = arrayOfPeople.get(i);

                if(personData[0].contains("0") && personData[5].contains("FRIDAY"))
                    Marek +=1;
                if(personData[0].contains("1") && personData[5].contains("FRIDAY"))
                    Bartosz +=1;
                if(personData[0].contains("2") && personData[5].contains("FRIDAY"))
                    Robert +=1;
                if(personData[0].contains("3") && personData[5].contains("FRIDAY"))
                    Kacper +=1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            else if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            else if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            else
                System.out.println("Kacper, " + Kacper + " razy");

        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }

    public static void dailyStatisticsSaturday(){
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfPeople.add(personData);
            }

            for(int i = 0; i< arrayOfPeople.size(); i++){
                String[] personData = arrayOfPeople.get(i);

                if(personData[0].contains("0") && personData[5].contains("SATURDAY"))
                    Marek +=1;
                if(personData[0].contains("1") && personData[5].contains("SATURDAY"))
                    Bartosz +=1;
                if(personData[0].contains("2") && personData[5].contains("SATURDAY"))
                    Robert +=1;
                if(personData[0].contains("3") && personData[5].contains("SATURDAY"))
                    Kacper +=1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            else if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            else if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            else
                System.out.println("Kacper, " + Kacper + " razy");
        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }

    public static void dailyStatisticsSunday(){
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfPeople.add(personData);
            }

            for(int i = 0; i< arrayOfPeople.size(); i++){
                String[] personData = arrayOfPeople.get(i);

                if(personData[0].contains("0") && personData[5].contains("SUNDAY"))
                    Marek +=1;
                if(personData[0].contains("1") && personData[5].contains("SUNDAY"))
                    Bartosz +=1;
                if(personData[0].contains("2") && personData[5].contains("SUNDAY"))
                    Robert +=1;
                if(personData[0].contains("3") && personData[5].contains("SUNDAY"))
                    Kacper +=1;
            }

            int[] number = {Marek, Bartosz, Robert, Kacper};
            int maxNumber = 0;
            for(int i=0; i<number.length; i++){
                if(maxNumber<number[i])
                    maxNumber=number[i];
            }
            if (maxNumber == Marek)
                System.out.println("Marek, " + Marek + " razy");
            else if (maxNumber == Bartosz)
                System.out.println("Bartosz,  " + Bartosz + " razy");
            else if (maxNumber == Robert)
                System.out.println("Robert, " + Robert + " razy");
            else
                System.out.println("Kacper, " + Kacper + " razy");

        } catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }
    }






    public static void howManyTimes(){

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine();
                String[] personData = num.split(",");
                arrayOfTimes.add(personData);
            }

        }
        catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist\n");
        }


        int a = 0 ;
        int b = 0;
        int c = 0;
        int d = 0;

        for(int i = 0; i< arrayOfTimes.size(); i++){
            String[] personData = arrayOfTimes.get(i);
            if(personData[0].contains("0"))
                a +=1;
            if(personData[0].contains("1"))
                b +=1;
            if(personData[0].contains("2"))
                c +=1;
            if(personData[0].contains("3"))
                d +=1;
        }
        System.out.println("Marek został wylosowany: " + a + " razy");
        System.out.println("Bartosz został wylosowany: " + b + " razy");
        System.out.println("Robert został wylosowany: " + c + " razy");
        System.out.println("Kacper został wylosowany: " + d + " razy");

    }

    public static void statystykaNaJedenDzień(String dzień){
        switch (dzień){
            case "poniedziałek":
                System.out.println("Najczęściej wylosowany w poniedziałek  był: ");
                dailyStatisticsMonday();
                break;
            case "wtorek":
                System.out.println("Najczęściej wylosowany we wtorek był: ");
                dailyStatisticsTuesday();
                break;
            case "środa":
                System.out.println("Najczęściej wylosowany w środę był: ");
                dailyStatisticsWenesday();
                break;
            case "czwartek":
                System.out.println("Najczęściej wylosowany w środę był: ");
                dailyStatisticsThursday();
                break;
            case "piątek":
                System.out.println("Najczęściej wylosowany w piątek był: ");
                dailyStatisticsFriday();
                break;
            case "sobota":
                System.out.println("Najczęściej wylosowany w sobotę był: ");
                dailyStatisticsSaturday();
                break;
            case "niedziela":
                System.out.println("Najczęściej wylosowany w niedzielę był: ");
                dailyStatisticsSunday();
                break;
            case "default":
                System.exit(0);

        }
    }
}


