package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
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

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero,"cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero,"blanco y amarillo");
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    @Override
    public String getHabitat() {
        return super.getHabitat();
    }
}
