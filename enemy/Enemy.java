package enemy;

import warrior.*;
import weapon.*;
import armour.*;

public class Enemy {
    private Warrior warrior;
    private Weapon weapon;
    private Armour armour;

    public Enemy() {
        this.warrior = new Orc();
        this.weapon = new WarHammer();
        this.armour = new Chainmail();
    }

    public float attack(Warrior player, Armour playerArmour) {
        // Random attack type: 1 (normal) or 2 (heavy)
        int attackType = (int)(Math.random() * 2) + 1;

        // Calculate raw damage from weapon strike method
        float rawDamage = weapon.strike(
            attackType,
            warrior.getStrength(),
            warrior.getDexterity(),
            playerArmour.getDexCost()
        );

        // Reduce damage by player's armour protection %
        float damageAfterArmor = rawDamage * (1 - (playerArmour.getProtectionAmount() / 100.0f));

        // Ensure minimum damage of 1 if damage > 0
        if (damageAfterArmor > 0 && damageAfterArmor < 1) {
            damageAfterArmor = 1;
        }

        return damageAfterArmor;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }
}
