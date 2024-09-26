/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Carro {
    //Zona de atributos
    String marca;
    int anio;
    String color;
    float velocidad;
    int puertas;
    
    //Constructor Vacio
    public Carro(){
        marca = null;
        anio = 0;
        color = null;
        velocidad = 0;
        puertas = 0;
}
    
    //Constructor Lleno
    public Carro(String marca, int anio, String color, float velocidad, int puertas){
        this.marca=marca;
        this.anio=anio;
        this.color=color;
        this.velocidad=velocidad;
        this.puertas=puertas;
    }   
    
    
    //Métodos
    public void acelerar(){
        System.out.println("Voy demasiado rápido, piso el acelerador");
        System.out.println("Voy a "+ velocidad +"km/hora");
    }
    
    public boolean encender(){
        System.out.println("Auto encendido, hola!");
        return true;
    }
    
    public boolean apagar(){
        System.out.println("Auto apagado, adiós!");
        return true;
    }
    
    public void frenar(){
        System.out.println("Disminuyendo la velocidad...");
        System.out.println("Estamos detenidos");
    }
    
    public boolean chocar(){
        System.out.println("VAMOS A CHOCAR!!!");
        System.out.println("CRAAAAASSHHHHHHH!");
        return true;
    }
    
}
