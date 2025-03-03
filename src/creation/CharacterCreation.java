package creation;

import character.Character;
import character.jobs.Mage;
import character.jobs.Thief;
import character.jobs.Warrior;
import utils.Visuals;

import java.util.Scanner;

public class CharacterCreation {
    public static void thief(Scanner scanner, String name){
        System.out.println("###############");
        System.out.println("#  T H I E F  #");
        System.out.println("###############");
        System.out.println("Il est fourbe.");
        System.out.println("1/ Suivant");
        System.out.println("2/ Sélectionner le voleur");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            warrior(scanner, name);
        }else{
            final Thief thief = new Thief(name);
            confirmJob(scanner, thief);
        }
    }
    public static void mage(Scanner scanner, String name){
        System.out.println("#############");
        System.out.println("#  M A G E  #");
        System.out.println("#############");
        System.out.println("Il est intelligent.");
        System.out.println("1/ Suivant");
        System.out.println("2/ Sélectionner le mage");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            thief(scanner, name);
        }else{
            final Mage mage = new Mage(name);
            confirmJob(scanner, mage);
        }
    }
    public static void warrior(Scanner scanner, String name){
        System.out.println("#####################");
        System.out.println("#  G U E R R I E R  #");
        System.out.println("#####################");
        System.out.println("Frappe fort");
        System.out.println("1/ Suivant");
        System.out.println("2/ Sélectionner le guerrier");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            mage(scanner, name);
        }else{
            final Warrior warrior = new Warrior(name);
            confirmJob(scanner, warrior);
        }
    }
    public static void chooseJob(Scanner scanner, String name){
        Visuals.clearScreen();

        System.out.println("Veuillez sélectionner votre classe :");
        warrior(scanner, name);
    }
    public static void nameCharacter(Scanner scanner){
        Visuals.clearScreen();

        System.out.println("Veuillez choisir un nom pour votre personnage :");

        String name = scanner.next();
        scanner.nextLine();

        System.out.println("Votre personnage s'appelle \""+ Visuals.ANSI_GREEN +  name + Visuals.ANSI_RESET + "\" ?");
        System.out.println("1/ Confirmer");
        System.out.println("2/ Annuler");

        int confirm = scanner.nextInt();
        scanner.nextLine();

        if (confirm == 2){
            nameCharacter(scanner);
        }else{
            chooseJob(scanner, name);
        }
    }
    public static void confirmJob(Scanner scanner, Character character){
        Visuals.clearScreen();

        System.out.println("Confirmez vous la création du " + character.getJob().toLowerCase() + " " + character.getName() + " ?");
        System.out.println("1/ Confirmer");
        System.out.println("2/ Annuler");

        int confirm = scanner.nextInt();
        scanner.nextLine();

        if (confirm == 1){
            System.out.println("ok");
        }else{
            nameCharacter(scanner);
        }
    }
}
