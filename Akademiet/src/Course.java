public class Course {
    private String courseName;
    private int grade;
    // her har vi en datatype som er string som vi erklærer ved at give variabelnanvet courseName
    //her i attributter er attributten erklæret men ikke intlizerede

    //hernede i konstruktør intlizere vi vores to attributter
    public Course(String courseName, int grade) { //som har to paramtere som giver argumenter i de andre subklasser
        this.courseName = courseName; //Initialiserer attributten 'name'
        this.grade = grade; //Initialiserer attributten 'name'
    }
    //en getter for name for at gette vores private (access modifier). da den ikke er tilgænglig udenfra denne klasse hvis man ikke bruger en getter eller setter
    //man har ikke altid brug for både en getter og setter
    public String getName() {
        return courseName;
        //returnere coursename
        //eksempel ->
        // "Kan du hjælpe mig med at lægge 5 og 10 sammen?"
        // Din ven regner det ud og siger tilbage til dig:
        // "Resultatet er 15."
        //  Din ven er metoden.
        // 15 er resultatet, som din ven returnerer til dig.
    }

    //hente din grade
    public int getGrade() {
        return grade;


//        public:
//        Dette er en adgangsmodifikator, der betyder, at metoden kan tilgås fra andre klasser.
//        String:
//        Dette er datatypen for den værdi, som metoden returnerer. Metoden getName returnerer en String-værdi, der repræsenterer navnet på kurset.
//        getName():
//        Dette er metodens navn. Det følger konventionen for en "getter-metode", som bruges til at hente værdien af en privat attribut.
//        return courseName;:
//        courseName er en privat attribut i klassen.
//        return sender værdien af attributten courseName tilbage til den kode, der kalder metoden.
    }
}
//
//Hvorfor bruge en getter som getName?
//Indkapsling (Encapsulation):
//Attributten courseName holdes privat, så den ikke kan tilgås direkte fra andre klasser.
//Gettere giver sikker og kontrolleret adgang til attributten.
//Fleksibilitet:
//Du kan ændre den interne implementering af klassen uden at påvirke koden, der bruger getName.
//Læsbarhed:
//Det er en almindelig konvention i objektorienteret programmering at bruge getter-metoder til at hente værdier.