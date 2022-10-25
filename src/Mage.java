public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Mage " + name + " attack Enemy!");
        firstEnemy.takeDamage(15);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
