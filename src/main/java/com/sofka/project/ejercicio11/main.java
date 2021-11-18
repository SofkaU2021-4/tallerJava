package com.sofka.project.ejercicio11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char aux;
        int vocales=0;

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa la frase a contar");
        String frase = captura.nextLine();
        String fraseNew= frase.replace(" ", "");

        for(int i = 0 ; i< frase.length();i++){

            aux= frase.charAt(i);
            if (aux == 'a' || aux=='e' || aux=='i' || aux=='o' || aux=='u' ){
                vocales +=1;
            }

        }
        System.out.println("tamaño de la frase con espacios : " +frase.length()+ " sin espacios :  "+ fraseNew.length() + " numero de vocales : " +vocales);

    }
}
