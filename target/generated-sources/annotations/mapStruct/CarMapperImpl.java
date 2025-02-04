package mapStruct;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-03T13:17:43+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO carTOCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        String vinNum = null;
        int id = 0;

        vinNum = car.getVIN();
        id = car.getId();

        String carName = null;

        CarDTO carDTO = new CarDTO( id, carName, vinNum );

        return carDTO;
    }
}
