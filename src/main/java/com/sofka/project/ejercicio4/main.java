package com.sofka.project.ejercicio4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingresa el valor del producto");
        double precio = captura.nextDouble();
        double precioIva= (precio*0.21)+precio;

        System.out.println("EL VALOR DEL PRODUCTO CON IVA ES " +precioIva);
    }
}
