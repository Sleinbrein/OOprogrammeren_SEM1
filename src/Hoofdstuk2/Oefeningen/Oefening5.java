package Hoofdstuk2.Oefeningen;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Geef getal 1 in: ");
        int curnum = s.nextInt();

        // hold the highest value
        int largest_number = curnum;


        for (int i = 2; i <= 10; i++){
            System.out.printf("Geef getal %d in: ", i);
            curnum = s.nextInt();
            if (curnum > largest_number){
                largest_number = curnum;
            }
        }
        System.out.println("Het op een na grootste getal is " + largest_number);
    }
}
