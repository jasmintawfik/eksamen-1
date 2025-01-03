//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RickshawService rickshawService = new RickshawService();
        int[] districts = new int[]{0, 0};
        int[] districts1 = new int [] {1,1};
        int[] districts2 = new int [] {2,2};

        //hver chauffør med hvert deres district der dækkes


       /* int[] driver1Coverage = {0}; // Driver 1 dækker distrikt 1
        int[] driver2Coverage = {1}; // Driver 2 dækker distrikt 2
        int [] driver1Coverage3 = {2};

        */
        rickshawService.creatDriver("Lars",true,districts); //er ikke tilgænglig
        rickshawService.creatDriver("Pete", false, districts1); // er tilgænglig
        rickshawService.creatDriver("Maria", false, districts2); // er tilgænglig


        rickshawService.bookDriver();
        //kaldder på metoden bookDriver



       /* rickshawService.creatDriver("hej", false,2);
        rickshawService.creatDriver("he1", false,3);

*/

        //mangler stadig i createdriver hvor der skal createdrivers og 5 og 6 i de her 3 så ville mine getter bruges fra driver klasse
//name og district bliver ikke printet her skal fikses


    }

    }



