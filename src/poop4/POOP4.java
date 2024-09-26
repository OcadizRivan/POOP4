/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class POOP4 {
    
    public static void main(String[] args) {
       
        
        //Definiendo un punto o Creando un objeto del tipo Punto
        Punto punto = new Punto();
//      Clase,  variable = new constructor -> crea un objeto en memoria

        punto.imprimePunto();
        
        //Definiendo e inicializando un punto
        Punto punto2 = new Punto(1,2,"punto 2");
        punto2.imprimePunto();
        
        
        //Inflando un objeto
        punto.x=20;
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        
        
//Arroja el paquete donde se contiene, la clase, referencia de donde se contiene
//El arroba significa "en"
//Vas a encontrar una entidad Punto en la direccion 19469ea2
        System.out.println(punto);
        System.out.println("");
        
        
        
        //Definiendo e inicializando perro
        Perro perro1 = new Perro("Blanco","Suave",10,"Pastor Belga",8);
        
        perro1.imprimirPerro();
        
        perro1.jugar();
        
        perro1.comer();

        perro1.correr();
        
        perro1.morder();
        
        perro1.saltar(3.5f, 1.8f, 3.1f);
        
        
        System.out.println("");
        //Definiendo e inicializando carro
        Carro micarro = new Carro("Porsche",2018,"Rojo",100,2);
        
        micarro.acelerar();
        
        micarro.encender();
                
        micarro.apagar();
        
        micarro.frenar();
        
        micarro.chocar();
        
        
        System.out.println("");
        //Definiendo e inicializando Alumno
        Alumno yo = new Alumno("Iván Ocadiz", 321205476, 19, "Ingeniería en Computación", 8.97f);
        
        yo.estudiar();
        
        yo.participar();
        
        yo.exentar();
        
        yo.hacerTarea();
        
        yo.asistir();
        
        
        System.out.println("");
        //Definiendo e inicializando Profesor
        Profesor barbosa = new Profesor("José Antonio Ayala Barbosa", "Programación Orientada a Objetos",30000,"Martes, Jueves y Viernes de 7 a 9", "profesor de POO");
        
        barbosa.imprimirProfesor();
        
        barbosa.enseñar();
        
        barbosa.reprobar();
        
        barbosa.calificar();
        
        barbosa.asesorar();
        
        barbosa.darClase();        
        
        
        
        
        System.out.println("");
        //Definiendo e inicializando Triangulo Rectángulo
        Triangulorectangulo triangulo = new Triangulorectangulo(1.3f,3.2f,4f,34.5f,7.1f);
        
        triangulo.imprimirTriangulo();
        
        triangulo.calcularArea();
        
        triangulo.calcularCoseno();
        
        triangulo.calcularSecante();
        
        triangulo.calcularAnguloComplementario();
        
    }
    
}

// Proyecto POOP4 -> Mayusculas
// Paquete poop4 -> minusculas
// Clases -> Upper camel case
// Variables -> Lower camel case

//EL MISMO EJERCICIO DE PERRO PERO PARA EL RESTO DE DIAGRAMAS