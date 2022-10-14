
package ejercicioescuelita;

import ejercicioescuelita.service.SupermercadoService;


public class EjercicioEscuelita {

    
    public static void main(String[] args) {
        
        SupermercadoService superMercado = new SupermercadoService();
        
        superMercado.cargarLista();
        superMercado.mostrarLista();
        superMercado.ordenarListaPorPrecio();
        System.out.println("==============================");
        superMercado.productoMasCaro();
        superMercado.productoMasBarato();
    }
    
}
