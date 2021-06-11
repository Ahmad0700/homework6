package com.company;

public class Player {
    int Health = 200;
    int Damage = 30;
    int SuperAttack = Damage + 40;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getSuperAttack() {
        return SuperAttack;
    }

    public void setSuperAttack(int superAttack) {
        SuperAttack = superAttack;
    }
}
