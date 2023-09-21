package zooAnimals;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(boolean pelaje, int patas, String habitat, String nombre, int edad, String genero, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }
    public Mamifero(){
        listado.add(this);
    }
    public int cantidadMamiferos() {
        return listado.size();
    }

    public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos++;
        return new Mamifero(true, 4, "pradera", nombre, edad, genero, zona);
    }

    public Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        leones++;
        return new Mamifero(true, 4, "selva", nombre, edad, genero, zona);
    }

}
