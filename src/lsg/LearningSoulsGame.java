package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;

public class LearningSoulsGame {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.printStats();
        Monster monster1 = new Monster("Studentatort");
        monster1.printStats();
        Monster monster2 = new Monster();
        monster2.printStats();
        Monster monster3 = new Monster();
        monster3.printStats();
    }
}
