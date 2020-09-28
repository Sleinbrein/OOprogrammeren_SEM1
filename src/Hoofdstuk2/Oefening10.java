package Hoofdstuk2;

import java.util.Scanner;

public class Oefening10 {
    public static void main(String[] args) {
        oefening10B();
    }

    private static void oefening10A(){
        Scanner s = new Scanner(System.in);
        int getal;

        do {
            System.out.print("Voor een strikte negatief oneven getal in: ");
            getal = s.nextInt();
        }while (getal > 0 || getal % 2 == 0);
    }

    private static void oefening10B(){
        Scanner s = new Scanner(System.in);
        int first, second;
        do {
            System.out.print("Eerste getal (!= 1000 en niet deelbaar door 12): ");
            first = s.nextInt();
            System.out.print("Tweede getal (groter dan " + first + "): ");
            second = s.nextInt();
        }while ((first == 1000 || first % 12 != 0) || (second < first));
    }
}
