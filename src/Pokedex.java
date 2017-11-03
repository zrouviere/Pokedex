import java.util.*;
public class Pokedex {
    public static ArrayList<Pokemon> index = new ArrayList<Pokemon>();
    public final int SIZE;

    public Pokedex(int size){

      SIZE= size;

    }
    public static String [] listPokemon(){
        String [] list = new String[index.size()];
        for (int i = 0; i < list.length; i++){
            list [i] = index.get(i).getSpecies();
        }
        return list;
    }
    public boolean addPokemon(String species){

            if (index.size() >= SIZE)
                return false;

            for (int i = 0; i < index.size(); i++){
                if(species.equalsIgnoreCase(index.get(i).getSpecies())){
                    System.out.println("DUPLICATE");
                    return false;
                }}

                Pokemon fake = new Pokemon (species);

            index.add(fake);
            return true;


    }

    public int [] checkStats(String species){
        int [] stats = new int [3];

        for (Pokemon x : index){
           if (x.getSpecies().equalsIgnoreCase(species)) {
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

       /* for (int i = 0; i < index.length; i++)
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
        }*/
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
    public static int arraySize(){
        return index.size();
    }




}
