import java.util.ArrayList;

public class Academy {
   // private double lowestGrades;
   // private double highestGrades;
    private ArrayList<Student> students;

    //ansvarlig for at printe diplomer og højste og laveste s
    public Academy() {
     //  this.lowestGrades = lowestGrades;
      //  this.highestGrades = highestGrades;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void printDiploma(Student student) {
        //metoden har 1 parameter som tager fra student klassen og
        // som vi kalder student som er vores vairbael navn (student med småt er vores variabelnavn

        System.out.println("Diploma for: " + student.getName());
        //her kalder vi på student vores varibel navn og getter name fra student klassen
        System.out.println("---------------------------");
        //for at gøre output flottere
        // Iterér gennem kurser og karakterer
        for (Course course : student.getCourses()) {
            System.out.println(course.getName() + ": " + course.getGrade());
        }

        System.out.println(); // Tilføj en tom linje efter hvert diplom for adskillelse
    }

        //laver en for each for at iteere gennem vores kursere vores arrayliste
        // og derefter tilføjer vi vores karakter med getter fra course klassen




















   /* public void printDiploma(Student student) {
        System.out.println("Diploma for: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println(course.getName() + ": " + course.getGrade()); // Udskriv kursusnavn og karakter
            System.out.println(); // ekstra sout grundet mac
            // Udskriv karaktererne

    */
        }

/*
    public void getHighest() {
        ArrayList<Student> bestStudents = students;

        for (int i = 0; i < bestStudents.size(); i++) {
            for (int j = i + 1; j < bestStudents.size(); j++) {
                if (bestStudents.get(j).getAverage() > bestStudents.get(i).getAverage()) {
                    Student temp = bestStudents.get(i);
                    bestStudents.set(i, bestStudents.get(j));
                    bestStudents.set(j, temp);
                }
            }
        }

        // Print the top 10 students
        System.out.println("Top 10 Students:");
        for (int i = 0; i < Math.min(10, bestStudents.size()); i++) {
            Student student = bestStudents.get(i);
            System.out.println(student.getName() + " - Average Grade: " + student.getAverage());
        }
    }

    public void getLowest() {
        if (lowestGrades < highestGrades)
            // }else if (highestGradeses >=lowestGrades )
            System.out.println("Jens have the lowest average " + lowestGrades);

    }


}



 */

