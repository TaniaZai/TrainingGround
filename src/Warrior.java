public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Warrior " + name + " attack " + firstEnemy.getName() +"!");
        firstEnemy.takeDamage(35);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
