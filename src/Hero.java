public class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy firstEnemy) {
        System.out.println(name + " attack Enemy!");
        firstEnemy.takeDamage(25);
        System.out.println("Health left after the attack " + firstEnemy.getHealth() +".");
    }
}