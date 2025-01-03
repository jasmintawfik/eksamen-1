public class Clothes extends Product {

    private String size;
    private String color;
    //konstruktør
    public Clothes(String name, int price, String color, String size) {
        super(name, price);
        this.color = color;
        this.size = size;

    }

    public void go() {
        System.out.println("CLOTHES" + ": ");
        System.out.println(name + color + size + "- " + price + " Euro's" );


    }

}