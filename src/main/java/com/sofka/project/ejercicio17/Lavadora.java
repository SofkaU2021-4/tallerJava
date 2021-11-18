package com.sofka.project.ejercicio17;


import java.util.Map;

public class Lavadora extends Electrodomestico {
    private double carga ;


    public Lavadora() {
        this.carga=  5;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga=5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    @Override
    public double precioFinal(){
        Map<String, Integer> consumoEnergetico = Map.of("A",100,"B",80,"C",60,"D",50,"E",30,"F",10);

        double precioTotal=consumoEnergetico.get(String.valueOf(getConsumoEnergetico()))+getPrecioBase();


        if(getPeso() >= 0 && getPeso() <= 19){
            precioTotal += 10;
        }
        else if (getPeso() >= 20 && getPeso() <= 30){
            precioTotal += 50;
        }
        else if(getPeso() >=31 && getPeso()<=49){
            precioTotal += 100;
        }
        else if (getPeso() >= 50 && getPeso() <= 79){
            precioTotal += 130;
        }
        else if (getPeso() >= 80){
            precioTotal += 150;
        }
        else{
            System.out.println("error");
        }
        return precioTotal;
    }
}
