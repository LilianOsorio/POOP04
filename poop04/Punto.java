/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop04;

/**
 *La clase Punto representa un punto en un plano cartesiano con coordenadas (x, y)
 * @author lilian
 */
public class Punto {
    /**
     * Variables de instancia para almacenar las coordenadas x e y del punto
     */
     int x,y;
     /**
      *Constructor predeterminado de la clase Punto.
      *Este constructor no recibe parámetros y establece las coordenadas en 0
      */

    public Punto() { //sobrecarga: dos metodos de mismo nombre pero dif parametros
    }
    /**
     * Constructor parametrizado de la clase Punto
     * @param x La coordenada x del punto
     * @param y La coordenada y del punto
     */
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Método para imprimir las coordenadas del punto en la consola
     */
    
    public void imprimirPunto(){
        System.out.println("x=" + x+ ", y="+y);
    }
    /**
     * Método toString sobreescrito.
     * Convierte la referencia del objeto Punto en una representación de cadena
     * @return Una cadena que representa las coordenadas del punto
     */

    @Override //anotacion para programar (sobreescritura)
    public String toString() { //hace que se convierta la referencia en string
        return "Punto{" + "x=" + x + ", y=" + y + '}'; //nombre de la clase
    }
    
    
}
    
