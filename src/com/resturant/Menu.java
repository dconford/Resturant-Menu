package com.resturant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    //private ArrayList<Object> appetrizers;
    //private ArrayList<Object> entrees;
    //private ArrayList<Object> desserts;
    //private boolean isItemNew;
    //private date currentDate;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu Items\n" + menuItems ;
    }
}
