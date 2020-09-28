package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef eerste getal in: ");
        int getal1 = s.nextInt();
        // grootste getal bijhouden (default value: getal1)
        int greatest_number = getal1;

        System.out.print("Geef tweede getal in: ");
        int getal2 = s.nextInt();

        System.out.print("Geef derde getal in: ");
        int getal3 = s.nextInt();


        if (getal2 > greatest_number){
            greatest_number = getal2;
        }
        if (getal3 > greatest_number){
            greatest_number = getal3;
        }


        int som = getal1 + getal2 + getal3;
        int gemiddelde = som / 3;
        int rest = som % 3;

        System.out.printf("Van de ingevoerde getallen %d, %d en %d%n", getal1, getal2, getal3);
        System.out.printf("is de som %d%nhet gemiddelde %d%nde rest %d%nen het grootste getal %d",
                som, gemiddelde, rest, greatest_number);
    }
}
