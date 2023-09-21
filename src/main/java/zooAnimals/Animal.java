package zooAnimals;

import gestion.Zona;

public class Animal {
    private static int totalAnimals;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        totalAnimals++;
    }

    public Animal() {
        totalAnimals++;
    }

    public String movimiento() {
       return "desplazarse";

    }

    public void totalPorTipo() {
        "Mamiferos:" "Aves:" "Reptiles:" "Peces:"
    }

    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre + "tengo una edad de" + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es" + zona + "en el" + zona.getZoo();
        } else {
            return "Mi nombre es " + nombre + "tengo una edad de" + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
    }
}
