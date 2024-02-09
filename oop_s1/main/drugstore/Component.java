package oop_s1.main.drugstore;

public abstract class Component implements Comparable<Component> {
    
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
    
        return String.format("Title =  %s, power = %s", this.title, this.power);
    }

    // @Override
    // public int compareTo(Component o) {

    //     // return Integer.compare(this power, o.power);
    //     if (this.power > o.power) {
    //         return 1;                   //если обратный порядок, то наоборот-1 и 1
    //     } else if (this.power < o.power) {
    //         return -1;
    //     }
    //     else return 0;
    // }

    @Override
    public int compareTo(Component component) {
        return Integer.compare(this.power, component.power);
    }
}



