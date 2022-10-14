/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioescuelita.entities;

import java.text.DecimalFormat;

/**
 *
 * @author GIGABYTE
 */
public abstract class Producto implements Comparable<Producto>{
    
    private String nombre;
    private int precio;

    

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
         return "Nombre: " + nombre + " /// Precio: $" + precio;
    }

    @Override
    public int compareTo(Producto prod) {
        return this.precio - prod.getPrecio();
    }
    
    
}
