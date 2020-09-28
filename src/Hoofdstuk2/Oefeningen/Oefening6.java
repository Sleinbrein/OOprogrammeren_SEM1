package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef een strikt positief geheel getal in: ");
        int getal = s.nextInt();

        // toon alle delers van dit getal als getal strikt positief is.
        if (getal >= 0){
            System.out.print("De delers zijn: ");
            for (int i = 1; i <= getal/2; i++){
                if (getal % i == 0){
                    System.out.print(i + "   ");
                }
            }
            System.out.print("en " + getal);
        }
    }
}
