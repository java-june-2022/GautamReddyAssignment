package Zookeeper;

public class Mammal{
    protected int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public Mammal(){
        this.energyLevel = 100;
    }

    public int displayEnergyLevel(){
        System.out.println("Energy Level is: " + this.energyLevel);
        return this.energyLevel;
    }
}