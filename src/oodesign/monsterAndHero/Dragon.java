package oodesign.monsterAndHero;

public class Dragon extends Monster {

    public Dragon(int health, String name){
        super(health, name);
    }
    
    private int level = 99;
    private int resist = 99;
    
    @Override
    public void decreaseHealth(int damage) {
        int dif = damage - resist;
        if(dif > 0){
            this.health -= dif;
        }
    }

}
