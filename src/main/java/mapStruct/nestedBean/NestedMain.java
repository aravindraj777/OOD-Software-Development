package mapStruct.nestedBean;

public class NestedMain {

    public static void main(String[] args) {

        SubjectEntity subject = new SubjectEntity();
        subject.setName("English");

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("Ashish");
        studentEntity.setId(1);
        studentEntity.setClassVal("11B");
        studentEntity.setSubjectEntity(subject);

        Student student = StudentMapper.INSTANCE.getModelFromEntity(studentEntity);
        System.out.println("StudentID "+student.getId());
        System.out.println("StudentName " + student.getName());
        System.out.println("ClassName "+student.getClassName());
        System.out.println("SubjectName =  "+student.getSubject());
    }
}
