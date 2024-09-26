/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Alumno {
    //Zona de atributos
    String nombre;
    int numDeCuenta;
    int edad;
    String carrera;
    float promedio;
    
    //Constructor Vacio
    public Alumno(){
        nombre = null;
        numDeCuenta = 0;
        edad = 0;
        carrera = null;
        promedio = 0;
}
    
    //Constructor Lleno
    public Alumno(String nombre, int numDeCuenta, int edad, String carrera, float promedio){
        this.nombre=nombre;
        this.numDeCuenta=numDeCuenta;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
    }   
    
    
    //Métodos
    public boolean estudiar(){
        System.out.println("Mañana tengo practica de POO, voy a estudiar");
        return true;
    }
    
    public void participar(){
        System.out.println("MMMMM, de hecho profesor, soy de "+carrera);
    }
    
    public boolean exentar(){
        System.out.println("Debí estudiar más, haré el final ):");
        System.out.println("mi promedio es de "+promedio);
        return false;
    }
    
    public void hacerTarea(){
        System.out.println("Estoy haciendo la practica, un pendiente menos");
    }
    
    public void asistir(){
        System.out.println("Buenos días profe, otro día más a las 7 de la mañana");
    }
    
}
