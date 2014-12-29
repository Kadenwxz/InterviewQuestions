package oodesign.monsterAndHero;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

    @Test
    public void test() {
        Hero hero = new Hero("Kaden");
        hero.setWeapon(new Weapon(1000));
        Game game = new Game();
        game.setHero(hero);
        game.addMonster(new Dragon(100, "Christ"));
        game.addMonster(new Slime(100, "Hoa"));
        assertEquals(game.encounter("Christ"), Result.Win);
        assertEquals(game.encounter("Hoa"), Result.Win);
    }

}
