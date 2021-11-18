package com.sofka.project.ejercicio17;


import java.util.*;

public class Electrodomestico {

    private double precioBase ;
    private String color ;
    private char consumoEnergetico ;
    private int peso ;


    public Electrodomestico() {
        this.precioBase=100;
        this.color="blanco";
        this.consumoEnergetico='F';
        this.peso=5;

    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico='F';
        this.color="blanco";
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);

    }




    private void comprobarConsumoEnergetico(char letra){
        String consumoLetra ="ABCDEF";
        if(!consumoLetra.contains(String.valueOf(letra)) ){
            setConsumoEnergetico('F');
        }
    }
    private void comprobarColor(String color){
        String[] coloresAdmitidos = {"blanco","negro","gris","rojo","azul"};

        if(!Arrays.stream(coloresAdmitidos).anyMatch(color::equals)){
            setColor("blanco");

        }
    }


    public double precioFinal(){

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
        return precioTotal;

    }



    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
