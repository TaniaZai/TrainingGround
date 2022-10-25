public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Warrior " + name + " attack Enemy!");
        firstEnemy.takeDamage(35);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
