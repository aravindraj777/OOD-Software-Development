package mapStruct.directField;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {

    @Mapping(target = "className",source = "classVal")
    @Mapping(target = "subject",source = "subject.name" )
    Student getModelFromEntity(StudentEntity studentEntity);

    @InheritInverseConfiguration
    StudentEntity getEntityFromModel(Student student);
}
