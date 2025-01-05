
public class Electronic extends Product {
    //attribut
    private String warrantyNoMonths;

    //konstruktør
    public Electronic(String name, int price, String warrantyNoMonths) {
        super(name, price);
        this.warrantyNoMonths = warrantyNoMonths;
    }

    //metode jeg selv har lavet
    public void go() { //metode
        System.out.println("ELECTRONIC" + ":");
        System.out.println(name + warrantyNoMonths + "- " + "Euro´s " + price );


    }
}


