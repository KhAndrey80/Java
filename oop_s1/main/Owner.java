package oop_s1.main;

public class Owner {

    String fullname;

    public Owner(String fullname) {
        this.fullname = fullname;
    }
    @Override
    public String toString() {
        return "Owner{" + "fullname'" + fullname + '\'' +  '}'; 
    }
}


