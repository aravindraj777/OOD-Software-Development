package advanced_OOD.generics.genericMethod;

import java.util.List;

import static advanced_OOD.generics.genericMethod.ShoppingUtil.displayItems;

public class GenericMethodMain {

    public static void main(String[] args) {
        List<String> electronics = List.of("Laptop", "Smartphone", "Headphones");
        displayItems("Electronics",electronics);

        // Groceries category with item IDs
        List<Integer> groceries = List.of(101, 102, 103);
        displayItems("Groceries", groceries);

        // Clothing category with prices
        List<Double> clothingPrices = List.of(2999.99, 499.99, 799.99);
        displayItems("Clothing (Prices)", clothingPrices);
    }
}
