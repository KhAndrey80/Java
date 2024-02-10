package oop_s4.impl;

import oop_s4.GBlist;

public class Main {
    
    public static void main(String[] args) {
        GBlist<Integer> list = new GBArrayList<>();

    list.add(3);
    list.add(5);
    list.add(6);
    System.out.println(list);
    System.out.println(list.get(1));
    list.remove(2);
    System.out.println(list);
    System.out.println(list.size()); 





        
}
}