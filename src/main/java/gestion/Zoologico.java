package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {

    }

    public Zoologico() {

    }

    public int cantidadTotalAnimales() {
        int contador = 0;
        for (Zona zona : zonas) {
            contador += zona.cantidadAnimales();
        }
        return contador;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }
}
