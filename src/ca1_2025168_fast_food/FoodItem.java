package ca1_2025168_fast_food;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FoodItem {
    private String name;
    private double weight;
    private LocalDate bestBefore;
    private LocalDateTime storedTime;
    
    public FoodItem(String name, double weight, LocalDate bestBefore) {
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
