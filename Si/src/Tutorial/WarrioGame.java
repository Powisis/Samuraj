package Tutorial;

public class WarrioGame {

    public static void main(String[] args) throws InterruptedException {

        Warrior Thor = new Warrior("Thor",800,130, 40);
        Warrior Loki = new DodgeWarrior("Loki",800,80, 40,.25);

        Battle.startFight(Thor,Loki);

        System.out.println("Loki " + Loki.teleport());
        Loki.setTeleportAbility((new CantTeleport()));
        System.out.println("Loki " + Loki.teleport());

    }
}
