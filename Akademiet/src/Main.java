// Main.java
public class Main {
    public static void main(String[] args) {
        // Opret en Academy

        // Opret en studerende og tilføj kurser og karakterer
        Student student = new Student("Jasmin");
        //Student = klasse navnet
        //variabel navn (refere til obejctet)
        //(bruges til at oprette et nyt object i huukommenslen

       // Konstruktøren (Student(String name)):
       // Konstruktøren i klassen Student tager en parameter af typen String (i dette tilfælde "Jasmin").
       // "Jasmin" er argumentet, der bliver sendt til konstruktøren.
       // Konstruktøren initialiserer attributten name med værdien "Jasmin".

        student.addCourseGrade("Databaser",7);
        student.addCourseGrade("Webprogrammering",10);
        student.addCourseGrade("Systemudvikling",4);
        //student er reference til student opbejct der opretter øverst
        //der efter bruger vi keywordede add og metoden vi adder i den metode har vi
        //paramterene corusename og grade
        //konstruktøren i klassen tager en String som ville være vores courseName
        //og en int som er vores grade
        //matematik og dansk ville være vores arguemnt som bliver snedt til konstruktøren
        //kosntruktøren intlisere attributten name med værdierne som er matematik og dansk
        //og deres grades som er 7 og 10

        Student student2 = new Student("Lasse");

        student2.addCourseGrade("Databaser",10);
        student2.addCourseGrade("Webprogrammering",12);
        student2.addCourseGrade("Systemudvikling",4);

        Student student3 = new Student("Ebru");


        student3.addCourseGrade("Databaser",4);
        student3.addCourseGrade("Webprogrammering",10);
        student3.addCourseGrade("Systemudvikling",4);

        Student student4 = new Student("Nadine");

        student4.addCourseGrade("Databaser",10);
        student4.addCourseGrade("Webprogrammering",12);
        student4.addCourseGrade("Systemudvikling",4);

        Student student5 = new Student("Jens");


        student5.addCourseGrade("Databaser",7);
        student5.addCourseGrade("Webprogrammering",7);
        student5.addCourseGrade("Systemudvikling",7);
        // Tilføj studerende til Academy

        Academy academy = new Academy();
        //Academy = klasse navnet
        // variabel navn academy (refere til obejctet)
        //

        academy.addStudent(student);
        //vores vairabek navn fra tidligere + add keyword
        //og vores metode med paramteren student

        // Print diploma
        //her gør vi det samme bare med en anden metode og kalder på vores argumenter
        academy.printDiploma(student);
        academy.printDiploma(student2);
        academy.printDiploma(student3);
        academy.printDiploma(student4);
        academy.printDiploma(student5);
        // alt det der står i () er dine argumenter
/*
        academy.getLowest();
        academy.getHighest();

 */

    }
}
