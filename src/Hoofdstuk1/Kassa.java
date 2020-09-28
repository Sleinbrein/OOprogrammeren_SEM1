package Hoofdstuk1;

// oefening 3
public class Kassa {
    public static void main(String[] args) {
        int ontvangenBEdrag = 100;
        int teBetalen = 45;

        System.out.println("Te betalen = " + teBetalen);
        System.out.println("Ontvangen bedrag = " + ontvangenBEdrag);
        System.out.println("Terug = " + (ontvangenBEdrag - teBetalen));
    }
}
