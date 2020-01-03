package Piate.Zadanko.Pierwsze;

public class Cat extends Animal{
    private int age = 5;
    private String color = "Grey";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("meow meow");
    }
}
