package weapon;

public class Dagger extends Weapon {
    public Dagger() {
        super("Dagger");
    }

    public float strike(int attackType, int strength, int dexterity, int dexCost) {
        if (dexterity < dexCost) return 0;
        if (attackType == 1) return strength * 0.4f;
        else return strength * 0.3f;
    }
}
