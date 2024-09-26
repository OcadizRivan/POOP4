/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author ivanos
 */
public class Triangulorectangulo {
    //Atributos
    float base;
    float altura;
    float hipotenusa;
    float angulo;
    float catetoAdy;
    
    //Constructor vacio
    public Triangulorectangulo(){
        base=0;
        altura=0;
        hipotenusa=0;
        angulo=0;
        catetoAdy=0;
        
    }
    
    
    //Constructor lleno
    public Triangulorectangulo(float base,float altura,float hipotenusa,float angulo,float catetoAdy){
        this.base=base;
        this.altura=altura;
        this.hipotenusa=hipotenusa;
        this.angulo=angulo;
        this.catetoAdy=catetoAdy;
        
    }
    
    
    //Metodos
    public void imprimirTriangulo(){
        System.out.println("Medidas del triangulo:");
        System.out.println("-Base: "+base);
        System.out.println("-Altura: "+altura);
        System.out.println("-Hipotenusa: "+hipotenusa);
        System.out.println("-Angulo: "+angulo);
        System.out.println("-Cateto Adyacente "+catetoAdy);
    }

    public void calcularArea(){
        float area = (base*altura)/2;
        System.out.println("El área es "+area);
    }
    
    public void calcularCoseno(){
        float coseno= catetoAdy/hipotenusa;
        System.out.println("El coseno es "+coseno);
    }
    
    public void calcularSecante(){
        float cosecante= hipotenusa/catetoAdy;
        System.out.println("La cosecante es: "+cosecante);
    }
    
    public void calcularAnguloComplementario(){
        float complementario= 180-(90+angulo);
        System.out.println("El tercer angulo es: "+complementario);
    }       
}

