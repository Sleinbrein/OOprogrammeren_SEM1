package Hoofdstuk2;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double temp = s.nextDouble();
        if (x >= 0){
            System.out.println("positief");
        }else{
            System.out.println("negatief");
        }

        if (temp <= 10){
            System.out.println("koud");
        }else if(temp >= 10 && temp <= 20){
            System.out.println("goed");
        }else{
            System.out.println("warm");
        }

        if (x >= 0){
            if (x % 2 == 0){
                System.out.println("positief en even");
            }else{
                System.out.println("positief en oneven");
            }
        }else{
            if (x % 2 == 0){
                System.out.println("negatief en even");
            }else{
                System.out.println("negatief en oneven");
            }
        }
    }
}
