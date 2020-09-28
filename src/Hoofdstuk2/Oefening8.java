package Hoofdstuk2;

import java.util.Scanner;

public class Oefening8 {
    public static void main(String[] args) {
        oefening8C();
    }

    private static void oefening8A(){
        Scanner s = new Scanner(System.in);

        int som = 0;
        for (int i = 1; i <= 5; i++){
            System.out.print("Geef getal " + i + ": ");
            som += s.nextInt();
        }
        System.out.println("De som van de getallen = " + som);
    }


    private static void oefening8B() {
        Scanner s = new Scanner(System.in);

        int aantal_even = 0;
        int aantal_deelbaar_door_3 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Geef getal " + i + ": ");
            int getal = s.nextInt();
            if (getal % 2 == 0) {
                aantal_even++;
            }
            if (getal % 3 == 0) {
                aantal_deelbaar_door_3++;
            }
        }
        System.out.printf("Je gaf %s even getallen en %s getallen deelbaar door 3 in.", aantal_even, aantal_deelbaar_door_3);
    }

    private static void oefening8C(){
        Scanner s = new Scanner(System.in);

        System.out.print("N" + String.format("%10s", "10*N") + String.format("%10s", "100*N") + String.format("%10s", "1000*N") + "\n");
        for (int i = 1; i <= 5; i++){
            System.out.print(i + String.format("%10s", i*10) + String.format("%10s", i*100) + String.format("%10s", i*1000) + "\n");
            System.out.print(i + String.format("%10s", i*10) + String.format("%10s", i*100) + String.format("%10s", i*1000) + "\n");
        }
    }
}
