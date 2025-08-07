package armour;

public abstract class Armour {
    private final String type;
    private int protectionAmount;
    private int dexCost;

    public Armour(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getProtectionAmount() {
        return protectionAmount;
    }

    public int getDexCost() {
        return dexCost;
    }

    public void setProtectionAmount(int protectionAmount) {
        this.protectionAmount = protectionAmount;
    }

    public void setDexCost(int dexCost) {
        this.dexCost = dexCost;
    }
}
