package com.sofka.project.ejercicio7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa un numero diferente de 0 ");
        int numero = captura.nextInt();

        do{
            System.out.println("Ingresa un numero diferente de 0");
            numero = captura.nextInt();

        }
        while ( numero==0);
        System.out.println("Ingresaste el " + numero);


    }
}
