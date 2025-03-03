package character.jobs;

import character.Character;

public class Thief extends Character {
    public Thief(String name){
        super(name);
        super.setJob("Voleur");
    }
    public void attack(){
        System.out.println("attack!");
    }

}
