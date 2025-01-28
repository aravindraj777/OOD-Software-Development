package mapStruct.builder;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    Person getModelFromEntity(Person person);
}
