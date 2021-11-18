package com.sofka.project;

import java.util.Scanner;

public class CapturaConsola {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("ingresa un dato ");
        String dato = captura.nextLine();
        System.out.println("lo que metiste "+dato);

    }
}
