package com.sofka.project.ejercicio17;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        Electrodomestico tv = new Televisor(100,"verde",'A',50,41,true);


        System.out.println(tv.precioFinal());

        System.out.println(tv);


    }
}
