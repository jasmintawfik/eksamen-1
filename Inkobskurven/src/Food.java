

public class Food extends Product {
    //attributter
    private String expireDate;

    public Food(String name, int price,String expireDate) {
        super(name, price);
        this.expireDate = expireDate;


    }
    public void go() {
        System.out.println("FOOD" + ":");
        System.out.println(name + expireDate +  " - " + "Euros`s " +  price);


    }
}