import java.util.Scanner;

   public class Dryer implements LaundryMachine {
   //attributter
   private int duration;
   private double price;
//private acces modifer

   //konstruktør
   public Dryer(int duration, double price) {
      this.duration = 30; //standartværdi
      this.price = 0.5; //per minut
     //snak om override
//override = overskriver metoder fra interface klassen
   }

   @Override
   public void chooseProgram() {
      System.out.println("Lav varme");
      System.out.println("Høj varme");

      //scanner user input/læse brugerens input
      Scanner choice = new Scanner(System.in);
      int valg = choice.nextInt();

      //en switch mere læsbarligt end en if else
      switch (valg) {
         case 1:
            System.out.println("du har valgt 1");
            break;
         case 2:
            System.out.println("du har valgt 2");
            break;

      }

   }


   @Override
   public void displayPriceAndDuration() {
//vi henter vores værdier/value
      System.out.println("Pris: " + price + " kr. | Varighed: " + duration + " minutter | Kapacitet: "  + " kg");
   }


   @Override
   public void start() {
//henter vores værdi i duration
      System.out.println("er startet " +  duration);


   }
   @Override
   public String toString() {
      return "Tørretumbler med standard varighed: " + duration + " minutter";
   }

//hvad er en tostringt

}
