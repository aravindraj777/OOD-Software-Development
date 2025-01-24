package mapStruct.nestedBean;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "className",source = "classVal")
    @Mapping(target = "subject",source = "subjectEntity.name")
    Student getModelFromEntity(StudentEntity studentEntity);

}
