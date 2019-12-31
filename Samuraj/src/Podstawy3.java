import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Podstawy3 {
    public static void main(String[] args) {

//        int a =8;
//        if(a<10){
//            System.out.println("a<10");
//            if(a==8)
//                System.out.println("a=8");
//        }
//        if (a==10) {
//         System.out.println("a=10");
//        }
//        if (a==9) {
//            System.out.println("a=9");
//        }
//        if (a==8) {
//            System.out.println("a=8");
//        }
//        else {
//            System.out.println("a>10");
//        }

        int b = 7;

        switch (b){
            case 1:
                System.out.println("b=1");
                break;
            case 2:
                System.out.println("b=2");
                break;
            case 3:
                System.out.println("b=3");
                break;
            case 4:
                System.out.println("b=4");
                break;
            case 5:
                System.out.println("b=5");
                break;
            default:
                System.out.println("default");
        }

        int c =10;
        int d;
        d = c < 10 ? -1 : 1;
        System.out.println(d);

        for(int i = 0; i<10; i++){
            System.out.print(i + " ");
            if(i == 5)
                break;
        }
        System.out.println(" ");

        for (int x = 0; x<10; x++){
            if(x%2==0) continue;
            System.out.print(x + " ");
        }
        System.out.println(" ");
        Scanner scanner =  new Scanner(System.in);

        String name;
        name = scanner.next();
        System.out.println(name);

        int liczba;
        liczba = scanner.nextInt();
        System.out.println(liczba);


    }
}

