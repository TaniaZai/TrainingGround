public abstract class Enemy implements Mortal {
    public int health;
    public String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        if(health < 0){
            health = 0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int takeDamage(int damage){
        return health -= damage;
    }

    @Override
    public boolean isAlive() {
        if(getHealth() > 0){
            return true;
        }
        return false;
    }

    public void isAliveRes(boolean isAlive) {
        if(isAlive == true){
            System.out.println("Oh no! The enemy is still alive.");
        }
        else{
            System.out.println("Oh no! Zombie resurrected.");
        }
    }

    public abstract void attackHero(Hero firstHero);
}
