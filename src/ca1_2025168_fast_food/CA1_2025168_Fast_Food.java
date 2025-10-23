package ca1_2025168_fast_food;

import java.time.LocalDate;
import java.util.Scanner;

public class CA1_2025168_Fast_Food {
    public static void main(String[] args) {
        FoodStorage storage = new FoodStorage(8);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Fast Food Storage System - CA1_2025168 ===");
        
        while (true) {
            System.out.println("1. Add Food Item");
            System.out.println("2. Remove Food Item");
            System.out.println("3. Display All Items");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter food name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter weight (g): ");
                    double weight = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter best-before date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    
                    FoodItem item = new FoodItem(name, weight, date);
                    storage.addFoodItem(item);
                    break;
                    
                case "2":
                    storage.removeFoodItem();
                    break;
                    
                case "3":
                    storage.displayAll();
                    break;
                    
                case "4":
                    System.out.println("Goodbye!");
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
