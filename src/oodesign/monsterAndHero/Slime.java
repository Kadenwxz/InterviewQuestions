package oodesign.monsterAndHero;

public class Slime extends Monster{
    
    public Slime(int health, String name){
        super(health, name);
    }
    
    @Override
    public void decreaseHealth(int damage){
        if(damage > 0){
            damage = Integer.MAX_VALUE;
        }
        this.health -= damage;
    }
}
