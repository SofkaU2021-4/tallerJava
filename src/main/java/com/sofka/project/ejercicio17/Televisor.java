package com.sofka.project.ejercicio17;

import java.util.Map;

public class Televisor extends Electrodomestico{
    private double resolucion ;
    private boolean sintonizadorTDT ;

    public Televisor() {
        this.resolucion=20;
        this.sintonizadorTDT=false;
    }

    public Televisor(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion=20;
        this.sintonizadorTDT=false;
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        Map<String, Integer> consumoEnergetico = Map.of("A",100,"B",80,"C",60,"D",50,"E",30,"F",10);

        double precioTotal=consumoEnergetico.get(String.valueOf(getConsumoEnergetico()))+getPrecioBase();


        if(getPeso() >= 0 && getPeso() <= 19){
            precioTotal += 10;
        }
        else if (getPeso() >= 20 && getPeso() <= 49){
            precioTotal += 50;
        }
        else if (getPeso() >= 50 && getPeso() <= 79){
            precioTotal += 80;
        }
        else if (getPeso() >= 80){
            precioTotal += 100;
        }
        else{
            System.out.println("error");
        }



        if(sintonizadorTDT==true){
            precioTotal +=50;
        }


        if(resolucion>40){
            precioTotal += precioTotal*0.3;
        }


        return precioTotal;
    }
}
