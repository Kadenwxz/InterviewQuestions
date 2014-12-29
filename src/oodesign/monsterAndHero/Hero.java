package oodesign.monsterAndHero;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Weapon weapon = null;
    
    public Hero(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }
    
    public Hero(String name){
        this.name = name;
    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public void shoot(Monster monster){
        int damage = weapon.hit();
        monster.decreaseHealth(damage);
    }
    
    public boolean hasWeapon(){
        return !(weapon == null);
    }
}
