package Hoofdstuk2.Oefeningen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int postcode;
        String stad = "";

        do {
            System.out.print("Geef een postcode (4 cijfers): ");
            postcode = s.nextInt();
            switch (postcode){
                case 9300: stad = "Aalst"; break;
                case 2000: stad = "Antwerpen"; break;
                case 1000: stad = "Brussel"; break;
                case 9200: stad = "Dendermonde"; break;
                case 9000: stad = "Gent"; break;
                case 8500: stad = "Kortrijk"; break;
                case 9700: stad = "Oudenaarde"; break;
                case 2300: stad = "Turnhout"; break;
                default:
                    System.out.printf("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen.%n", postcode);
                    break;
            }
        }while (postcode > 9999 || postcode < 999 );

        System.out.printf("Postnummer %d komt overeen met de stad %s%n", postcode, stad);
    }
}
