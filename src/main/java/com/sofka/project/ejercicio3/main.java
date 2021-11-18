package com.sofka.project.ejercicio3;


import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);
        System.out.println("Ingresa radio del circulo a calcular");
        double radio = captura.nextDouble();

        double area= Math.PI*Math.pow(radio,2);

        System.out.println("el valor del area del circulo de radio " +radio + " es " +area);
    }
}
