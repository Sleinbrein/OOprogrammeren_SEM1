package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef een strikt positief geheel getal in: ");
        int getal = s.nextInt();

        int aantal_bewerkingen = 0;
        while (getal != 1){
            // even: deel het getal door 2
            if (getal % 2 == 0){
                getal = getal/2;
            }else{
                // oneven: vermenigvuldig met 3 en tel er 1 bij op
                getal = getal * 3 + 1;
            }

            // increment de counter
            aantal_bewerkingen++;
        }
        System.out.printf(aantal_bewerkingen == 1 ? "Het getal wijzigt %d keer" : "Het getal wijzigt %d keren", aantal_bewerkingen);
    }
}
