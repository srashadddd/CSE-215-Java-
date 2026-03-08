class RPGCharacter {
    private String name;
    private int level;
    private int healthPoints;

    // Default constructor
    RPGCharacter() {
        name = "NPC";
        level = 1;
        healthPoints = 10;
    }

    // Parameterized constructor
    RPGCharacter(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.healthPoints = hp;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public int getLevel() { return level; }
    public void setLevel(int l) { level = l; }
    public int getHealthPoints() { return healthPoints; }
    public void setHealthPoints(int hp) { healthPoints = hp; }
}

// Knight subclass
class Knight extends RPGCharacter {
    private int defensePoints;

    Knight(String name, int level, int hp, int defense) {
        super(name, level, hp); // call parent constructor
        this.defensePoints = defense;
    }

    public int getDefensePoints() { return defensePoints; }
    public void setDefensePoints(int d) { defensePoints = d; }

    public void blockAttack() {
        System.out.println(getName() + " has blocked an attack!");
    }

    public void boostDefense() {
        defensePoints += 10;
        System.out.println("Defense Boost successful for " + getName());
    }
}

public class Lab9Classwork {
    public static void main(String[] args) {
        Knight k1 = new Knight("Arthur", 5, 50, 20);
        Knight k2 = new Knight("Lancelot", 6, 60, 25);

        k1.blockAttack();
        k2.boostDefense();
    }
}
