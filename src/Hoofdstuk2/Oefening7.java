package Hoofdstuk2;

import java.util.Scanner;

public class Oefening7 {
    public static void main(String[] args) {
        oefening7C();
    }

    private static void oefening7A(){
        Scanner s = new Scanner(System.in);

        // deze oplossing is performanter
        int som = 0;
        for(int i = 12; i<= 500; i+=12){
            som += i;
        }
//
//        for (int i = 1; i <= 500; i++){
//            if (i % 12 == 0){
//                som += i;
//            }
//        }
        System.out.println("De som van alle gehele getallen tussen 1 en 500 deelbaar door 12 is: " + som);
    }


    private static void oefening7B(){

        // performanter
        for (int i = 51; i >=0; i-=2){
            System.out.printf("%d ", i);
        }
        System.out.println();


//
//        for (int i = 51; i >= 0; i--){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }
    }

    private static void oefening7C(){
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }
}
