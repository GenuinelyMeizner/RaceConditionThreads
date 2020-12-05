package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Why is X not 1.000.000?
        Hvis flere tråde starter på samme tid, samt behandler den samme ressource samtidigt,
        vil de få forskellige start variabler, da andre tråde er startet samtidigt med dem.
        Deraf, vil trådene tælle forskelligt
         */

        /*Why is X different each run?
        Forsinkelser mellem data overførselerne mellem processerne, gør at de bliver fodret
        forskellige data, derfor vil startpunktet og slutpunktet ændre sig.
         */


        Variables variable1 = new Variables();
        Variables variable2 = new Variables();
        Variables variable3 = new Variables();
        Variables variable4 = new Variables();
        Variables variable5 = new Variables();
        Variables variable6 = new Variables();
        Variables variable7 = new Variables();
        Variables variable8 = new Variables();
        Variables variable9 = new Variables();
        Variables variable10 = new Variables();

        variable1.start();
        variable2.start();
        variable3.start();
        variable4.start();
        variable5.start();
        variable6.start();
        variable7.start();
        variable8.start();
        variable9.start();
        variable10.start();

        try {
            variable1.join();
            variable2.join();
            variable3.join();
            variable4.join();
            variable5.join();
            variable6.join();
            variable7.join();
            variable8.join();
            variable9.join();
            variable10.join();
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println(Variables.x);




    }
}
