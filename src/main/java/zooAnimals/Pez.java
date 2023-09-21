package zooAnimals;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public Pez(String colorEscamas,int cantidadAletas,String nombre, int edad, String habitat, String genero, Zona zona){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    public Pez(){
        listado.add(this);
    }
    public static int cantidadPeces(){
        return listado.size();
    }
    public String  movimiento(){
        return "nadar";
    }
    public Pez crearSalmon(String nombre, int edad,String genero, Zona zona){
        salmones++;
        return new Pez("rojo",6,nombre,edad,"oceano",genero,zona);

    }
    public Pez crearBacalo(String nombre, int edad,String genero, Zona zona){
        bacalaos++;
        return new Pez("gris    ",6,nombre,edad,"oceano",genero,zona);

    }
}
