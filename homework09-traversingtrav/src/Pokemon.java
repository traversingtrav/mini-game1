/* Travis Crowell
SWEN-601
homework 09
09/22/2021
 */

/**
 * initiates class Pokemon with four fields name, type, attack, and health
 */
public class Pokemon {
    protected String name;
    protected String type;
    protected int attack;
    protected int health;

    /**
     * initiates the constructors for the Pokemon class
     */
    public Pokemon(String name,String type,int attack,int health){
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
    }

    /**
     * calculates and returns damage done in a Pokemon battle.
     */
    public int damage(Pokemon a) {
        String T = a.type;
        int b = a.attack;
        if (T.equals("fire")) {
            fire defend = new fire(name,type,attack,health, b);
            b = defend.fire_damage();
        } else if (T.equals("grass")) {
            grass defend = new grass(name,type,attack,health, b);
            b = defend.grass_damage();
        } else if (T.equals("water")) {
            water defend = new water(name,type,attack,health, b);
            b = defend.water_damage();
        }
        int h = health;
        this.health = h - b;
        return b;
        }

    /**
     * tests if a pokemon is still conscious.
     */
    public boolean conscious() {
        boolean concious = true;
        if (health > 0) {
            return concious;
        } else {
            concious = false;
            return concious;
        }
    }

    /**
     * returns a string describing an instance of Pokemon.
     */
    @Override
    public String toString() {
        return "Pokemon "+name+ " is type "+type+ " has an attack of "+attack +" and a health of "+ health;

        }

    }


