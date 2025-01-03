public class Driver {

    public String name;
    public boolean isBooked;
    public int[] districtCoverage;

//attributter
    public Driver(String name, boolean isBooked, int[] districtCoverage) { //argumentere for hvorfor du har tilføjet en ekstra paramete i konstruktør udover hhvad der står i klassediagrammet
        this.name = name;
        this.isBooked = isBooked;
        this.districtCoverage = districtCoverage;
//konstruktør paramteren som vi bruger vi vores metode om chaufførenede i main tager fra denne konstruktør
    }
    //hvorfor bliver den ikke brugt + har set mariam ikke bruger nogen af de her

    public String getName() {
        return name;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public int[] getDestinationCoverage() {
        return districtCoverage;
    }


}
