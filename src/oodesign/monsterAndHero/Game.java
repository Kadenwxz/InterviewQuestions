package oodesign.monsterAndHero;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private Hero hero;
    private Map<String, Monster> monsters = new HashMap<>();
    
    /**
     * Create a Game with a hero and a list of Monster.
     * @param hero
     * @param monsters
     */
    public Game(Hero hero, Map<String, Monster> monsters){
        this.hero = hero;
        this.monsters = monsters;
    }
    
    /**
     * Create a Game with a hero and a monster.
     * @param hero
     * @param monster
     */
    public Game(Hero hero, Monster monster){
        this.hero = hero;
        this.monsters.put(monster.getName(), monster);
    }
    
    public Game(){}
    
    /**
     * Set hero to this game.
     * @param hero
     */
    public void setHero(Hero hero){
        this.hero = hero;
    }
    
    /**
     * Add monster to the monster list.
     * @param monster
     */
    public void addMonster(Monster monster){
        this.monsters.put(monster.getName(), monster);
    }
    
    /**
     * Hero encounter a monster
     * @param monsterName
     * @return
     */
    public Result encounter(String monsterName){
        if(!monsters.containsKey(monsterName)){
            return Result.Win;
        }
        if(!hero.hasWeapon())return Result.GameOver;
        Monster monster = monsters.get(monsterName);
        hero.shoot(monster);
        if(monster.getHealth() > 0){
            return Result.GameOver;
        }else{
            monsters.remove(monsterName);
            return Result.Win;
        }
    }
}
