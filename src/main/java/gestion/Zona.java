package gestion;

import zooAnimals.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {

    }

    public Zona() {

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
