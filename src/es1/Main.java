package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        System.out.println("Inserire il numero di parole da inserire: ");
        do {
            try {
                int n = scanner.nextInt();
                scanner.nextLine();
                Set<String> word = new HashSet<>();
                Set<String> duplicated = new HashSet<>();

                System.out.println("Inserisci " + n + " parolwe:");
                for (int i = 0; i < n; i++) {
                    String parola = scanner.nextLine();

                    if (!word.add(parola)) {
                        duplicated.add(parola);
                    }
                }

                System.out.println("Parole duplicate: " + duplicated);
                System.out.println("Numero di parole distinte: " + word.size());
                System.out.println("Elenco delle parole distinte: " + word);
                error = false;

            } catch (Exception ex) {
                System.out.println("ciao");
                scanner.nextLine();
                error = true;
            }
        }while (error);

    }
}