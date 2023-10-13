/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop04;
/**
 *
 * @author lilian
 */
public class Alumno {
    String nombre, genero, grado;
    int edad, telefono; 
    public Alumno (){ 
    }
    public Alumno(String nombre, String genero, String grado, int edad, int telefono){
        this.nombre = nombre;
        this.genero = genero;
        this.grado = grado;
        this.edad = edad;
        this.telefono = telefono; 
    } 
    public void aprender (String materia){
        System.out.println("Hoy aprendí " + materia );
    }
    public void hablar (){
        System.out.println("Tengo que hablar más en clase ");
    }
    public void leer (){
        System.out.println("Leí un libro ");
    }
    public void pensar (){
        System.out.println("Tengo pensar en como resolver este ejercicio");
    }
    public void sentar (){
        System.out.println("Estuve sentado " );
    }
    @Override 
    public String toString(){
        return "Alumno{" + "nombre= " + nombre + ", genero=" + genero + ", grado=" + grado + ", edad=" + edad + ",telefono= " + telefono +'}';
    }        
}


