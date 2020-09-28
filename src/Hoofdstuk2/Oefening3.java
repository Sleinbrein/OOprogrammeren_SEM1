package Hoofdstuk2;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, k;

        // invoer van een waarde voor i
        i = s.nextInt();

        if (i == 1){
            k = 3;
        }else if(i == 2){
            k = 6;
        }else if(i == 3 || i ==4){
            k = 20;
        }

    }

    private void oefening3B(){
        Scanner s = new Scanner(System.in);
        int x,y = 0;

        // invoer van een waarde voor x
        x = s.nextInt();

        if (x == 100 || x == 150 || x == 170 || x == 199){
            y++;
        }

    }
}
