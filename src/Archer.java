public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Archer " + name + " attack " + firstEnemy.getName() + "!");
        firstEnemy.takeDamage(20);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
