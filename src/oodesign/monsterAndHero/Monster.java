package oodesign.monsterAndHero;

public abstract class Monster {
    
    protected int health;
    protected String name;
    protected int level;
    protected int resist;
    
    public Monster(int health, String name){
        this.health = health;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void decreaseHealth(int damage);
    
    public int getHealth(){
        return health;
    }
    
    public boolean isDead(){
        return health <= 0;
    }
    
}
