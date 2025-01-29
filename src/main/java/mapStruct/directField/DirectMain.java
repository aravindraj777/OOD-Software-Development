//package mapStruct.directField;
//
//import mapStruct.directField.StudentEntity;
//import mapStruct.directField.SubjectEntity;
//
//public class DirectMain {
//
//    public static void main(String[] args) {
//
//        SubjectEntity subject1 = new SubjectEntity();
//        subject1.setName("English");
//
//        mapStruct.directField.StudentEntity studentEntity = new StudentEntity();
//        studentEntity.setName("Ashish");
//        studentEntity.setId(1);
//        studentEntity.setClassVal("11B");
//        studentEntity.setSubject(subject1);
//
//        Student student = new Student();
//        student.setName("Aravind");
//        student.setClassName("9B");
//        student.setId(3);
//        student.setSubject(subject1.getName());
//
//        StudentEntity studentEntity1 = StudentMapper.INSTANCE.getEntityFromModel(student);
//        Student getStudent = StudentMapper.INSTANCE.getModelFromEntity(studentEntity1);
//
//        // Print the mapped StudentEntity object
//        System.out.println("Mapped StudentEntity: ");
//        System.out.println("ClassVal: " + studentEntity1.getClassVal());
//        System.out.println("Subject Name: " + studentEntity1.getSubject().getName());
//        System.out.println(getStudent.getClassName());
//
//    }
//}
