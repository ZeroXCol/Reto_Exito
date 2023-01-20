package task;

import interactions.MetodosJSON;
import userinterfaces.CarritoPage;
import userinterfaces.TelevisoresPage;

import static org.junit.Assert.fail;

public class CarritoCompras {

    MetodosJSON metodosJSON;

    CapturaDatos capturaDatos = new CapturaDatos();

    public void seleccionarCarritoCompras() {
        try {
            metodosJSON.presionarTeclaEnter(TelevisoresPage.CONTADOR_CARRITO_TELEVISORES_PAGE);
        } catch (Exception e) {
            fail("Error seleccionando el carrito de compras " + e);
        }
    }

    public void validarNombresCarrito(){

        int cantidadProductos = 6;
        for (int i = 1; i < cantidadProductos; i++) {
            String [] capturaNombreProducto = capturaDatos.getNombreProducto();
            String nombreProducto = capturaNombreProducto[i];

            try {
            CarritoPage.setNombreDeProductoCarritoPage(nombreProducto);
            metodosJSON.capturarTexto(CarritoPage.getNombreDeProductoCarritoPage());
            }catch (Exception e){
                fail("Los nombres de productos seleccionados no coinciden en el carrito");
            }
        }
    }

}
