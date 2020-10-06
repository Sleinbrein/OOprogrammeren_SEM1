package Hoofdstuk2;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        oefening6B();
    }

    private static void oefening6A(){
        Scanner s = new Scanner(System.in);

        int aantal = 1, som = 0;
        while (aantal <= 5){
            System.out.printf("Geef getal %d: ", aantal);
            som += s.nextInt();
            aantal++;
        }
        System.out.println("De som vam de getallen = " + som);
    }


    private static void oefening6B(){
        Scanner s = new Scanner(System.in);

        int aantal = 1;
        int aantalEven = 0;
        int deelbaar3 = 0;
        while (aantal <= 5){
            System.out.print("Geef getal " + aantal + ": ");
            int curGetal = s.nextInt();
            if (curGetal % 2 == 0){
                aantalEven++;
            }
            if (curGetal % 3 == 0){
                deelbaar3++;
            }
            aantal++;
        }
        System.out.println("Je gaf " + aantalEven + " even getallen en " + deelbaar3 + " getallen deelbaar door 3 in");
        System.out.printf("Je gaf %d even getallen en %d getallen deelbaar door 3 in", aantalEven, deelbaar3);
        System.out.printf("Je gaf %d even getal%s ", aantalEven, aantalEven==1? "" : "len" );
        System.out.printf("en %d getal%s deelbaar door 3 in.", deelbaar3, deelbaar3==1? "" : "len" );
    }


    private static void oefening6C(){
        Scanner s = new Scanner(System.in);
        int aantal = 1;

        System.out.printf("N%10s%10s%10s%n", "10*N", "100*N", "1000*N");
        while (aantal <= 5){
            System.out.printf("%d%10s%10s%10s%n", aantal, aantal*10, aantal*100, aantal*1000);
            aantal++;
        }
    }
}
