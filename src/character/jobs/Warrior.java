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
        super.getStats().setStrength(3);
        super.getStats().setVitality(3);
        super.getStats().setAgility(3);
        super.getStats().setIntelligence(3);

        super.getStats().setMaxHp(3);

        super.getStats().setHp(getStats().getMaxHp());
    }
}
