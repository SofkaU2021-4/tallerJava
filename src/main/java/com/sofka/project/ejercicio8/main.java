package com.sofka.project.ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingresa un dia de la semana");
        String dia= captura.nextLine().toLowerCase() ;


        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("dia no laboral");
                break;
            default:
                System.out.println("ingreso erroneo");
                break;
        }

    }
}
