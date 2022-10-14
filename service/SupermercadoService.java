/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioescuelita.service;

import ejercicioescuelita.entities.Bebida;
import ejercicioescuelita.entities.Fruta;
import ejercicioescuelita.entities.Higiene;
import ejercicioescuelita.entities.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author GIGABYTE
 */
public class SupermercadoService {

    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void cargarLista() {
        listaProductos.add(new Bebida(1.5, "Coca-Cola Zero", 20));
        listaProductos.add(new Bebida(1.5, "Coca-Cola", 18));
        listaProductos.add(new Higiene(500, "Shampoo Sedal", 19));
        listaProductos.add(new Fruta("kilo", "Frutillas", 64));

    }

    public void mostrarLista() {
        for (Producto prod : listaProductos) {
            System.out.println(prod);
        }
    }

    public void ordenarListaPorPrecio() {
        Collections.sort(listaProductos);
    }

    public void productoMasCaro() {
        System.out.println("Producto más caro: " + listaProductos.get(listaProductos.size() - 1).getNombre());
    }

    public void productoMasBarato() {
        System.out.println("Producto más barato: " + listaProductos.get(0).getNombre());
    }
}
