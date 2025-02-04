package mapStruct.enumMapping;

import org.mapstruct.factory.Mappers;

public class EnumMappingMain {

    public static void main(String[] args) {

        House house = new House();
        house.setId(2L);
        house.setHouseName("hdh");
        house.setAddress("skufghds");
        house.setBuildingType(BuildingType.CONMERCIAL);

        IBuildingMapper mapper = Mappers.getMapper(IBuildingMapper.class);
        HouseDto dto = mapper.mapToHouseDto(house);
        System.out.println(dto.getBuilding());
        System.out.println(dto.getId());
        System.out.println(dto.getAddress());

    }
}
