import java.util.ArrayList;
import java.util.Scanner;

     //denne klasse er en seperat klasse fra 3 andre
    public class LaundryService {
        //attribut
        private ArrayList<LaundryMachine> machines = new ArrayList<>();

        //??
        public LaundryService() {
            machines = new ArrayList<>();
        }

        //?????
        public void addMachine(LaundryMachine machine) {
            machines.add(machine);
        }

        //metode til bruges en if for at se om vores maskiner er tilgænglige
        public LaundryMachine chooseMachine() {
            if (machines.isEmpty()) {
                System.out.println("Ingen maskiner tilgængelige.");
                return null;
            }
            //en scanner/user input fra brugeren + en for loop der kører gennem vores arrayliste af maskiner
            Scanner maskine = new Scanner(System.in);
            System.out.println("Vælg en maskine:");
            for (int i = 0; i < machines.size(); i++) {
                System.out.println((i) + ". " + machines.get(i));
            }
            //ser om valget er gyldigt
            int valg = maskine.nextInt();
            if (valg > 0 && valg <= machines.size()) {
                LaundryMachine valgtMaskine = machines.get(valg - 1);
                System.out.println("Du har valgt: " + valgtMaskine);
                return valgtMaskine;
            } else {
                System.out.println("Ugyldigt valg!");
                return null;
            }
        }
    }


