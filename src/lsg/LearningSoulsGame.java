package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.weapons.Sword;

public class LearningSoulsGame {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.printStats();
        Monster monster1 = new Monster("Studentatort");
        monster1.printStats();
        Sword sword1 = new Sword();
        hero1.attackWith(sword1);
        System.out.println(sword1.toString());
        monster1.attackWith(sword1);
        System.out.println(sword1.toString());
    }
}
