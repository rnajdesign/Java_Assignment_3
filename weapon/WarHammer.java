package weapon;

public class WarHammer extends Weapon {
    public WarHammer() {
        super("War Hammer");
    }

    public float strike(int attackType, int strength, int dexterity, int dexCost) {
        if (dexterity < dexCost) return 0;
        if (attackType == 1) return strength * 0.65f;
        else return strength * 0.5f;
    }
}
