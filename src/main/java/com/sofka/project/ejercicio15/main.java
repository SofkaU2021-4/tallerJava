package com.sofka.project.ejercicio15;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcion = 0 ;
        Scanner captura = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println(
                    "****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            opcion = captura.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("NUEVO ACTOR");
                    break;
                case 2 :
                    System.out.println("BUSCAR ACTOR");
                    break;
                case 3 :
                    System.out.println("ELIMINAR ACTOR");
                    break;
                case 4 :
                    System.out.println("MODIFICAR ACTOR");
                    break;
                case 5 :
                    System.out.println("VER TODOS LOS ACTORES");
                    break;
                case 6 :
                    System.out.println("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7 :
                    System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORE");
                    break;
                case 8 :
                    exit = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
            }


        }
    }
}
