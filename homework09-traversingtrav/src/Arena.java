/* Travis Crowell
SWEN-601
homework 09
09/22/2021
 */

/**
 * initiates class arena.
 */
public class Arena {
        public Pokemon PokemonOne;
        public Pokemon PokemonTwo;

        public Arena(Pokemon a1, Pokemon b2) {
                this.PokemonOne = a1;
                this.PokemonTwo = b2;
        }

        /**
         * prints starting descriptions of each participating Pokemon
         * runs a battle printing the results of each round,
         * until one or both Pokemon are knocked out.
         */
        public String battle(){
                System.out.println(PokemonOne);
                System.out.println(PokemonTwo);
                while (PokemonOne.conscious() & PokemonTwo.conscious()){
                        int ah = PokemonTwo.health;
                        int ad = PokemonTwo.damage(PokemonOne);
                        int remains = ah - ad;

                        System.out.println(PokemonOne.name + " damaged " + PokemonTwo.name + " " + ad + " points remaining health equals " + remains + " points");

                        int bh = PokemonOne.health;
                        int bd = PokemonOne.damage(PokemonTwo);
                        int bremains = bh - bd;
                        System.out.println(PokemonTwo.name + " damaged " + PokemonOne.name + " " + bd + " points remaining health equals " + bremains + " points");
                }
                if ((!PokemonOne.conscious()) & (!PokemonTwo.conscious())){
                        return "both pokemon are knocked out";
                }else if(!PokemonOne.conscious()){
                        return PokemonOne.name+" is knocked out";
                }else{
                        return PokemonTwo.name+" is knocked out";
                }
        }
}
