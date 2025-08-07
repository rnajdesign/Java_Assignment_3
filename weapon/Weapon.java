package weapon;

public abstract class Weapon {
    private String type;

    public Weapon(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract float strike(int attackType, int strength, int dexterity, int dexCost);
}
