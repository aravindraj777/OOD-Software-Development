package mapStruct;

public class MainMap {

    public static void main(String[] args) {


        Car car = new Car(1, "999", "Uber");

        // When: Map the Car object to a CarDTO
        CarDTO carDto = CarMapper.INSTANCE.carTOCarDTO(car);

        // Then: Print the CarDTO properties to verify the mapping
        System.out.println("CarDTO ID: " + carDto.getId());
        System.out.println("CarDTO Registration Number: " + carDto.getVinNum());
        System.out.println(carDto.getCarName());
    }
}
