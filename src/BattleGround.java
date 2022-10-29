public class BattleGround {
    public static void main(String[] args) {
        Warrior firstWarrior = new Warrior("Jack", 100);
        Zombie firstZombie = new Zombie(250, "Stefan");
        Vampire firstVampire = new Vampire(300, "Lexi");
        System.out.println("-".repeat(35));
        firstWarrior.attackEnemy(firstZombie);
        firstWarrior.attackEnemy(firstZombie);
        firstWarrior.attackEnemy(firstVampire);
        System.out.println("-".repeat(35));
        firstZombie.isAliveRes(firstZombie.isAlive());
        firstVampire.isAliveRes(firstVampire.isAlive());
        System.out.println("-".repeat(35));
        firstVampire.attackHero(firstWarrior);
        firstZombie.attackHero(firstWarrior);
        System.out.println("-".repeat(35));
        firstWarrior.isAliveRes(firstWarrior.isAlive());
        System.out.println("-".repeat(35));
    }
}
