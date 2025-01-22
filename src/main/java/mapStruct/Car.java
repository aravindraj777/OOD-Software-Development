package mapStruct;

public class Car {

    private int id;

    public int getId() {
        return id;
    }

    public Car(int id, String name, String VIN) {
        this.id = id;
        this.name = name;
        this.VIN = VIN;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    private String name;
    private String VIN;
}
