
public class Podstawy2 {

    public static void main(String[] args) {
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

//        for(int i=0;i<tab.length;i++)
//        System.out.println(tab[i]);
//
//        for(int x : tab)
//            System.out.print(x + " ");

//        int n=10;
//        while(n>0){
//            System.out.println("cokolwiek " + n);
//            n--;
//        }
//
//
//        do{
//            System.out.println("tekst po do");
//            n++;
//        }
//        while(n<5);{
//            System.out.println("koniec");
//        }

        int table[][] = {{2,3,4}, {5,6,7}};
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                System.out.println(table[i][j]);
            }
        }

    }
}
