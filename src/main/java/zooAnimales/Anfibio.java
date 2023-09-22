package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel,boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
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

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);

    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public String getColorPiel() {
        return colorPiel;
    }
}
