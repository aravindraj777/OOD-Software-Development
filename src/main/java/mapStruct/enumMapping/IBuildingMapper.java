package mapStruct.enumMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IBuildingMapper {

    @Mapping(target = "building", source = "house.buildingType")
    public HouseDto mapToHouseDto(House house);

}
