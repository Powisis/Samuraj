package Tutorial;

import java.util.Random;

public class DodgeWarrior extends Warrior{

    double dodgePercent;
    Random rand = new Random();

    public DodgeWarrior(String name, int health, int attKmax, int blockMax, double dodgePercent){
        super(name, health, attKmax, blockMax);
        this.dodgePercent = dodgePercent;

        teleportType = new CanTeleport();
    }

    public int block(){
        double chance = rand.nextDouble();
        if(chance <= dodgePercent){
            System.out.printf("%s Dodged the Attack\n\n", this.getName());
            return 10000;
        }
        else {
            return (int)(Math.random() * blockMax);
        }
    }

}
