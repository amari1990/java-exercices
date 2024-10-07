package main.java;


import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        int contadorVocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La palabra tiene " + contadorVocales + " vocales.");
        scanner.close();
    }
}
