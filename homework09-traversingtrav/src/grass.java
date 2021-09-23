/* Travis Crowell
SWEN-601
homework 09
09/22/2021
 */
/**
 * initiates parent class constructors along with attackers attack.
 */
public class grass extends Pokemon {
    private int Attacker_attack;

    /**
     * initiates parent class constructors along with attackers attack.
     */
    public grass(String name,String type,int attack, int health,int b) {
        super(name,type,attack,health);
        this.Attacker_attack = b;
    }

    /**
     * calculates and returns damage if attacker is grass type.
     */
    public int grass_damage() {
        if (type.equals("fire")) {
            Attacker_attack = (Attacker_attack / 2);
        } else if (type.equals("water")) {
            Attacker_attack = (Attacker_attack * 2);
        }
        return Attacker_attack;
    }
}
