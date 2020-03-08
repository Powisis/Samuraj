package Tutorial;

public class Battle {

    public static void  startFight(Warrior w1, Warrior w2) throws InterruptedException {

        while(true){
            if(getAttackResult(w1, w2).equals("Game over")){
                System.out.println("Game over");
                break;
            }

            if(getAttackResult(w2, w1).equals("Game over")){
                System.out.println("Game over");
                break;
            }
        }
    }

    public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {

        int wAAttkAmt = wA.attack();
        int wBBlockAmt = wB.block();

        int dmg2War2 = wAAttkAmt - wBBlockAmt;
        if (dmg2War2 > 0){
            wB.health = wB.health - dmg2War2;
        }
        else dmg2War2 = 0;

        System.out.printf("%s Attacks %s and deals " + "%d Damge\n", wA.getName(), wB.getName(), dmg2War2);

        System.out.printf("%s Has %d Health\n\n", wB.getName(), wB.health);
//        System.out.println(wB.getName() + " Has " + wB.health + " health");

        Thread.sleep(1500);

        if(wB.health <= 0){
            System.out.printf("%s has Died and %s is Victorious\n", wB.getName(), wA.getName());
            return "Game over";
        }
        else return "Fight again";
    }
}
