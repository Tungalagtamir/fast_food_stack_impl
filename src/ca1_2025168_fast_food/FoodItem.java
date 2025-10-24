package ca1_2025168_fast_food;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FoodItem {
    private String name;
    private double weight;
    private LocalDate bestBefore;
    private LocalDateTime storedTime;
    
    public static final String[] VALID_FOODS = {"Burger", "Pizza", "Fries", "Sandwich", "Hotdog"};
    
    public FoodItem(String name, double weight, LocalDate bestBefore) {
        boolean validName = false;
        for (String food : VALID_FOODS) {
            if (food.equalsIgnoreCase(name)) {
                validName = true;
                break;
            }
        }
        if (!validName) {
            throw new IllegalArgumentException("Invalid food: " + name + ". Must be: Burger, Pizza, Fries, Sandwich, Hotdog");
        }
        
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        
        if (bestBefore.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Best-before date cannot be in past");
        }
        
        this.name = name;
        this.weight = weight;
        this.bestBefore = bestBefore;
        this.storedTime = LocalDateTime.now();
    }
    
    public String getName() { return name; }
    public double getWeight() { return weight; }
    public LocalDate getBestBefore() { return bestBefore; }
    public LocalDateTime getStoredTime() { return storedTime; }
    
    public String toString() {
        return name + " (" + weight + "g) - Best Before: " + bestBefore;
    }
}
