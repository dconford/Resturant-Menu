package com.resturant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    //LocalDate date = LocalDate.now();

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));

        Menu myMenu = new Menu();

        ArrayList<MenuItem> myMenuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Chicken Wings", "A Baker's Dozen (13) of Jumbo Wings: 13 Styles of Sauce", "appetizers", 8.99, new Date());
        myMenuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Chicken Breast Wrap", "Wrap (your choice) with Lightly Seasoned Herb Chicken Breast, Rice, Fresh Greens, Aioli-Ginger Mayo", "entrees", 7.99, new Date());
        myMenuItems.add(menuItem2);

        MenuItem menuItem3 = new MenuItem(3, "Shwarma Wrap", "Traditional Lamb/Beef Mix, Thinly Sliced, with Tomato, Onions, Tzadiki Sauce, served on warm pita", "entrees", 8.99, new Date());
        myMenuItems.add(menuItem3);

        MenuItem menuItem4 = new MenuItem(4, "Chocolate Brownie", "Dessert Awaits, Chocolate Brownie with extra Fudge. Served with Whipped Cream. Ad 1.00 for a la mode", "desserts", 3.50, new Date());
        myMenuItems.add(menuItem4);

        myMenu.setMenuItems(myMenuItems);

        System.out.println(myMenu);
	// write your code here
    // instantiate empty Menu object
    // instantiate empty MenuItem
    // WhileLoop to prompt for menuItems to create (would you like to add another item?
    // created Item pushed to ArrayList(menuItem.category) appy, entree, or dessert
    // keep adding items until finished would you like to add another?
    //When done adding items, loop through each ArrayList to display to screen
    // should each ArrayList(of objects) be pushed into an ArrayList itself?
    // then after finish add items (push each ArrayList(of objects)
        // into ArrayList(of ArrayList)called menuCategoryArray
        // then when I display I can loop through outer ArrayList, Inner ArrayList<Object - MenuItem>,
        // for each loop within object to display actual item
    }
}
