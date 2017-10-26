import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        println("Welcome to your new PokeDex!");

        int size=0;
        while (size == 0) {

            println("How many Pokemon are in you region:");
            try {
                size = scan.nextInt();
                if (size <1){
                    size = 0;
                    System.out.println("Invalid Input");
                    println("Please enter a positive integer");
                    println("");
                }
            }
            catch (Exception e){
                System.out.println("Invalid Input");
                println("Please enter a positive integer");
                println("");
                scan.next();
                size = 0;
            }

        }
        Pokedex pokedex = new Pokedex(size);

        System.out.println("Your new Pokedex can hold " + size + " Pokemon. Let's start using it!");
        boolean loop = true;
        while (loop) {

            println("1. List Pokemon");
            println("2. Add Pokemon");
            println("3. Check a Pokemon's Stats");
            println("4. Evolve Pokemon");
            println("5. Sort Pokemon");
            println("6. Exit");
            println("");
            println("What would you like to do?");
            scan.next();
            String choice = scan.nextLine();
            Integer result;
            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")||choice.equals("5")||choice.equals("6"))
                result = Integer.valueOf(choice);
            else {
                result = 7;
            }
            switch (result){
                case 1: String [] x = pokedex.listPokemon();
                        if(pokedex.findEmpty()== 0){
                            println("There are no Pokemon in your Pokedex!");
                            break;
                        }
                        for(String y : x){
                            System.out.print(y);
                        }
                        break;

                case 2: if(pokedex.findEmpty() == -1) {
                            println("There are no open slots in the Pokedex!");
                            break;

                        }
                        println("Please enter the Pokemon's Species:");
                        String pokemon = scan.nextLine();
                        pokedex.addPokemon(pokemon);

                        break;


                case 3:

                case 4:

                case 5:

                case 6: System.exit(0);

                default: println("Invalid Input");
                        break;
            }


        }
    }

    public static void println (String s){
        System.out.println(s);
    }
}
