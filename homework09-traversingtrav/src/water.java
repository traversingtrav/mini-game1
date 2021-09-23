/* Travis Crowell
SWEN-601
homework 09
09/22/2021
 */

/**
 * initiates child class water under parent class Pokemon.
 */
public class water extends Pokemon {
    private int Attacker_attack;

    /**
     * initiates parent class constructors along with attackers attack.
     */
    public water(String name,String type,int attack, int health,int b) {
        super(name,type,attack,health);
        this.Attacker_attack = b;
    }

    /**
     * calculates and returns damage if attacker is water type.
     */
    public int water_damage() {
        if (type.equals("grass")) {
            Attacker_attack = (Attacker_attack / 2);
        } else if (type.equals("fire")) {
            Attacker_attack = (Attacker_attack * 2);
        }
        return Attacker_attack;
    }
}
