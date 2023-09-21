package zooAnimals;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String colorPlumas, String nombre, int edad, String habitat, String genero, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {
        listado.add(this);
    }

    public static int cantidadaAves() {
        return listado.size();
    }

    public String movimiento() {
        return "Volar";
    }

    public Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
        halcones++;
        return new Ave("cafe glorioso", nombre, edad, "montanas", genero, zona);
    }

    public Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
        aguilas++;
        return new Ave("blanco y amarillo", nombre, edad, "montanas", genero, zona);
    }
}
