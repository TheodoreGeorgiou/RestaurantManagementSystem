package org.theo;

import org.theo.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish fries = new Dish("French Fries", 2.99, FoodType.VEGE);
        Beverage coke = new Beverage("Coke", 1.99, false);
        Combo cokeAndFries = new Combo("Coke & Fries");
        cokeAndFries.addDish(fries);
        cokeAndFries.addBeverage(coke);

        restaurantManagementSystem.addCombo(cokeAndFries);

        System.out.println(restaurantManagementSystem);
    }
}