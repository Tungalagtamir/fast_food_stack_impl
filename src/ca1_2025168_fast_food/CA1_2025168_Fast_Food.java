package ca1_2025168_fast_food;

import java.time.LocalDate;

public class CA1_2025168_Fast_Food {
    public static void main(String[] args) {
        FoodStorage storage = new FoodStorage(8);
        storage.addFoodItem(new FoodItem("Burger", 250, LocalDate.now().plusDays(5)));
        storage.addFoodItem(new FoodItem("Pizza", 450, LocalDate.now().plusDays(3)));
        storage.displayAll();
    }
}
