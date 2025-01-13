package advanced_OOD.generics.genericClass;

import java.util.List;

/**
 * Passing Books products and clothes to the Product storage generic class , calling the method from the generic class
 * Will return  the objects of the particular classes .
 * In generics JVM will automatically assign the appropriate class in the generic part at the runtime .
 * In the case of generics, the type parameter (T) is erased at runtime by the JVM. This is known as type erasure in Java
 */
public class GenericClassMain {

    public static void main(String[] args) {
        ProductStorage<Books> booksProductStorage = new ProductStorage<>();
        booksProductStorage.addProduct(new Books("Psychology of Money", "Author"));
        booksProductStorage.addProduct(new Books("Java","James Gosling"));

        ProductStorage<Clothes> clothesProductStorage = new ProductStorage<>();
        clothesProductStorage.addProduct(new Clothes("Lewis", "50"));
        clothesProductStorage.addProduct(new Clothes("Allen Solly", "90"));

        System.out.println("Books in storage");
        List<Books> books = booksProductStorage.getAllProduct();
        for (Books book : books){
            System.out.println(book);
        }

        System.out.println("Clothes in storage");
        List<Clothes> clothes = clothesProductStorage.getAllProduct();
        for (Clothes cloth : clothes) {
            System.out.println(cloth);
        }
    }
}
