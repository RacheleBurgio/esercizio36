import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputStrings = new String[3];
        System.out.println("inserisci primo testo e poi Invio");
        inputStrings[0] = scan.nextLine();
        System.out.println("inserisci secondo testo e poi Invio");
        inputStrings[1] = scan.nextLine();
        System.out.println("inserisci terzo testo e poi Invio");
        inputStrings[2] = scan.nextLine();

        System.out.println("qua le string concatenate");
        System.out.println(inputStrings[0] + inputStrings[1] + inputStrings[2]);

        System.out.println("qua le string a reverso");
        System.out.println(inputStrings[2] + inputStrings[1] + inputStrings[0]);
        scan.close();
    }
}

