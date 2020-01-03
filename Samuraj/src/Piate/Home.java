package Piate;

public class Home {
    public static void main(String[] args) {
        Tv LG = new Tv();
        Tv Philips = new Tv(32, 1200, "sdfds");
        Tv Samsung = new Tv();

//        System.out.println( Philips.getCena() + " " + Philips.getSize() + " " + Philips.getName());
        System.out.println(Philips.toString());
//        System.out.println(LG.getName());

        Samsung.isOnOff();
        Samsung.setOnOff(true);
        Samsung.isOnOff();


        System.out.println(Samsung.toString());

        Dog Hugo = new Dog();
        Hugo.speak();
        Hugo.setSize(15);
        System.out.println(Hugo.getSize());
    }
}
