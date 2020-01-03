package Piate;

public class Tv {

    private int size = 10;
    private int cena = 1000;
    private String name = "default";
    private boolean onOff;


    public Tv(){

    }

    public int getSize() {
        return size;
    }

    public int getCena() {
        return cena;
    }

    public String getName() {
        return name;
    }

    public String isOnOff() {
        if(onOff){
            return "Telewizor jest włączony";
        }
        else
            return "Telewizor jest wyłaczony";
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public Tv(int aSize, int cena, String name){
        size = aSize;
        this.cena = cena;
        this.name = name;
    }

    @Override
    public String toString() {
        return cena + " " + size + " " + name + " " + isOnOff();
    }


}
