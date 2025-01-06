

    public class Main {
       public static void main(String[] args) {


        LaundryService laundryService = new LaundryService();

        Dryer dryer2 = new Dryer(30, 0.5);
        WashingMachine washingMachine1 = new WashingMachine(7,true);

//bruger keyword new for at oprette et nyt objekt fra vores kontruktør i washinemachine klasse

        laundryService.addMachine(washingMachine1);
        laundryService.addMachine(dryer2);

        LaundryMachine currentMachine = laundryService.chooseMachine();//???

        currentMachine.chooseProgram();
        System.out.println("Du har valgt flg. maskine: " + currentMachine);
        currentMachine.start();
        currentMachine.displayPriceAndDuration();


    }
}



