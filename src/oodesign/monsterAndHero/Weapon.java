package oodesign.monsterAndHero;

public class Weapon {
    
    int damage;
    
    public Weapon(int damage){
        this.damage = damage;
    }
    
    public int hit(){
        return damage;
    }
}
