public class Vampire extends Enemy{

    public Vampire(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero firstHero) {
        System.out.println("Vampire attack!");
        firstHero.takeDamage(45);
        System.out.println("Health left after the attack " + firstHero.getHealth() +".");
    }
}
