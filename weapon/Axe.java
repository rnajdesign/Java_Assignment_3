package weapon;

public class Axe extends Weapon {
    public Axe() {
        super("Axe");
    }

    public float strike(int attackType, int strength, int dexterity, int dexCost) {
        if (dexterity < dexCost) return 0;
        if (attackType == 1) return strength * 0.6f;
        else return strength * 0.4f;
    }
}
