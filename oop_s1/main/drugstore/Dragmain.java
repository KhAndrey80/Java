package oop_s1.main.drugstore;

import java.util.*;

import oop_s1.main.drugstore.components.Azitronite;
import oop_s1.main.drugstore.components.Penicillin;
import oop_s1.main.drugstore.components.Water;

public class Dragmain {
   
    public static void main(String[] args) {
        
        // Component water = new Water("Water", 10D, 1);
        // Component azitronite = new Azitronite("Azitronite", 2D, 14);
        // Component penicillin = new Penicillin("Penicillin", 7D, 7);

        // Pharmacy2 p1 = new Pharmacy2();
        // p1.addComponents(water, azitronite);
        
        // Pharmacy2 p2 = new Pharmacy2();
        // p2.addComponents(water, penicillin);

        // Pharmacy2 p3 = new Pharmacy2();
        // p3.addComponents(azitronite, penicillin);

        // List<Component> components= new ArrayList<>(); 
        // components.add(water);
        // components.add(azitronite);
        // components.add(penicillin);

        // System.out.println(components);
        // Collections.sort(components, Comparator.reverseOrder()); //после запятой - для обратного порядка
        // System.out.println(components);

        // Iterator<Component> iterator = p1; 
        // while (iterator.hasNext()) {
        //     System.out.println(p1.next().toString());
        // } 
        
        // for (Component c : p2){
        //     System.out.println(c);
        // }
        Pharmacy analgin = new Pharmacy("analgin");
        Pharmacy baralgin = new Pharmacy("baralgin");
        Pharmacy citramon = new Pharmacy("citramon");

        analgin
                .addComponent(new Penicillin("Penicillin", 10D, 100))
                .addComponent(new Water("Water", 20D, 15))
                .addComponent(new Azitronite("Azitronite", 50D, 50));

        baralgin
                .addComponent(new Penicillin("PenicillinS", 5D, 80))
                .addComponent(new Water("Water", 10D, 10))
                .addComponent(new Azitronite("Azitronite", 3D, 300));
        citramon
                .addComponent(new Penicillin("PenicillinS", 25D, 120))
                .addComponent(new Water("Water", 30D, 25))
                .addComponent(new Azitronite("SAzitronite", 7D, 70));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(analgin);
        pharmacies.add(baralgin);
        pharmacies.add(citramon);

        for (Pharmacy p : pharmacies) {
            System.out.println(Pharmacy.allPowers(p));
        }
        System.out.println();

        // сортируем по сумме power компонентов
        Collections.sort(pharmacies);
        for (Pharmacy p : pharmacies) {
            System.out.println(Pharmacy.allPowers(p));
        }
    }
}    
 
    



