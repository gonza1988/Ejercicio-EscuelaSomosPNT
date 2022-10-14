/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioescuelita.entities;

/**
 *
 * @author GIGABYTE
 */
public class Higiene extends Producto{
    
    private int contenido;

    
    public Higiene(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Contenido: "+contenido+"ml /// Precio: $"+this.getPrecio();
    }
    
    
    
}
