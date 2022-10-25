public class TrainingGround {
    public static void main(String[] args) {
        Enemy firstEnemy = new Enemy(150);
        System.out.println("Enemy health: " + firstEnemy.getHealth() + ".");
        Hero firstHero = new Hero("Lordi");
        firstHero.attackEnemy(firstEnemy);
        Warrior firstWarrior = new Warrior("Stefan");
        firstWarrior.attackEnemy(firstEnemy);
        Archer secondHero = new Archer("Smith");
        secondHero.attackEnemy(firstEnemy);
        Mage thirdHero = new Mage("Halk");
        thirdHero.attackEnemy(firstEnemy);
    }
}