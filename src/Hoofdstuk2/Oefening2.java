package Hoofdstuk2;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Aantal studenten: ");
        int aantal = s.nextInt();

        if (aantal == 1){
            System.out.println(aantal + " Student");
        }else{
            System.out.println(aantal + " Studenten");
        }
    }
}
