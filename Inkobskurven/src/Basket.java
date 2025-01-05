import java.util.ArrayList;

public class Basket {
    //attribut
    private ArrayList<Product> listOfProducts = new ArrayList<>();
    //din type/datatype = product
    //listOfProducts er din variabelnavn som du selv vælger
    public void addProduct() {
        listOfProducts.add(new Clothes("Hoodie",11," blue"," Size small "));
        listOfProducts.add(new Electronic("Headset ", 100,"2 months warranty ")); //waaranty
        listOfProducts.add(new Food("Milk ", 12,"24 August 2024"));
        // .add er et metodekald
        //alt ind i () er mine argumenter
        //name fra min konstruktør i clothes fra kaldes alle mine paramtere name, price, color,size og det samme med de andre
        //instansiere objekter af subklasserne opretter nye objekter og tilføjer værdiere til dem
        //altså du instantiere et object
    }
        //en metode der jeg selv har lavet
    public void printAll() { //metode
        for (Product jasmin : listOfProducts) {
            jasmin.go();
            //vi bruger en for each som skal gennemgå alle elementer i et array eller en liste
            //grunden til vi ikke ha rbrugt en for loop er fordi når du bruger en for loop
            //skal du håndtere indexere men i en for each skal du ikke og der gør man det mere enkelt og læsebarligt
        }
    }
            //metode
        public int getTotal(){
            int total = 0;  //vores total har værdien 0 fordi altså startværdien fordi lad os sige at
            // du sætter værdien til 20 så starter den fra 20 hvorefter alle priserne bliver lagt til værdien 20
            //så tæller dne ikk rigtigt
            for(Product product : listOfProducts){
            total += product.getPrice(); //kalder getter metoden price fra prodcut klassen

            }
        return total;


            //  "Jeg har en for-each-løkke, der itererer gennem alle"
            //  " elementerne i min liste listOfProducts. Hvert element" +
            //" har datatypen Product, og jeg giver det variabelnavnet product." +
            //   " For hvert produkt henter jeg prisen med getPrice() og " +
            //"lægger den til total, som starter på 0. Når løkken er færdig, returnerer metoden den samlede pris."
            // "Kan du hjælpe mig med at lægge 5 og 10 sammen?"
            //
            //       // Din ven regner det ud og siger tilbage til dig:
            //        //"Resultatet er 15."
            //
            //      //  Din ven er metoden.
            //       // 15 er resultatet, som din ven returnerer til dig.
    }

}
