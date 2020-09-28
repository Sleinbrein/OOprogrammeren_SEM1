package Hoofdstuk2;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        oefening6C();
    }

    private static void oefening6A(){
        Scanner s = new Scanner(System.in);

        int aantal = 1, som = 0;
        while (aantal <= 5){
            System.out.print("Geef getal " + aantal + ": ");
            som += s.nextInt();
            aantal++;
        }
        System.out.println("De som vam de getallen = " + som);
    }


    private static void oefening6B(){
        Scanner s = new Scanner(System.in);

        int aantal = 1;
        int aantal_even_getallen = 0;
        int deelbaar3 = 0;
        while (aantal <= 5){
            System.out.print("Geef getal " + aantal + ": ");
            int curgetal = s.nextInt();
            if (curgetal % 2 == 0){
                aantal_even_getallen++;
            }
            if (curgetal % 3 == 0){
                deelbaar3++;
            }
            aantal++;
        }
        System.out.println("Je gaf " + aantal_even_getallen + " even getallen en " + deelbaar3 + " getallen deelbaar door 3 in");
    }


    private static void oefening6C(){
        Scanner s = new Scanner(System.in);
        int aantal = 1;

        System.out.print("N" + String.format("%10s", "10*N") + String.format("%10s", "100*N") + String.format("%10s", "1000*N") + "\n");
        while (aantal <= 5){
            System.out.print(aantal + String.format("%10s", aantal*10) + String.format("%10s", aantal*100) + String.format("%10s", aantal*1000) + "\n");
            aantal++;
        }
    }
}
