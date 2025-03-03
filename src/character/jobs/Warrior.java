package character.jobs;

import character.Character;

public class Warrior extends Character {
    public Warrior(String name){
        super(name);
        super.setJob("Guerrier");
    }
    public void attack(){
    }
    public void baseStats(){
        super.getStats().setAtk(3);
        super.getStats().setAgi(3);
        super.getStats().setDef(3);
        super.getStats().setSpd(3);
        super.getStats().setIntel(3);

        super.getStats().setMaxHp(3);
        super.getStats().setMaxMana(3);

        super.getStats().setHp(getStats().getMaxHp());
        super.getStats().setMana(getStats().getMaxMana());

    }
}
