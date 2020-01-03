package Piate;

public class Animal extends Home{

    private int size;
    public void speak(){
        System.out.println("noise");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
