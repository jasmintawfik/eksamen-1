// Student.java
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;
    // her har vi en datatype som er string som vi erklærer ved at give variabelnanvet name
    //her i attributter er attributten erklæret men ikke intlizerede

    public Student(String name) {
        this.name = name;//Initialiserer attributten 'name'
        this.courses = new ArrayList<>();//Initialiserer attributten 'name'
    }

    public void addCourseGrade(String courseName, int grade) {
        Course course = new Course(courseName, grade); //ved ik new
        courses.add(course);
        //her tager vi vores navn på vores arrayliste og add bruger add som er keyword i java for at adde ngoet
        //inde parentes så skriver du course som er varibael nanvet som har parametere courseName og grade

        //tilføj grade
    }

    public String getName() {
        return name;
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }
}
//getter og setters bliver lavet for at får adgang til private attributter så andre klasser kan få adgang til dem
//der kan også være andre grunde til man laver getter og setter som jeg ikke ved hvad er










/*
    public double getAverage() {
        double total = 0;
        for (Course course : courses) {
            total += course.getGrade();
        }
        return total/courses.size();
    }
}



 */










/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
  // private Map<Course, Double> courses;
    private ArrayList<Course> courses; // Skift til ArrayList af Course


    public Student(String name) {
        this.name = name;
       // this.courses = new HashMap<>(); // Initialiser ArrayList for kursus
       this.courses= new ArrayList<>(); // Initialiser HashMap
    }

   public void addCourseGrade(Course course , double grade) {
       courses.add();

   // public ArrayList<Course> getCourses() {
    //    return courses;

    }
    public String getCourse(){
            return course;
    }

    public String getName() {
        return name;



        }
        public void getAverage(){
        double snit = 0;
        for(double grade : courses.values()){
            snit += grade;
        }

        }

    }
    /*
   public getTotalGrades(){
       for(course jasmin : courses) {
             jasmin.getName() ;

     */
