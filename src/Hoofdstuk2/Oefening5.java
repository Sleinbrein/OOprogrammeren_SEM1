package Hoofdstuk2;

public class Oefening5 {
    public static void main(String[] args) {

        // oefening5A
        // output is telkens het kwadraat van de reeks 1, 2, 3, ...
        int y,x = 1, total = 0;

        while (x <= 10){
            y = x * x;
            System.out.printf("%d%n", y);
            total += y;
            ++x;
        }
        System.out.printf("Total is %d%n", total);


        //oefening5B
        int count = 1;

        // hier is het aan te raden om een for-loop te gebruiken ipv een while aangezien je op voorhand weet hoeveel iteraties er zijn. (hier: 10)
        while (count <= 10){
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }

    }
}
