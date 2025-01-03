//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Basket basket = new Basket (); //instansere //er navnet der refere til objectet som er new Basket();
        basket.addProduct(); //her kalder du en metode ved at først finde ud hvilken klasse det er vi skal bruge også navnet på metoden
        basket.printAll(); //det samme her sleve klassen basket hvorefter jeg kalder på metoden printAll
        basket.getTotal();
        System.out.println(basket.getTotal());

    }
    }
