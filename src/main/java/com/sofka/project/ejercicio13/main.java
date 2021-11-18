package com.sofka.project.ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formato.format(date));


    }
}
