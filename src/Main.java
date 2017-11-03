import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        println("Welcome to your new PokeDex!");

        int size=0;
        while (true) {

            println("How many Pokemon are in you region:");
            try {
                size = scan.nextInt();
                if (size <1){

                    System.out.println("Invalid Input");
                    println("Please enter a positive integer");
                    println("");
                    continue;
                }
            }
            catch (Exception e){
                System.out.println("Invalid Input");
                println("Please enter a positive integer");
                println("");
                scan.next();
                continue;
            }
                break;
        }
        Pokedex pokedex = new Pokedex(size);

        System.out.println("Your new Pokedex can hold " + size + " Pokemon. Let's start using it!");
        boolean loop = true;
        Scanner scan2 = new Scanner(System.in);
        while (loop) {

            println("1. List Pokemon");
            println("2. Add Pokemon");
            println("3. Check a Pokemon's Stats");
            println("4. Evolve Pokemon");
            println("5. Sort Pokemon");
            println("6. Exit");
            println("");
            println("What would you like to do?");

            String choice = scan2.nextLine();
            Integer result;
            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")||choice.equals("5")||choice.equals("6"))
                result = Integer.valueOf(choice);
            else {
                result = 7;
            }
            switch (result){
                case 1:
                        if(pokedex.arraySize() == 0){
                            println("There are no Pokemon in your Pokedex!");
                            break;
                        }
                        for(int i = 0; i < pokedex.listPokemon().length; i ++){

                                int temp = i +1;
                                System.out.print(temp+". ");
                                System.out.println((pokedex.listPokemon())[i]);

                        }
                        println("");
                        break;

                case 2: if(pokedex.arraySize() == size) {
                            println("MAX");
                            println("");
                            break;

                        }
                        println("Please enter the Pokemon's Species:");
                        String pokemon = scan2.nextLine();
                        pokedex.addPokemon(pokemon);

                        break;


                case 3: println("Please enter the Pokemon of interest: ");
                        String toGetStat = scan2.nextLine();
                      if (pokedex.checkStats(toGetStat)[0]==0){
                          println("Pokemon not found");
                          println("");
                          break;
                      }

                            System.out.println("Attack: " + pokedex.checkStats(toGetStat)[0]);
                    System.out.println("Defense: " + pokedex.checkStats(toGetStat)[1]);
                    System.out.println("Speed: " + pokedex.checkStats(toGetStat)[2]);
                    println("");
                        break;

                case 4:

                case 5:

                case 6: System.exit(0);

                default: println("Invalid Input");
                         println("");
                        break;
            }


        }
    }

    public static void println (String s){
        System.out.println(s);
    }
}
