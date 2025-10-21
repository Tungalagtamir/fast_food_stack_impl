package ca1_2025168_fast_food;

import java.time.LocalDate;

public class CA1_2025168_Fast_Food {
    public static void main(String[] args) {
        FoodItem burger = new FoodItem("Burger", 250.5, LocalDate.now().plusDays(5));
        System.out.println("Created: " + burger);
    }
}
