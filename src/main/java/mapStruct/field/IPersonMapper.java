package mapStruct.field;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IPersonMapper {


    @Mapping(source = "id",target = "personId")
    public PersonDto toPersonDto(PersonDBObj personDBObj);
}
