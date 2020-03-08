package Tutorial;

public class Warrior {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttKmax() {
        return attKmax;
    }

    public void setAttKmax(int attKmax) {
        this.attKmax = attKmax;
    }

    public int getBlockMax() {
        return blockMax;
    }

    public void setBlockMax(int blockMax) {
        this.blockMax = blockMax;
    }

    public String teleport(){
        return teleportType.teleport();
    }

    public void setTeleportAbility(Teleports newTeleportType) {
        teleportType = newTeleportType;
    }

    protected String name = "Warrior";
    public int health = 0;
    public int attKmax = 0;
    public int blockMax = 0;

    public Teleports teleportType;

    public Warrior(String name, int health, int attKmax, int blockMax){
        this.setName(name);
        this.health = health;
        this.attKmax = attKmax;
        this.blockMax = blockMax;
    }

    public int attack(){
        return (int)(Math.random() * attKmax );
    }

    public int block(){
        return (int)(Math.random() * blockMax);
    }




}
