package com.thekadesikhaana.model;

/**
 * Created by ParmeshMahore on 2/7/17.
 */

public class NorthIndian {

    private String name;

    private MenuItems[] menuItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItems[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItems[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "ClassPojo [name = " + name + ", menuItems = " + menuItems + "]";
    }

}
