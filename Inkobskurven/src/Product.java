
public abstract class Product {
    //attributter
    String name;
    int price;

    //Metode
    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void go() {
        System.out.println();
    }
}