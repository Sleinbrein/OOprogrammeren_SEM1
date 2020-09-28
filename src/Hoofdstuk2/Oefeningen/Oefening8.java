package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int deler;
        do {
            System.out.print("Geef een strikt positieve deler in: ");
            deler = s.nextInt();
        }while (deler <= 0);

        int getal;
        int countnumber = 1;
        int aantal_deelbaar = 0;
        do {
            System.out.printf("Geef positief getal %d in (of stop met -1): ", countnumber);
            countnumber++;
            getal = s.nextInt();
            if (getal % deler == 0){
                aantal_deelbaar++;
            }
        }while (getal != -1);

        System.out.printf(aantal_deelbaar == 1 ? "Er is %d getal deelbaar door %d" : "Er zijn %d getallen deelbaar door %d", aantal_deelbaar, deler);
    }
}
