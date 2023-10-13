/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop04;

/**
 * Clase principal: contiene el metodo main para ejecutar el programa
 * @author lilian
 */
public class POOP04 {
    public static void main(String[] args) {
        /**
         * Objeto punto : sin argumentos y llama a imprimirPunto
         */
        Punto punto = new Punto();
        punto.imprimirPunto();
        
        /**
         * Objeto punto con coordenadas (3,5) y llama a imprimirPunto 
         */
        Punto punto2 = new Punto (3, 5); 
        punto2.imprimirPunto(); 
        /**
         * Metodo toString: imprime el objeto 
         */
        System.out.println(punto);
        
        /**
         * Objeto perro: muestra la información con el Metodo toString
         */
        Perro perro = new Perro("Max" , "Chihuahua" , "Negro" , 2);
        System.out.println(perro);
        
        /**
         * Objeto coche: muestra información con el metodo toString
         */
        Coche coche = new Coche ("Mazda" , "erer", "rojo", "estandar" , "diesel");
        System.out.println(coche);  
        
        /**
         * Objeto alumno: muestra información con el metodo toString
         */
        Alumno alumno = new Alumno ("Lilian De la Peña Osorio", "Femenino", " Tercer semestre", 20,55243338);
        System.out.println(alumno);

    }
    
}
