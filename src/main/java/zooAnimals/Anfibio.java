package zooAnimals;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String colorPiel,boolean venenoso,String nombre, int edad, String habitat, String genero, Zona zona) {
        listado.add(this);
    }

    public Anfibio() {
        listado.add(this);
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public String  movimiento() {
        return "saltar";

    }

    public Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        ranas++;
        return new Anfibio("rojo",true,nombre,edad,"selva",genero,zona);
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        salamandras++;
        return new Anfibio("negro y amarillo",false,nombre,edad,"selva",genero,zona);

    }
}
