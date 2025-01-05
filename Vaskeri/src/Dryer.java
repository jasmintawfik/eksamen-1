import java.util.Scanner;

public class Dryer implements LaundryMachine {

   private int duration;
   private double price;

   public Dryer(int duration, double price) {
      this.duration = 30;
      this.price = 0.5;



   }

   @Override
   public void chooseProgram() {
      System.out.println("lav varme");
      System.out.println("høj varme");



      Scanner time = new Scanner(System.in);
      int valg1 = time.nextInt();


      switch (valg1) {
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

      System.out.println("Pris: " + price + " kr. | Varighed: " + duration + " minutter | Kapacitet: "  + " kg");
   }


   @Override
   public void start() {
      this.duration = duration;  //så det fra mariam ikke noget jeg selv har lavet
      System.out.println("er startet" +  duration);
   }

   @Override
   public void addExtra() {



   }

}
