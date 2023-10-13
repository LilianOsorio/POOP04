/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop04;
/**
 * 
 *La clase Coche representa un automóvil con propiedades como marca, modelo, color, motor y tipo de combustible.
 *También incluye métodos para realizar acciones como avanzar, retroceder, prender, apagar y girar.
 *Proporciona un método toString para obtener una representación de cadena del objeto Coche.
*/
public class Coche {
    /**
     * Declara las variables de instancia para las propiedades del coche
     */
     String marca, modelo, color, motor, combustible;
     
    /**
     * Constructor predeterminado sin parámetros
     */
    public Coche() {
    }
    /**
     * Constructor que inicializa un objeto Coche con valores específicos
     * @param marca: la marca del coche
     * @param modelo: el modelo del coche
     * @param color: el color del coche
     * @param motor: el tipo de motor del coche
     * @param combustible : el tipo de combustible que usa el coche 
     */
    
    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    /**
     * Método para que el coche avance
     */
    public void avanzar (){
        System.out.println("El coche avanzó");
    }   
    /**
     * Método para que el coche retroceda
     */
    public void retroceder (){
        System.out.println("El coche retrocedió");
    }    
    /**
     * Método para encender el coche
     */
    public void prender(){
        System.out.println("Prendido");
    }    
    /**
     * Método para apagar el coche
     */
    public void apagar(){
        System.out.println("Apagado");
    }
    /**
     * Método para que el coche gire en la dirección especificada
     * @param lado: lado Dirección en la que el coche debe girar
     */
    public void girar(String lado){
        System.out.println("El coche gira a la "+ lado);
    }
    /**
     *  Sobrescribe el método toString para obtener una representación de cadena del objeto Coche
     * @return regresa la concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }   
}
   
