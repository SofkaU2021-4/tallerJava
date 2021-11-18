package com.sofka.project.ejercicio17;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Electrodomestico e1=new Electrodomestico(200,100);
        Electrodomestico e2=new Electrodomestico();
        Electrodomestico e3= new Televisor(60,80);
        Electrodomestico e4= new Televisor();
        Electrodomestico e5=new Electrodomestico();
        Electrodomestico e6=new Lavadora(41,49);
        Electrodomestico e7=new Lavadora();
        Electrodomestico e8=new Televisor();
        Electrodomestico e9=new Electrodomestico(14,49);
        Electrodomestico e10=new Lavadora();
        ArrayList<Electrodomestico> Array =new ArrayList();
        Array.add(e1);
        Array.add(e2);
        Array.add(e3);
        Array.add(e4);
        Array.add(e5);
        Array.add(e6);
        Array.add(e7);
        Array.add(e8);
        Array.add(e9);
        Array.add(e10);

        double sumatotal = 0;
        double sumatv= 0;
        double sumalavadora= 0;
        for (Electrodomestico electrodomestico : Array) {
            System.out.println(electrodomestico.toString()+"Precio final=>"+ electrodomestico.precioFinal());
            sumatotal += electrodomestico.precioFinal();
        }

        sumatv = Array.stream().filter(y -> y instanceof Televisor).mapToDouble(Electrodomestico::precioFinal).sum();
        sumalavadora=Array.stream().filter(y -> y instanceof Lavadora).mapToDouble(Electrodomestico::precioFinal).sum();

        System.out.println("Suma de precios de Televisores es: "+sumatv);
        System.out.println("Suma de precios de Lavadoras es: "+sumalavadora);
        System.out.println("Suma total de electrodomesticos es: "+(sumatv+sumatv+sumalavadora));


    }
}
