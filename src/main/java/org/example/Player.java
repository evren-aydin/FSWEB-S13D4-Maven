package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;



    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        if(healthPercentage>100){
            healthPercentage=100;
        }
        if(healthPercentage<0){
            healthPercentage=0;
        }
        this.healthPercentage=healthPercentage;

    }
public int healthRemaining(){
        return healthPercentage;
}

    public void loseHealth(int damage){
        this.healthPercentage -= damage;

        if (this.healthPercentage <= 0) {
            this.healthPercentage = 0; // Sağlık 0'ın altına düşmemeli
            System.out.println(name + " player has been knocked out of game");
        }
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        if(healthPercentage>100){
            healthPercentage=100;
        }
    }

}
