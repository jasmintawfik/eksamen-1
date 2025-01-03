

public class Electronic extends Product {
    private String warrantyNoMonths;

    public Electronic(String name, int price, String warrantyNoMonths) {
        super(name, price);
        this.warrantyNoMonths = warrantyNoMonths;
    }


    public void go() {
        System.out.println("ELECTRONIC" + ":");
        System.out.println(name + warrantyNoMonths + "- " + "Euro´s " + price );


    }
}


