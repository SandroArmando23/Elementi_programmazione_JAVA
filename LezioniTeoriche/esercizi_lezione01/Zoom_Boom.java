package esercizi_lezione01;

public class Zoom_Boom {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Zoom Boom");
            } else if (i % 3 == 0) {
                System.out.println("Zoom");
            } else if (i % 5 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }
    }
}
