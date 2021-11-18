package com.sofka.project.ejercicio16;


import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String nombre[] = new String[3];
        char sexo[] = new char[3];
        int edad[] = new int[3];
        double peso[] = new double[3];
        double altura[] = new double[3];



        for (int i =0 ; i<3; i++){
            System.out.println("Ingresa el nombre  de la persona " +(i+1));
            nombre[i] = captura.nextLine();
            System.out.println("Ingresa el sexo 'H' para hombre  'M' para mujer ");
            sexo[i] = captura.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            System.out.println("Ingresa el edad ");
            edad[i] = Integer.parseInt(captura.nextLine());
            System.out.println("Ingresa el peso en kilogramos ");
            peso[i] = Double.parseDouble(captura.nextLine());
            System.out.println("Ingresa el altura metros");
            altura[i] = Double.parseDouble(captura.nextLine());


        }

        Persona persona1 =new Persona(nombre[0],edad[0],sexo[0],peso[0],altura[0]);
        Persona persona2= new Persona(nombre[1],edad[1],sexo[1]);
        persona2.setPeso(peso[1]);
        persona2.setAltura(altura[1]);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre[2]);
        persona3.setEdad(edad[2]);
        persona3.setSexo(sexo[2]);
        persona3.setPeso(peso[2]);
        persona3.setAltura(altura[2]);

        Persona personas[] = {persona1,persona2,persona3};

        for (int i = 0; i<personas.length;i++){
            if ( personas[i].calcularIMC() == 1  ){
                if (personas[i].esMayorDeEdad() == true){

                }else {
                        System.out.println(" La persona "+ (i+1)+ "  tiene sobrepeso y es menor de edad " + personas[i]);

                    }
                }
            else if(personas[i].calcularIMC() == 0){
                if (personas[i].esMayorDeEdad() == true){
                    System.out.println(" La persona "+ (i+1)+ " tiene peso ideal y es mayor de edad " + personas[i]);

                }else {
                    System.out.println(" La persona "+ (i+1)+ "  tiene peso ideal y es menor de edad " + personas[i]);

                }
            }
            else if(personas[i].calcularIMC() == -1){
                if (personas[i].esMayorDeEdad() == true){
                    System.out.println(" La persona "+ (i+1)+ " tiene bajo peso y es mayor de edad " + personas[i]);

                }else {
                    System.out.println(" La persona "+ (i+1)+ "  tiene bajo peso y es menor de edad " + personas[i]);

                }
            }
        }


    }
}
