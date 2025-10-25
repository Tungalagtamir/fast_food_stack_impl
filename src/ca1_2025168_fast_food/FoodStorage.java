package ca1_2025168_fast_food;

import java.util.Stack;

public class FoodStorage {
    private Stack<FoodItem> storage;
    private int capacity;
    
    public FoodStorage(int capacity) {
        this.capacity = capacity;
        this.storage = new Stack<>();
    }
    
    public void addFoodItem(FoodItem item) {
        if (storage.size() < capacity) {
            storage.push(item);
            System.out.println("Added: " + item.getName());
        } else {
            System.out.println("Storage full! Cannot add: " + item.getName());
        }
    }
    
    public FoodItem removeFoodItem() {
        if (!storage.isEmpty()) {
            FoodItem item = storage.pop();
            System.out.println("Removed: " + item.getName());
            return item;
        } else {
            System.out.println("Storage empty!");
            return null;
        }
    }
    
    public FoodItem peekTopItem() {
        if (!storage.isEmpty()) {
            FoodItem item = storage.peek();
            System.out.println("Top item: " + item);
            return item;
        } else {
            System.out.println("Storage empty!");
            return null;
        }
    }
    
    public void displayAll() {
        System.out.println("Storage (" + storage.size() + "/" + capacity + "):");
        for (int i = storage.size() - 1; i >= 0; i--) {
            System.out.println("  " + (storage.size() - i) + ". " + storage.get(i));
        }
    }
    
    public boolean isEmpty() { return storage.isEmpty(); }
}
