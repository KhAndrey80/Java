package oop_s4;

public interface GBlist <T> extends Iterable<T> {
    void add(T elem);
    void remove(int index);
    T get(int index);  
    int size();






}
