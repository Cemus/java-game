package character.jobs;

import character.Character;

public class Mage extends Character {
    public Mage(String name){
        super(name);
        super.setJob("Mage");
    }
    public void attack(){
        System.out.println("attack!");
    }

}
