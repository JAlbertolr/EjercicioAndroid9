package com.example.ejercicioandroid9;

public class Almacen {
    private static String nombre;
    private static int contador = 0;


    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Almacen.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Almacen.contador = contador;
    }

    public static void incrementContador() {
        contador++;
    }



}
