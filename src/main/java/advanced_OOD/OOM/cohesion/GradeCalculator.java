package advanced_OOD.OOM.cohesion;

public class GradeCalculator {

    public double calculateAverage(Student student){
        double totalMarks = 0.0;
        int totalGradeCount = 0;
        for (double grade : student.getGrades()){
            totalMarks+= grade;
            totalGradeCount++;
        }
        return totalMarks / totalGradeCount;
    }
}
