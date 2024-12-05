/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.carlamancero2025.Clases;

import ec.edu.espoch.carlamancero2025.enumeraciones.Categoria;

/**
 *
 * @author SO-LAB1-PC20
 */
public class Producto {
    
   private String NombreProducto;
   private float Precio;
   private Categoria Categoria;
   
    public Producto() {
    }

    public Producto(String Nombre, float Precio) {
        this.NombreProducto = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return NombreProducto;
    }

    public void setNombre(String Nombre) {
        this.NombreProducto = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
   
    public void mostrarDetalles (){
        System.out.println("Nombre del producto: "+this.NombreProducto);
        
        System.out.println("Precio del producto: "+this.Precio);
   
    } 
  
    

   
   
   
   
   
   
   
   
   
   
}
