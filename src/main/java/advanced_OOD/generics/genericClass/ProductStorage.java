package advanced_OOD.generics.genericClass;

import java.util.ArrayList;
import java.util.List;
/**
 * This is a generic class , to store any type of products.
 * Sample ecommerce product Management system where there are
 * multiple products , Instead of
 * */

public class ProductStorage<T> {

    private List<T> products = new ArrayList<>();

    public void addProduct(T product){
        products.add(product);
    }
    public List<T> getAllProduct(){
        return products;
    }
    public T getProduct(int index){
        return products.get(index);
    }
}
