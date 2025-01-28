package mapStruct.directField;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {


    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);


    @Mapping(target = "className",source = "classVal")
    @Mapping(target = "subject",source = "subject.name")
    Student getModelFromEntity(StudentEntity studentEntity);

    @InheritInverseConfiguration
    StudentEntity getEntityFromModel(Student student);
}
