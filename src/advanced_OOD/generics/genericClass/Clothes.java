package advanced_OOD.generics.genericClass;

//Class ot define a product
public class Clothes {

    private String brand;
    private String size;

    public Clothes(String brand, String size){
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
