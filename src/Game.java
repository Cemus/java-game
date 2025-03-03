import creation.CharacterCreation;
import utils.Visuals;

import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CharacterCreation.nameCharacter(scanner);
    }
}
