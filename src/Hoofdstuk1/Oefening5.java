package Hoofdstuk1;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        // definieer een scanner object s voor input te verkrijgen
        Scanner s = new Scanner(System.in);

        System.out.print("Geef de lengte van de rechthoek in: ");
        int lengte = s.nextInt();
        System.out.print("Geef de breedte van de rechthoek in: ");
        int breedte = s.nextInt();

        System.out.println("De omtrek = " + (lengte + breedte) * 2);
        System.out.println("De oppervlakte = " + lengte * breedte);
    }
}
