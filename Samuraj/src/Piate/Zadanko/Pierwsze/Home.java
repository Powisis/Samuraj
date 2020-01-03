package Piate.Zadanko.Pierwsze;

public class Home {
    public static void main(String[] args) {
        Cat Tuptuś = new Cat();

        System.out.println(Tuptuś.getSpecies());
        Tuptuś.setSpecies("Brytyjski");
        System.out.println(Tuptuś.getSpecies());

        Tuptuś.speak();
        System.out.println(Tuptuś.getAge());
    }
}
