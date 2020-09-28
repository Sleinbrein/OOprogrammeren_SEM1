package Hoofdstuk2;

import java.util.Scanner;

public class Oefening9 {
    public static void main(String[] args) {
        oefening9B();
    }

    private static void oefening9A(){
        Scanner s = new Scanner(System.in);

        boolean doorgaan = true;
        int negatieve_nummers = 0;
        int negatieve_som = 0;
        int getal;

        while (doorgaan){
            System.out.print("Geef een getal (-1 om te stoppen): ");
            getal = s.nextInt();

            // stop de loop?
            if (getal == -1){
                doorgaan = false;
                if (negatieve_nummers <= 0){
                    System.out.println("Er werden geen negatieve getallen ingevoerd!");
                }else{
                    System.out.println("Het gemiddelde van alle negatieve getallen is " + ((float)negatieve_som / negatieve_nummers));
                }
            }

            // controleer voor negatieve nummers
            if (getal < 0) {
                negatieve_som += getal;
                negatieve_nummers += 1;
            }
        }
    }

    private static void oefening9B(){
        Scanner s = new Scanner(System.in);
        int kleinste = Integer.MAX_VALUE;
        int grootste = Integer.MIN_VALUE;

        boolean doorgaan = true;
        while (doorgaan){
            System.out.print("Geef een getal (0 om te stoppen): ");
            int getal = s.nextInt();

            // stopconditie
            if (getal == 0){
                doorgaan = false;
                break;
            }

            // controleren of dit het grootste/kleinste getal is
            if (getal < kleinste){
                kleinste = getal;
            }
            if (getal > grootste){
                grootste = getal;
            }
        }
        System.out.println("Het grootste van alle ingevoerde getallen is " + grootste + ".");
        System.out.println("Het kleinste is " + kleinste + ".");
    }
}
