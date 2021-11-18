package com.sofka.project.ejercicio14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa un numero menor a 1000");
        int numeroIngresado = captura.nextInt();
        while (true){
            if (numeroIngresado < 1000){
                break;
            }
            System.out.println("error de ingreso de numero, ingresa otro ");
            numeroIngresado = captura.nextInt();
        }
        for (int i = numeroIngresado; i<1000 ; i=i+2){
            System.out.println(i);
        }

    }
}
