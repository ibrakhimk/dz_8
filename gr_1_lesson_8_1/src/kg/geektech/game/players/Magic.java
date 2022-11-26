package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficientM = RPG_Game.random.nextInt(5)+2;
        boss.setHealth(boss.getHealth()-(coefficientM * this.getDamage()));
        System.out.println(" Magic use " + coefficientM);
    }
}
