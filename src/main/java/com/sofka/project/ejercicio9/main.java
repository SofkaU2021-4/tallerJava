package com.sofka.project.ejercicio9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String oldString1 = "La sonrisa sera la mejor arma contra la tristeza ";
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa la frase a concatenar");
        String concatenar = captura.nextLine();

        String newString1 = oldString1.replace("a", "e").concat(concatenar);

        System.out.println(newString1);

    }
}
