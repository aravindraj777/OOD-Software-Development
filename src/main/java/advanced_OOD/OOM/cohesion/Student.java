package advanced_OOD.OOM.cohesion;

public class Student {

    private int id;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private double[] grades;

    public Student(int id, String name, String mobile, String email, String address, double[] grades) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double[] getGrades() {
        return grades;
    }
}
