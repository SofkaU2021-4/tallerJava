package com.sofka.project.ejercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner captura = new Scanner(System.in);

        System.out.println("Ingresa el valor de la varible 'A'");
            int a = captura.nextInt();


        System.out.println("Ingresa el valor de la varible 'B' ");
            int b = captura.nextInt();

        if (a>b){
            System.out.println("la varible 'A' es mayor que la varible 'B'");

        }
        else if(a<b) {
            System.out.println("la varible 'B' es mayor que la variable 'A' ");
        }
        else {
            System.out.println("'A' y 'B' son iguales");

        }
    }
}
