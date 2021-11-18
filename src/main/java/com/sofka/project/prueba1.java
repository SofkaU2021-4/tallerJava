package com.sofka.project;


import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("ingresa el nombre del usuario ");
        String nombre = captura.nextLine();
        System.out.println("ingresa el celular del usuario ");
        String celular = captura.nextLine();
        System.out.println("ingresa el Edad del usuario ");
        String edad = captura.nextLine();

        System.out.println("Bienvenido señor "+nombre+", es un placer para nosotros contar con una persona de "+edad+" años."+ "\n" + "Próximamente nos comunicaremos con usted al numero "+celular+"."+ "\n" + "Feliz día");
        


    }
}
