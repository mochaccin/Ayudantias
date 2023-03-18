package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[][] vinilos = new String[100][3];

        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");

        System.out.println("Espacio maximo coleccion: " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        mostrarColeccion(vinilos);
    }

    private static void mostrarBusquedaArtista(String[][] vinilos, String artista) {

        if (buscarArtista(vinilos, artista)) {
            System.out.println("El artista: " + artista + " si esta en la coleccion\n");
        } else {
            System.out.println("El artista: " + artista + " NO esta en la coleccion\n");
        }
    }

    private static void mostrarTotal(String[][] vinilos) {
        System.out.println("Hay un total de " + totalVinilos(vinilos) + " vinilos en la coleccion.\n");
    }

    public static int totalVinilos(String[][] vinilos) {

        int contador = 0;

        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0] != null){contador++;}
        }

        return contador;

    }

    public static void agregarVinilo(String[][] vinilos, String artista, String album, String lanzamiento) {

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null){
                vinilos[i][0] = artista;
                vinilos[i][1] = album;
                vinilos[i][2] = lanzamiento;
                return;
            }
        }
    }

    public static void mostrarDisponibles(String[][] vinilos){
        System.out.println("Hay un total de: " + disponibles(vinilos) + " espacios disponibles en la coleccion.\n");
    }

    public static boolean buscarArtista(String[][] vinilos, String artista){

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null) {
                if(vinilos[i][0].equals(artista)){
                    return true;
                }
            }
        }
        return false;
    }

    public static int disponibles(String[][] vinilos) {

        int contador = 0;

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null) {contador++;}
        }
        return contador;
    }

    public static void mostrarColeccion(String[][] vinilos){

        int contador = 0;

        for (int i = 0; i < vinilos.length; i++) {

            if (vinilos[i][0] != null) {
                System.out.println("Fila " + (i+1) + ": " + vinilos[i][0] + " - " + vinilos[i][1] + " - " + vinilos[i][2]);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("La coleccion se encuentra vacia.");
        }

    }
}