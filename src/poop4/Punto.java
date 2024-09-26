/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Punto {
    //Zona de Atributos
    int x;
    int y;
    String nombre;

    //Constructor vacio
    public Punto(){
        x=0;
        y=0;
        nombre=null;
    }
    
    
    
    //Constructor lleno
    public Punto(int x, int y, String nombre){
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    
    
    
    
    //Metodos
    public void imprimePunto(){
        System.out.println("(x="+x+" , y="+y+") Nombre= "+nombre);
    }
    
}
