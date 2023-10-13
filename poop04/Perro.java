/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop04;

/**
 *La clase Perro representa a un perro con atributos como nombre, raza, color y edad.
 *Además, contiene métodos que simulan acciones que un perro puede realizar.
 * @author lilian
 */
public class Perro {
    /**
     * Atributos de la clase Perro
     */
    String nombre, raza, color;
    int edad;
    
    /**
     * Constructor predeterminado de la clase Perro.
     */
    public Perro() {
    }
    /**
     * Constructor de la clase Perro que inicializa los atributos con los valores proporcionados
     * @param nombre:El nombre del perro
     * @param raza: La raza del perro
     * @param color:El color del perro 
     * @param edad:La edad del perro  
     */

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    /**
     * 
     * Método que simula la acción de un perro sentado.
     */
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    /**
     * Método que simula ladridos de un perro
     * @param veces: La cantidad de ladridos que el perro realizará 
     */
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Woof");
        }
    }
    /**
     * Método que simula la acción de un perro corriendo una distancia específica
     * @param distancia: La distancia que el perro corrió 
     */
    public void corre (int distancia){
        System.out.println("Corrí" + distancia+ "m");
    }
    /**
     * Método que simula la acción de un perro durmiendo durante cierta cantidad de horas
     * @param horas: La cantidad de horas que el perro durmió 
     */
    public void duerme (int horas){
        System.out.println("Dormí"+ horas+ "horas");
    }
    /**
     * Método toString que devuelve una representación de cadena del objeto Perro
     * @return La representación de cadena del objeto Perro
     */

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
}
    
