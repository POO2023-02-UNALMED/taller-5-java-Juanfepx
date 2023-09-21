package zooAnimals;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public Reptil(String colorEscamas,int largoCola,String nombre, int edad, String habitat, String genero, Zona zona){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil(){
        listado.add(this);
    }

    public static int cantidadReptiles(){
        return listado.size();
    }
    public String  movimiento(){
        return "reptar";
    }
    public Reptil crearIguana(String nombre, int edad,String genero, Zona zona){
        iguanas++;
        return new Reptil("verde",3,nombre,edad,"humedal",genero,zona);
    }
    public Reptil crearSerpiente(String nombre, int edad,String genero, Zona zona){
        serpientes++;
        return new Reptil("blanco",1,nombre,edad,"jungla",genero,zona);
    }

}
