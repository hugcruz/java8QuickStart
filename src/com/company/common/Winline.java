package com.company.common;

/**
 * Created by hcruz on 15/07/16.
 */
public class Winline {
    private String description;
    private int number;
    private int multiplier;
    private boolean selectable;

    public Winline(String description, int number, int multiplier, boolean selectable){
        this.description = description;
        this.number = number;
        this.multiplier = multiplier;
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return description + ": " + number + " : x" + multiplier + " : selectable? " + selectable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMultiplier() {
        System.out.println("Called get multiplier");
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }
}
