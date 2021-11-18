package com.sofka.project.ejercicio18;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //****
        Serie s1=new Serie("Time",5,"cienca ficcion","anonimo");
        Serie s2=new Serie();
        Serie s3=new Serie("Time",9,"cienca ficcion","anonimo");
        Serie s4=new Serie("Time",6,"cienca ficcion","anonimo");
        Serie s5=new Serie();


        s1.entregar();
        s3.entregar();

        //**videojuegos
        VideoJuego vj1=new VideoJuego("callof",5,"guerra","bioware");
        VideoJuego vj2=new VideoJuego();
        VideoJuego vj3=new VideoJuego("pubg",8,"guerra","ara");
        VideoJuego vj4=new VideoJuego();
        VideoJuego vj5=new VideoJuego("KILLZONE",40,"ZOMBIE","ara");

        vj1.entregar();
        vj4.entregar();
        vj5.entregar();

        ArrayList<Serie> ArraySeries=new ArrayList<>();
        ArraySeries.add(s1);
        ArraySeries.add(s2);
        ArraySeries.add(s3);
        ArraySeries.add(s4);
        ArraySeries.add(s5);
        ArrayList<VideoJuego> ArrayVideoJuego=new ArrayList<>();
        ArrayVideoJuego.add(vj1);
        ArrayVideoJuego.add(vj2);
        ArrayVideoJuego.add(vj3);
        ArrayVideoJuego.add(vj4);
        ArrayVideoJuego.add(vj5);


        int seriesentregados= 0;
        Serie mayorserie=new Serie();
        int mayor=0;
        for (Serie serie : ArraySeries) {
            if (serie.getNrodetemporadas()>mayor){
                mayor=serie.getNrodetemporadas();
                mayorserie=serie;
            }
            if (serie.isEntregado()) {
                seriesentregados += 1;
                serie.devolver();
            }
        }
        VideoJuego mayorvideos=new VideoJuego();
        int mayorv=0;
        int videojuegosentregados=0;
        for (VideoJuego videojuego : ArrayVideoJuego) {

            if (videojuego.getHoras()>mayorv){
                mayorv=videojuego.getHoras();
                mayorvideos=videojuego;
            }
            if (videojuego.isEntregado()) {
                videojuegosentregados += 1;
                videojuego.devolver();
            }
        }
        System.out.println("Las Series entregados: "+seriesentregados);
        System.out.println("Los videojuego entregados: "+videojuegosentregados);
        System.out.println("*******VIDEO JUEGO CON MAS HORAS********");
        System.out.println(mayorserie.toString());
        System.out.println("*******SERIE CON MAS TEMPORADAS********");
        System.out.println(mayorvideos.toString());

    }
}
