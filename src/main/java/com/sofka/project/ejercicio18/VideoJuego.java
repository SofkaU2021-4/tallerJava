package com.sofka.project.ejercicio18;

public class VideoJuego implements Entregable{
    private String titulo="";
    private int horas=10;
    private boolean entregado=false;
    private String genero="";
    private  String empresa="";


    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public VideoJuego(String titulo, int horas, String genero, String empresa) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.empresa = empresa;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    //****METODOS*********

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + empresa + '\'' +
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

    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }

}