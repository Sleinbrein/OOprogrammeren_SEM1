package Hoofdstuk1;

import java.util.Scanner;

public class Oefening8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geef een datum in <ddmmjjjj>: ");
        int curdatum = s.nextInt() / 10000;     // jaartal maakt niet uit
        int day = curdatum / 100;   int month = curdatum % 100000 % 10;
        System.out.printf("Het duur nog %d dagen voor het terug nieuwjaar is!", (13-month) * 30 - day);
    }
}




