package Hoofdstuk1;

import java.util.Scanner;

public class Oefening9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geef een positief getal in: ");
        int getal = s.nextInt();

        for (int i = 1; i <= 10000; i*=10){
            System.out.print(String.format("%10s", i));
        }
        System.out.println();

        for (int i = 0; i <= 4; i++){
            System.out.print(String.format("%10s", getal));
            getal *= 10;
        }
    }
}
