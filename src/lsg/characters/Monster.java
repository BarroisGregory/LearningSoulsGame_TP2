package lsg.characters;

public class Monster extends Character {

    private static int INSTANCES_COUNT=0;

    //constructeurs
    public Monster(){
        super(10,10,"Monster_"+ INSTANCES_COUNT);
        INSTANCES_COUNT ++;
    }

    public Monster(String name){
        super(10,10,name);
        INSTANCES_COUNT ++;
    }

}
