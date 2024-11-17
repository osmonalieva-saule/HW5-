class Hero {
    private int health;
    private int damage;
    private String superPower;


    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "None"; // Значение по умолчанию
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}


class Boss {
    private int health;  // Здоровье
    private int damage;  // Урон
    private String defenseType;  // Тип защиты


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем свойства
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Shield");


        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", SuperPower: " + hero.getSuperPower());
        }
    }

    
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 30, "Fireball");
        Hero hero2 = new Hero(250, 20);
        Hero hero3 = new Hero(400, 40, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }
}