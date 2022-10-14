/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioescuelita.entities;

/**
 *
 * @author GIGABYTE
 */
public class Bebida extends Producto{
    
    private double litros;

    
    public Bebida(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {

        return "Nombre: "+this.getNombre()+" /// Litros: "+litros+" /// Precio: $"+this.getPrecio();
    }
    
    
}
