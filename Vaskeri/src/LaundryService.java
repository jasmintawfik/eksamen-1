import java.util.ArrayList;
import java.util.Scanner;


    public class LaundryService {

        private ArrayList<LaundryMachine> machines = new ArrayList<>();

        public LaundryService() {
            machines = new ArrayList<>();
        }

        // Tilføj maskine til listen
        public void addMachine(LaundryMachine machine) {
            machines.add(machine); // Tilføj maskinen til listen
        }

        public LaundryMachine chooseMachine() {
            if (machines.isEmpty()) {
                System.out.println("Ingen maskiner tilgængelige.");
                return null;
            }

            Scanner maskine = new Scanner(System.in);
            System.out.println("Vælg en maskine:");
            for (int i = 0; i < machines.size(); i++) {
                System.out.println((i) + ". " + machines.get(i));
            }

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


/*


/*

    private ArrayList<LaundryMachine> machines = new ArrayList<>();


    public LaundryService() {

        //machines.add(machines);
        machines = new ArrayList<>();

    }

    // Lad brugeren vælge en maskine
    public void addMachine(LaundryMachine machine) {

        //lavet af chat
        machines.add(machine); // Tilføj maskinen til listen
        System.out.println("Maskine tilføjet");
    }


    public LaundryMachine chooseMachine() {


        Scanner maskine = new Scanner(System.in);
        System.out.println("vælg");
        int valg = maskine.nextInt();

        for (int i = 0; i < machines.size(); i++) {
            System.out.println(i + machines.size());

            if (valg > 0 && valg <= machines.size()) {

                System.out.println("du har valgt" + machines.size());

            }
        }

        return null;
    }
}

 */