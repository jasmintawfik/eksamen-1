import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> listOfProducts = new ArrayList<>();

    public void addProduct() {
        listOfProducts.add(new Clothes("Hoodie",11," blue"," Size small "));
        listOfProducts.add(new Electronic("Headset ", 100,"2 months warranty ")); //waaranty
        listOfProducts.add(new Food("Milk ", 12,"24 August 2024"));
//instansiere objekter af subklasserne opretter nye objekter og tilføjer værdiere til dem
    }

    public void printAll() {
        for (Product jasmin : listOfProducts) {
            jasmin.go();
            //her bliver der brugt en for each

        }
    }

        public int getTotal(){
        int total = 0;
        for(Product product : listOfProducts){
            total += product.getPrice();
        }
        return total;
    }

}
