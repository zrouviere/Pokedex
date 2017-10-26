import java.util.*;
public class Pokedex {
    public static Pokemon [] index;

    public Pokedex(int size){
        index  = new Pokemon[size];

    }
    public static String [] listPokemon(){
        String [] list = new String[findEmpty()+1];
        for (int i = 0; i < list.length; i++){
            list [i] = index [i].getSpecies();
        }
        return list;
    }
    public boolean addPokemon(String species){
        if (findEmpty()== -1)
            return false;
        else {
            index [findEmpty()] = new Pokemon (species);
            return true;
        }

    }

    public static int findEmpty(){
        //returns the location of the first empty slot in the array
        for (int i = 0; i < index.length; i++){
            if (index [i] == null)
                return i;
        }
        return -1;


    }
    public int [] checkStats(String species){
        int [] stats = new int [3];
        for (Pokemon x : index){
           if (x.getSpecies().equals(species)) {
               stats [0] = x.getAttack();
               stats [1] = x.getDefense();
               stats [2] = x.getSpeed();
               break;
           }
        }
        return stats;
    }
    public void sortPokedex(){
        Pokemon temp  = new Pokemon("temp");

        for (int i = 0; i < index.length; i++)
        {
            for (int j = i + 1; j < index.length; j++)
            { //FIX THIS
                if (index[i].getSpecies().compareTo(index[j].getSpecies())>0)
                {
                    temp = index[i];
                    index[i] = index[j];
                    index[j] = temp;
                }
            }
        }
    }
    public boolean evolvePokemon (String species){
        for (Pokemon x : index){
            if (x.getSpecies().equals(species) ){
                x.evolve();
                return true;
            }

        }
        return false;


    }


}
