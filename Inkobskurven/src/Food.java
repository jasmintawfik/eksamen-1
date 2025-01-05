

public class Food extends Product {
    //attributter
    private String expireDate;

    //konstruktør
    public Food(String name, int price,String expireDate) {
        super(name, price); //et keyword
        this.expireDate = expireDate; //initlizerirng

    }
    //en metode jeg selv har lavet
    public void go() { //metode
        System.out.println("FOOD" + ":");
        System.out.println(name + expireDate +  " - " + "Euros`s " +  price);


    }
}

//extends keyword bruges for at fortælle at en klasse arver fra en anden ligesom her
//electronic, food, clothes er subklasser som arver fra product klassen som er vores superklasse