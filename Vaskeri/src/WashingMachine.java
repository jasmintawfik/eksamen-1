import java.util.Scanner;

public class WashingMachine implements LaundryMachine {

    private int duration;
    private double price = 1.2;
   private boolean isRunning;
    private int capacity;


    public WashingMachine( int capacity,boolean isRunning) {
        this.isRunning = isRunning;
        this.capacity = capacity;




        //  public void washingMachine(int capacity) {

    }

    @Override
    public void chooseProgram() {
        System.out.println("Uld og Silke ");
        System.out.println("Bomuld 40");
        System.out.println("bomuld 60");

        Scanner time = new Scanner(System.in);
        int valg = time.nextInt();


        switch (valg) {
            case 1:
                System.out.println("Du har valgt uld og silke. Varigheden er 30 minutter");
                break;
            case 2:
                System.out.println("Du har valgt bomuld 40. Varigheden er 50 minutter");
                break;
            case 3 :
                System.out.println("Du har valgt bomuld 60. Varigheden er 60 minutter");
                break;
        }


    }


    @Override
    public void displayPriceAndDuration() {

        System.out.println("Price and Duration" + price + duration + capacity);

    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Programmet er startet");
    }

    @Override
    public void addExtra() {

    }

}










