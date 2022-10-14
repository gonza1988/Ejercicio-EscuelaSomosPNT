/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioescuelita.entities;

/**
 *
 * @author GIGABYTE
 */
public class Fruta extends Producto{
    
    private String unidadDeVenta;

    public Fruta(String unidadDeVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Precio: $"+this.getPrecio()+" /// Unidad de venta: "+unidadDeVenta;
    }
    
    
}
