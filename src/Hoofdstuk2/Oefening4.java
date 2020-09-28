package Hoofdstuk2;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Oefening4A
        int age = s.nextInt();

        if (age >= 65){
            System.out.println("Age greater than or equal to 65");
        }else{
            System.out.println("Age is less then 65");
        }

        // oefening4B
        int x = 1, total = 0;
        while (x <= 10){
            total += x;
            ++x;
        }


        // oefening4C
        int z = 10;
        while (z <= 100){
            total += z;
            ++z;
        }
    }
}
