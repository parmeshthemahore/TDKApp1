package com.thekadesikhaana.model;

/**
 * Created by ParmeshMahore on 2/7/17.
 */

public class FoodType {

    private Bengali Bengali;

    public Bengali getBengali() {
        return Bengali;
    }

    public void setBengali(Bengali Bengali) {
        this.Bengali = Bengali;
    }

    @Override
    public String toString() {
        return "FoodType [Bengali = " + Bengali + "]";
    }
}
