public class Clothes extends Product {

    private String size;
    private String color;

    //product af en farve
    //konstruktør
    public Clothes(String name, int price, String color, String size) {
        super(name, price);
        this.color = color;
        this.size = size;

        //som bliver tilføjet til kurven

    }

    public void go() {
        System.out.println("CLOTHES" + ": ");
        System.out.println(name + color + size + "- " + price + " Euro's" );
//bruger vores attributter som er blivet intlizere i konstruktøren

    }

}