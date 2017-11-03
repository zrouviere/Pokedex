public class Pokemon {
    public String species;
    public int attack;
    public int defense;
    public int speed;

    public Pokemon (String species){
        this.species = species;
        attack = species.length() * 4 + 2;
        defense = species.length() * 2 + 7;
        speed = species.length() * 3 + 5;

    }
    public Pokemon (){
    }

    public String getSpecies (){
        return species;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }
    public int getSpeed(){
        return speed;

    }
    public void setSpecies(String s){
        species = s;
    }
    public void setAttack(int x){
        attack= x;
    }
    public void setDefense(int x){
        defense = x;
    }
    public void setSpeed(int x){
        speed = x;
    }
    public void evolve(){
        setSpeed(getSpeed()*2);
        setAttack(getAttack()*3);
        setDefense(getDefense()*5);
    }


}
