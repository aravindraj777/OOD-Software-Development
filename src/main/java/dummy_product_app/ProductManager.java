package dummy_product_app;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private static final String FILE_PATH = "product.json";
    private static final Gson gson = new Gson();

    public static List<Product> readProducts() throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (Reader reader = new FileReader(FILE_PATH)) {
            Type productListType = new TypeToken<List<Product>>() {}.getType();
            return gson.fromJson(reader, productListType);
        }
    }

    public static void writeProducts(List<Product> products) throws IOException {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(products, writer);
        }
    }

    public static void addProduct(Product product) throws IOException {
        List<Product> products = readProducts();
        products.add(product);
        writeProducts(products);
    }

    public static void deleteProduct(int productId) throws IOException {
        List<Product> products = readProducts();
        products.removeIf(product -> product.getId() == productId);
        writeProducts(products);
    }

    public static void main(String[] args) {
        try {
            // Add a new product
            Product newProduct = new Product(3, "Product C", 300.0);
            addProduct(newProduct);
            System.out.println("Product added successfully!");

            // Delete a product by ID
            deleteProduct(1);
            System.out.println("Product deleted successfully!");

            // Display all products
            List<Product> products = readProducts();
            products.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error handling products: " + e.getMessage());
        }
    }
}
