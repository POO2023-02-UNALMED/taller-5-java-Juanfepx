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

    public String totalPorTipo() {
        return "Mamiferos:" + Mamifero.cantidadMamiferos() + "\n" + "Aves:" + Ave.cantidadaAves() + "\n" + "Reptiles:" + Reptil.cantidadReptiles() + "\n" + "Peces:" + Pez.cantidadPeces() + "\n" + "Anfibios:" + Anfibio.cantidadAnfibios();
    }

    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre + ",tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el" + zona.getZoo();
        } else {
            return "Mi nombre es " + nombre + ",tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
    }
}
