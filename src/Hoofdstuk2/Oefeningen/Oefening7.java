package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int deelbaar2 = 0, deelbaar3 = 0, deelbaar6 = 0;

        System.out.print("Geef een postief gheel getal (stoppen met 0): ");
        int getal = s.nextInt();

        while (getal != 0){
            System.out.print("Geef een postief gheel getal (stoppen met 0): ");
            getal = s.nextInt();

            if (getal % 6 == 0){
                // deelbaar door 6 ==> deelbaar door 2, 3 en 6
                deelbaar2++; deelbaar3++; deelbaar6++;
            }else if(getal % 3 == 0){
                deelbaar3++;
            }else if (getal % 2 == 0){
                deelbaar2++;
            }
        }

        System.out.printf(deelbaar2 == 1 ? "Er is %d getal deelbaar door 2%n" : "Er zijn %d getallen deelbaar door 2%n", deelbaar2);
        System.out.printf(deelbaar3 == 1 ? "Er is %d getal deelbaar door 3%n" : "Er zijn %d getallen deelbaar door 3%n", deelbaar3);
        System.out.printf(deelbaar6 == 1 ? "Er is %d getal deelbaar door 6%n" : "Er zijn %d getallen deelbaar door 6%n", deelbaar6);
    }
}
