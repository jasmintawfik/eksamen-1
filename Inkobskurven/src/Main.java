//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Basket basket = new Basket (); //instansere //er navnet der refere til objectet som er new Basket();
        //FOR AT FORSTÅ DETTE HELT PRÆCIST SÅ KIG PÅ W3 SCHOOL CLASSES OG OBJECT/JAVA CONSTRUKTOR/JAVA OOP IGEN

        //Basket = navnet på din klasse

        //new betyder den oprette/creater et nyt object

        basket.addProduct(); //her kalder du en metode ved at nanvgive klassen din metode er i også navnet på selve metoden

        basket.printAll(); //her kalder du en metode ved at nanvgive klassen din metode er i også navnet på selve metoden

        basket.getTotal(); //her kalder du en metode ved at nanvgive klassen din metode er i også navnet på selve metoden

        //

        System.out.println(basket.getTotal()); //her laver du en system.out.println hvor i du har navnet på din klasse med selve nanvet med metoden
        //henter værdien af get total og printer den
        //Ja, du kan bruge public, men det er bedst kun at bruge det i specifikke tilfælde,
        // hvor du med vilje vil gøre en attribut helt åben. For bedre kontrol og sikkerhed
        // anbefales det at bruge private med getters og setters.

        //kom ind på superklasser og subklaser nedarvning i emnet polymorfi









    }
    }
