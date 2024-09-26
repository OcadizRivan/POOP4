/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Perro {
    //Zona de Atributos
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
    float x,y,z;
    
    //Constructor vacio
    public Perro(){
        color=null;
        pelaje=null;
        tamaño=0;
        raza=null;
        edad=0;
        x=0;
        y=0;
        z=0;
        
    }    
    
    //Constructor lleno
    public Perro(String color, String pelaje, int tamaño, String raza, int edad){
        this.color=color;
        this.pelaje=pelaje;
        this.tamaño=tamaño;
        this.raza=raza;
        this.edad=edad;
    }    

    
    //Metodos
    
    public void imprimirPerro(){
        System.out.println("Color:"+color);
        System.out.println("Pelaje:"+pelaje);
        System.out.println("Tamaño:"+tamaño);
        System.out.println("Raza:"+raza);
        System.out.println("Edad: "+edad+" años");
    }
    
    public void jugar(){
        System.out.println("Wow wow! Qué divertido");
    }
    
    public boolean comer(){
        System.out.println("Qué ricas croquetas");
        return true;
    }  
    
    public void correr(){
        System.out.println("Estoy corriendo mucho wow wow me canso");
        
    }

    public void morder(){
        System.out.println("GRRRRRR ");
        
    }    

    public void saltar(float x,float y,float z){
        System.out.println("Salté a "+x+", "+y+", "+z);
        System.out.println("soy un perro gordo, me cuesta saltar");        
    }
    
}
