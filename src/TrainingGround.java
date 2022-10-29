public class TrainingGround {
    public static void main(String[] args) {
        Zombie firstZombie = new Zombie(100, "Loki");
        Warrior firstWarrior = new Warrior("Stefan", 100);
        firstWarrior.attackEnemy(firstZombie);
        Archer secondHero = new Archer("Smith", 150);
        secondHero.attackEnemy(firstZombie);
        Mage thirdHero = new Mage("Halk", 100);
        thirdHero.attackEnemy(firstZombie);
        firstZombie.isAliveRes(firstZombie.isAlive());
    }
}