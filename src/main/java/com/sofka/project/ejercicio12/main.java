package com.sofka.project.ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame una palabra");
        String palabra1 = input.nextLine().toLowerCase();
        System.out.println("Dame una palabra");
        String palabra2 = input.nextLine().toLowerCase();
        int auxiliar = 0;
        List<String> listaDiferencias = new ArrayList<String>();
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }
        else if(palabra1.length()<=palabra2.length()){
            auxiliar = palabra2.length()-palabra1.length();
            for(int i=0; i<palabra1.length();i++){
                if(palabra1.charAt(i) != palabra2.charAt(i)){
                    listaDiferencias.add(String.valueOf(palabra1.charAt(i))); // si no esta, la a;ade
                    listaDiferencias.add(String.valueOf(palabra2.charAt(i)));
                    System.out.println("En el indice " + i + " hay una diferencia.");
                    System.out.println("En la palabra 1 hay: " + palabra1.charAt(i));
                    System.out.println("En la palabra 2 hay: " + palabra2.charAt(i));
                }
            }

        }else{
            auxiliar = palabra1.length()-palabra2.length();
            for(int i=0; i<palabra2.length();i++){
                if(palabra1.charAt(i) != palabra2.charAt(i)){
                    listaDiferencias.add(String.valueOf(palabra1.charAt(i)));
                    listaDiferencias.add(String.valueOf(palabra2.charAt(i)));
                    System.out.println("En el indice " + i + " hay una diferencia.");
                    System.out.println("En la palabra 1 hay: " + palabra1.charAt(i));
                    System.out.println("En la palabra 2 hay: " + palabra2.charAt(i));
                }
            }

        }

        System.out.println("La diferencia en la cantidad de letras es: " + auxiliar);
        System.out.println("La letras diferentes son: " + listaDiferencias);
    }
}
