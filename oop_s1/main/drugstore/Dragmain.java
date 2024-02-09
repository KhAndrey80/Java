package oop_s1.main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import oop_s1.main.drugstore.components.Azitronite;
import oop_s1.main.drugstore.components.Penicillin;
import oop_s1.main.drugstore.components.Water;

public class Dragmain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 7D, 7);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);
        
        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(water, penicillin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        List<Component> components= new ArrayList<>(); 
        components.add(water);
        components.add(azitronite);
        components.add(penicillin);

        System.out.println(components);
        Collections.sort(components, Comparator.reverseOrder()); //после запятой - для обратного порядка
        System.out.println(components);

        // Iterator<Component> iterator = p1; 
        // while (iterator.hasNext()) {
        //     System.out.println(p1.next().toString());
        // } 
        
        // for (Component c : p2){
        //     System.out.println(c);
        // }
        } 
    }



