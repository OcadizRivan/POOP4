/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Profesor {
    //Zona de atributos
    String nombre;
    String materia;
    int salario;
    String horario;
    String profesion;
    
    //Constructor vacio
    public Profesor(){
        nombre=null;
        materia=null;
        salario=0;
        horario=null;
        profesion=null;
    }
    
    //Constructor lleno
    public Profesor(String nombre, String materia, int salario, String horario, String profesion){
        this.nombre=nombre;
        this.materia=materia;
        this.salario=salario;
        this.horario=horario;
        this.profesion=profesion;
    }
    
    //Métodos
    public void imprimirProfesor(){
        System.out.println("Soy "+nombre);
        System.out.println("Imparto "+materia);
        System.out.println("Gano "+salario+" pesos mensuales");
        System.out.println("Doy clase "+horario);
        System.out.println("Me dedico a ser"+profesion);
    }
    
    public void enseñar(){
        System.out.println("Y así se hace un objeto en Java");
    }
    
    public boolean reprobar(){
        System.out.println("No puede ser, me decepcionan, todos reprobados en "+materia);
        return true;
    }
    
    public float calificar(){
        System.out.println("Este examen se merece un 8");
        return 8f;
    }   
    
    public boolean asesorar(){
        System.out.println("Diganme todas sus dudas, yo se las resuelvo");
        return true;
    }
    
    public void darClase(){
        System.out.println("El día de hoy hablaremos de get y set en java");
    }
}
