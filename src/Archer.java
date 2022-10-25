public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy firstEnemy) {
        System.out.println("Archer " + name + " attack Enemy!");
        firstEnemy.takeDamage(20);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}
