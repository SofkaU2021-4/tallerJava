package com.sofka.project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String invertido = "";
        int numero =0;
        int suma = 0;
        String textNumero;

        System.out.println("Ingrese el número: ");
        textNumero = scanner.nextLine();
        numero = Integer.parseInt(textNumero);

        for(int x = 0; x <= textNumero.length() - 1; x++){
            int aux = numero%10;
            invertido += aux;
            suma += aux;
            numero = numero/10;
        }
        System.out.println("Suma de digitos: " + suma);
        System.out.println("Numero invertido: " + invertido);
    }
}
