package lsg.characters;

import static java.lang.String.format;

public class Character {
    private String name;
    private int life, maxLife, stamina, maxStamina;

    //accesseurs

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getStamina() {
        return stamina;
    }


    protected void setName(String name) {
        this.name = name;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public Character(){}

    public Character(int val1, int val2, String name){
        this.name = name;
        life = val1;
        maxLife= val1;
        stamina = val2;
        maxStamina = val2;
    }

    //toString
    @Override
    public String toString() {
        String str1= format("%5d",life);
        String str2= format("%5d",stamina);
        return (format("%-20s %-20s LIFE:%-10s STAMINA:%-10s", "[ "+getClass().getSimpleName()+" ]", name, str1, str2)+ ((this.isAlive())? "(ALIVE)" :"(DEAD)"));
    }

    //methodes
    public void printStats(){
        System.out.println(this.toString());
    }

    public boolean isAlive(){
        return(this.getLife()>0);
    }

}
