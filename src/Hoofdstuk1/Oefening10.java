package Hoofdstuk1;

import java.util.Scanner;

public class Oefening10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geef eerste getal in: ");
        int one = s.nextInt();
        System.out.print("Geef tweede getal in: ");
        int two = s.nextInt();
        System.out.print("Geef derde getal in: ");
        int three = s.nextInt();

        System.out.printf("Van de ingevoerde getallen %s, %s en %s\n", one, two, three);
        int som = one + two + three;
        System.out.println("is de som " + (som));
        System.out.println("en het gemiddelde " + som / 3);
        System.out.println("en de rest " + som % 3);
    }
}
