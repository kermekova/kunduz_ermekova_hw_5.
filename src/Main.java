public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenseType("Physical");

        System.out.println("Количество жизней босса: " + boss.getHealth());
        System.out.println("Количество урона босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", " +
                    "Damage: " + hero.getDamage() + ", Superpower: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 20, "Fire");
        Hero hero2 = new Hero(240, 30, "Ice");
        Hero hero3 = new Hero(180, 15 );
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}