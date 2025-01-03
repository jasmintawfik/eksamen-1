import java.util.ArrayList;
import java.util.Scanner;
public class RickshawService {

   private String[][] districts;
   private static ArrayList<Driver> drivers;

   public RickshawService() {
      // Initialiser districts her for at undgå konflikt med metodeparameter
      districts = new String[][]{
              {"Christina", "Operaen", "Havnebad Islands Brygge"},

              {"Tivoli", "Rådhuspladsen", "Christiansborg"},

              {"Amalienborg", "Strøget", "Nyhavn"}

      };
      drivers = new ArrayList<>(); // Initialiser drivers-listen
      /*Driver driver = new Driver("jasmin", false);
      Driver driver1 = new Driver("karoline", true);


       */
   }

   public void creatDriver(String name, boolean isBooked, int[] destinationCoverage) {

      // Loop gennem districts array og print indholdet

      drivers.add(new Driver(name, isBooked, destinationCoverage));


   }

   public void bookDriver() {

      for (int i = 0; i < districts.length; i++) {//skal ændres så det printes flottere ud
         for (int j = 0; j < districts[i].length; j++) {
            System.out.println(districts[i][j]);
         }
      }

      Scanner scanner = new Scanner(System.in);
      System.out.print("Indtast nummeret på din destination: ");

      int choice = scanner.nextInt();

      if (choice > 0 && choice <= 9) { // Tjek at valget er gyldigt
         int districtIndex = (choice - 1) / 3; //  distriktet
         int destinationIndex = (choice - 1) % 3; // Find position i distriktet

         String selectedDestination = districts[districtIndex][destinationIndex];
         System.out.println("Du har valgt: " + selectedDestination);

         System.out.println(findDriver(districtIndex));
         //System.out.println(findDriver(districtIndex)); laver en system.out.println fordi vores metoder har ren string (findDriver)


      } else {
         System.out.println("Ugyldigt valg. Prøv igen.");
         bookDriver(); //rekursivt kald
      }
   }


      private String findDriver(int districtNumber) {
         // Gå igennem alle chauffører
         for (Driver driver : drivers) {
            // Tjek om chaufføren dækker distriktet
            for (int district : driver.districtCoverage) {
               if (district == districtNumber) {
                  // Tjek om chaufføren er ledig
                  if (!driver.isBooked) {
                     return "Chauffør: " + driver.name + " er tilgængelig"; // Returner hvis en ledig chauffør findes
                  }
               }
            }
         }
         return "Der blev ikke fundet nogen ledig chauffør"; // Hvis ingen chauffør findes
      }

   }