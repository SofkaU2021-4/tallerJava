package com.sofka.project.ejercicio16;

import java.lang.Math;


public class Persona {
    private String nombre ;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private  double altura;

    public Persona() {
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generaDNI();
        comprobarSexo(this.sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(this.sexo);
    }


    public  int calcularIMC(){
        double imc =(getPeso()/(Math.pow(getAltura(),2)));
        if (imc<20) {
            return -1;
        }
        else if(imc >= 20 && imc <= 25){
            return 0;

        }
        else {
        return 1;
        }

    }
    public boolean esMayorDeEdad(){
        if ( getEdad() >= 18){
            return true;
        }
        else {
            return false;
        }
    }
    private void comprobarSexo(char sexo){
        if(sexo != 'M' && sexo != 'H'){
            setSexo('H');
        }

    }
    public String generaDNI(){
        int dni = (int) (Math.random()*(99999999 + 10000000) + 10000000);
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        String dnifull =(Integer.toString(dni).concat(String.valueOf(caracteres.charAt(resto))));
        return dnifull;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}


