package Hoofdstuk1;

import java.util.Scanner;

public class Oefening7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef de hoogte van de muur in cm in: ");
        int hoogte = s.nextInt();
        System.out.print("Geef de breedte van de muur in cm in: ");
        int breedte = s.nextInt();

        // afronden naar boven en casten naar een int
        int benodigde_rollen = (int) Math.ceil((hoogte * breedte) / 50000.0);
        System.out.println("Het aantal benodigde rollen = " + benodigde_rollen);
    }
}
