

public class Main {
    public static void main(String[] args) {


        // Opret vaskeriet
        LaundryService laundryService = new LaundryService();

        Dryer dryer2 = new Dryer(30, 0.5);
        WashingMachine washingMachine1 = new WashingMachine(7,true);
        laundryService.addMachine(washingMachine1);
        laundryService.addMachine(dryer2);

        LaundryMachine currentMachine = laundryService.chooseMachine();

        currentMachine.chooseProgram();
        System.out.println("Du har valgt flg. maskine: " + currentMachine);
        currentMachine.displayPriceAndDuration(); // reflekterer valgt maskine
        currentMachine.displayPriceAndDuration(); // ny pris og varighed
        currentMachine.start();
        currentMachine.displayPriceAndDuration();


    }
}