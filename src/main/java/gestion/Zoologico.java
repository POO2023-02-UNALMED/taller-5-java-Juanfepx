package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    public Zoologico() {

    }

    public String getNombre() {
        return nombre;
    }

    public int cantidadTotalAnimales() {
        int contador = 0;
        for (Zona zona : zonas) {
            contador += zona.cantidadAnimales();
        }
        return contador;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

}
