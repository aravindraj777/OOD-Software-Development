package advanced_OOD.OOM.cohesion;

public class CohesionMain {

    public static void main(String[] args) {
        Student student = new Student(
                1,
                "Arvind",
                "6238648001",
                "arvind@gmail.com",
                "Trivandrum",
                new double[]{
                85.5, 90.0, 78.3, 92.0
                });

        GradeCalculator gradeCalculator = new GradeCalculator();
        double average = gradeCalculator.calculateAverage(student);
        System.out.println("Average :"+ average);
    }
}
