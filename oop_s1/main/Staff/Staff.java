package oop_s1.main.Staff;

import java.time.LocalDate;

public abstract class Staff {
    protected String name;
    protected int birthYear;

    public Staff(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Сотрудник: %s, %s, %d", this.getType(), name, birthYear);
    }
}