package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geef een getal in: ");
        int getal = s.nextInt();

        if (getal > 0){
            getal-=10;
            System.out.println("Het ingegeven getal was strikt positief en werd verminderd met 10.");
        }else if(getal < 0){
            getal+=10;
            System.out.println("Het ingegeven getal was negatief en werd vermeerderd met 10.");
        }else{
            getal+=1;
            System.out.println("Het ingegeven getal was nul en werd vermeerderd met 1.");
        }

        System.out.println("Het heeft nu waarde " + getal);
    }
}
