package mapStruct.test.studentTest;

import mapStruct.directField.Student;
import mapStruct.directField.StudentEntity;
import mapStruct.directField.StudentMapper;
import mapStruct.nestedBean.SubjectEntity;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class StudentMapperTest{
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    @Test
    public void testEntityToModel() {
        StudentEntity entity = new StudentEntity();
        entity.setClassVal("X");
        entity.setName("John");
        entity.setId(1);
        entity.section = "A";
        SubjectEntity subject = new SubjectEntity();
        subject.setName("Computer");
        entity.setSubject(subject);
        Student model = studentMapper.getModelFromEntity(entity);
        assertEquals(entity.getClassVal(), model.getClassName());
        assertEquals(entity.getName(), model.getName());
        assertEquals(entity.getId(), model.getId());
        assertEquals(entity.getSubject().getName(), model.getSubject());
        assertEquals(entity.section, model.getSection());
    }

    @Test
    public void testModelToEntity() {
        Student model = new Student();
        model.setId(1);
        model.setName("John");
        model.setClassName("X");
        model.setSubject("Science");
        model.setSection("A");
        StudentEntity entity = studentMapper.getEntityFromModel(model);

        assertEquals(entity.getClassVal(), model.getClassName());
        assertEquals(entity.getName(), model.getName());
        assertEquals(entity.getId(), model.getId());
        assertEquals(entity.getSubject().getName(), model.getSubject());
        assertEquals(entity.section, model.getSection());
    }

}
