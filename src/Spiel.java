import java.util.Random;
import java.util.*;

/**
 *
 * @author M-N Kanti
 */
public class Spiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int versuche = 0;
        int raten = 0;
        boolean fertig = false;
        System.out.println("Willkommen zu Zahlen raten!");
        System.out.println("Rate meine Zahl!");

        Random rnd = new Random();
        int number = rnd.nextInt((100) + 1);
        boolean zahlEingegeben;

        Scanner sc = new Scanner(System.in);

        while (fertig == false) {
            do {
                zahlEingegeben = true;

                try {
                    raten = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Gib eine richtige Zahl ein, bitte.");
                    sc.next();
                    zahlEingegeben = false;
                }
            } while (zahlEingegeben == false);

            if (number > raten) {
                System.out.println("Die Zahl muss grösser sein");
            }

            if (number < raten) {
                System.out.println("Die Zahl muss kleiner sein");
            }

            if (number == raten) {
                System.out.println("Die Zahl ist richtig!");
                fertig = true;
            }
            versuche++;
        }
        System.out.println("Deine Versuche:" + versuche);
    }
}
