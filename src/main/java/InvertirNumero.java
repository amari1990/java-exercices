package main.java;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero = numero / 10;
        }

        System.out.println("El número invertido es: " + numeroInvertido);
        scanner.close();
    }
}
