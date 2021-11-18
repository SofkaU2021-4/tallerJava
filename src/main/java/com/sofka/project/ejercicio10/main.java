package com.sofka.project.ejercicio10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa la frase a quitar espacios");
        String frase = captura.nextLine();
        String fraseNew= frase.replace(" ", "");
        System.out.println(fraseNew);

    }
}
