
public abstract class Product {
    //at bruge public bryder encapsulation i java som er en vigtig princip
    //attributter
     String name;
     int price;
     // her har vi en datatype som er string som vi erklærer ved at give variabelnanvet name
    //her i attributter er attributten erklæret men ikke intlizerede

    //hernede i konstruktør intlizere vi vores to attributter
    //Konstruktør
    public Product(String name, int price) { //som har to paramtere som giver argumenter i de andre subklasser
        this.name = name; //Initialiserer attributten 'name'
        this.price = price; //Initialiserekr attributten 'name'

        //this bruges til henvise til attribut
        //Når vi bruger super, er det fordi subklasserne nedarver fra
        //superklassen, og vi ønsker at genbruge superklassens konstruktør til
        //at initialisere de fælles attributter, som alle subklasser deler.
    }

    public int getPrice() {
        //laver en getter for at hente værdien på price og returner den
        return price;
        //int er der fordi den skal returnere en værdi er typen int

           //eksempel ->
          // "Kan du hjælpe mig med at lægge 5 og 10 sammen?"
         // Din ven regner det ud og siger tilbage til dig:
        // "Resultatet er 15."
       //  Din ven er metoden.
      // 15 er resultatet, som din ven returnerer til dig.
    }

    // en metode
    public void go() { //metode
        System.out.println();
    }
}

// en abstract har inge krop som betyder at "kroppen" er providede af subklasserne de subklasserne arver fra superklassen