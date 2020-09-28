package Hoofdstuk1;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef een getal (>=999 en <=9999) in:");
        int getal = s.nextInt();

        if (getal >= 999 && getal <= 9999){
            // maak van het getal een string om de eenheden makkelijk weer te geven a.d.h.v indexering
            String getal_in_string = getal + "";

            System.out.println("Het getal bestaat uit:");
            System.out.printf("%s duizendtallen\n%s honderdtallen\n%s tientallen\n%s eenheden", getal_in_string.charAt(0), getal_in_string.charAt(1), getal_in_string.charAt(2), getal_in_string.charAt(3));
        }
    }
}
