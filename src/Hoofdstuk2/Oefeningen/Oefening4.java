package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // afstand is geheel strikt positief
        int afstand;
        do {
            System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
            afstand = s.nextInt();
        }while (afstand <= 0);


        // 40 km/h, 50km/h, ..., 140 km/h
        int snelheid = 40;
        for (snelheid = 40; snelheid <= 140; snelheid += 10){
            int time = 60 * afstand / snelheid;
            int minuten = time % 60;
            int hours = time / 60;

            System.out.printf(" %s%15s%15s%n", afstand + " km", snelheid + " km/u", hours + " u " + minuten + " min");
        }



    }
}
