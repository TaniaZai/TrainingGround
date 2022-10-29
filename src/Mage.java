public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Mage " + name + " attack " + firstEnemy.getName() + "!");
        firstEnemy.takeDamage(15);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
