package mapStruct;

public class CarDTO {

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getVinNum() {
        return vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    private String carName;
    private String vinNum;

    public CarDTO(int id, String carName, String vinNum) {
        Id = id;
        this.carName = carName;
        this.vinNum = vinNum;
    }
}
