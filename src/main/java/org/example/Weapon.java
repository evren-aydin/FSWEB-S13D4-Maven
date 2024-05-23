package org.example;

public enum Weapon {
    SWORD(10, 1.2),
    AXE(15, 0.8),
    BOW(7, 1.5),
    DAGGER(5, 2.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
