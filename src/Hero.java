public abstract class Hero {
    public String name;
    public int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public int getHealth(){
        if(health < 0){
            health = 0;
        }
        return health;
    }

    public abstract void attackEnemy(Enemy firstEnemy);

    public int takeDamage(int damage){
        return health -= damage;
    }

    public boolean isAlive() {
        if(getHealth() > 0){
            return true;
        }
        return false;
    }

    public void isAliveRes(boolean isAlive){
        if(isAlive == true){
            System.out.println("Wow! The hero is alive.");
        }
        else{
            System.out.println("Oh no! The hero is dead.");
        }
    }

}