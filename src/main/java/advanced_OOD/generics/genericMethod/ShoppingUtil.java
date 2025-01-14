package advanced_OOD.generics.genericMethod;

import java.util.List;

public class ShoppingUtil {

    public static <T> void displayItems(String category, List<T> items){
        System.out.println("Category "+category);
        System.out.println("Items: ");
        for (T item: items){
            System.out.println(" - "+item);
        }
    }
}
