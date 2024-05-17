public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower){
        System.out.println("Герой c cуперспособностью");
        this.health=health;
        this.damage=damage;
        this.superpower=superpower;
    }

    public Hero(int health, int damage){
        System.out.println("Герой ");
        this.health=health;
        this.damage=damage;
        this.superpower="Не имеется суперсил";
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

