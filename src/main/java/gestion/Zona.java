package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre=nombre;
        this.zoo=zoo;
    }

    public Zona() {

    }

    public String getNombre() {
        return nombre;
    }


    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }

    public Zoologico getZoo() {
        return zoo;
    }
}
