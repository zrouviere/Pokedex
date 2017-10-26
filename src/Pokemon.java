public class Pokemon {
    public static String species;
    public static int attack;
    public static int defense;
    public static int speed;

    public Pokemon (String species){
        this.species = species;
        attack = species.length() * 4 + 2;
        defense = species.length() * 2 + 7;
        speed = species.length() * 3 + 5;

    }

    public static String getSpecies (){
        return species;
    }
    public static int getAttack(){
        return attack;
    }
    public static int getDefense(){
        return defense;
    }
    public static int getSpeed(){
        return speed;

    }
    public static void setSpecies(String s){
        species = s;
    }
    public static void setAttack(int x){
        attack= x;
    }
    public static void setDefense(int x){
        defense = x;
    }
    public static void setSpeed(int x){
        speed = x;
    }
    public void evolve(){
        speed = speed*2;
        attack= attack*3;
        defense = defense*5;
    }


}
