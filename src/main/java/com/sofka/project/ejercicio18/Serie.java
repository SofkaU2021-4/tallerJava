package com.sofka.project.ejercicio18;

public class Serie implements Entregable{
    private String titulo="";
    private int nrodetemporadas=3;
    private boolean entregado=false;
    private String genero="";
    private String creador="";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int nrodetemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nrodetemporadas = nrodetemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //****GETTER Y SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNrodetemporadas() {
        return nrodetemporadas;
    }

    public void setNrodetemporadas(int nrodetemporadas) {
        this.nrodetemporadas = nrodetemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    //*******METODOS*********

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", nrodetemporadas=" + nrodetemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}