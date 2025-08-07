package weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    public float strike(int attackType, int strength, int dexterity, int dexCost) {
        if (dexterity < dexCost) return 0;
        if (attackType == 1) return strength * 0.5f;
        else return strength * 0.35f;
    }
}
