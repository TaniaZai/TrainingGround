public class Zombie extends Enemy{

    public Zombie(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero firstHero) {
        System.out.println("Zombie attack!");
        firstHero.takeDamage(60);
        System.out.println("Health left after the attack " + firstHero.getHealth() +".");
    }
}