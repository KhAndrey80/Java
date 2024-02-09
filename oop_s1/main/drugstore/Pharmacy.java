package oop_s1.main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy>     {

    private String name;
    private List<Component> components;
    private int index;


    public Pharmacy(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.index = 0;
    }

// public void addComponents(Component ... components) {
//     for(Component c : components){
//         this.components.add(c);
//     }
// }
    public Pharmacy addComponent(Component item) {
        components.add(item);
        return this;
}

    public static int allPowers(Pharmacy pharmacy) {
        int result = 0;
        for (Component c : pharmacy.components) {
            result += c.getPower();
    }
        return result;
}

@Override
public boolean hasNext() {
    return index < components.size();
}

@Override
public Component next() {
    return components.get(index++);
}

 // прописываем в методе compareTo() - сравнение по сумме power компонентов
 @Override
 public int compareTo(Pharmacy p) {
     return Integer.compare(allPowers(this), allPowers(p));
 }

 @Override
 public String toString() {
     return String.format("Name: %s, components: %d", this.name, allPowers(this));
 }
}

