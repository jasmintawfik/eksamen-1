// Course.java
public class Course {
    private String courseName;
    private int grade;
// her har vi en datatype som er string som vi erklærer ved at give variabelnanvet courseName
    //her i attributter er attributten erklæret men ikke intlizerede

    //hernede i konstruktør intlizere vi vores to attributter
    public Course(String courseName, int grade) {//som har to paramtere som giver argumenter i de andre subklasser
        this.courseName = courseName; //Initialiserer attributten 'name'
        this.grade = grade; //Initialiserer attributten 'name'
    }

    public String getName() {
        return courseName;
    }


    public int getGrade() {
        return grade;
    }
}
