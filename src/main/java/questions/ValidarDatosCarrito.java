package questions;

import interactions.MetodosJSON;
import task.CapturaDatos;
import task.SeleccionarProductos;
import userinterfaces.CarritoPage;
import userinterfaces.TelevisoresPage;

import java.util.ArrayList;

import static org.junit.Assert.fail;

public class ValidarDatosCarrito extends CapturaDatos {

    MetodosJSON metodosJSON = new MetodosJSON();

    private String[] nombreProducto;
    private Double[] precioProducto;
    private int[] cantidadProducto;

    String[] capturaNombreProducto;

    public void setNombreProducto(String[] nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Double[] getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(Double[] precioProducto) {
        this.precioProducto = precioProducto;
    }
    public int[] getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int[] cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void validarNombresCarrito() {
        int cantidadProductos = 5;
        for (int i = 1; i < cantidadProductos; i++) {
            capturaNombreProducto = getNombreProducto();
            String nombreProducto = capturaNombreProducto[i];
            try {
                CarritoPage.setNombreDeProductoCarritoPage(nombreProducto);
                if (metodosJSON.isElementVisible(CarritoPage.getNombreDeProductoCarritoPage())) {
                    System.out.println("El nombre " + nombreProducto + " coincide.");
                } else {
                    fail("Los nombres de productos seleccionados no coinciden en el carrito");
                }
            } catch (Exception e) {
                fail("Error validando los nombres en el carrito");
            }
        }
    }

    public void validarPrecioTotalProductosCarrito() {
        int cantidadProductos = 6;
        for (int i = 1; i < cantidadProductos; i++) {
            try {
                String[] capturaNombreProducto = getNombreProducto();
                String nombreProducto = capturaNombreProducto[i];
                Double[] capturaPrecioProducto = getPrecioProducto();
                Double precioProducto = capturaPrecioProducto[i];
                int[] capturaCantidadProducto = getCantidadProducto();
                int cantidadProducto = capturaCantidadProducto[i];

                CarritoPage.setValorTotalProductoCarritoPage(nombreProducto);
                Double precioTotalProductoSeleccion = precioProducto * cantidadProducto;
                Double precioTotalProductoCarrito = metodosJSON.capturarValor(CarritoPage.getCantidadProductoCarritoPage());

                if (precioTotalProductoCarrito == precioTotalProductoSeleccion) {
                    System.out.println("Los valorer totales del producto " + nombreProducto + " coinciden");
                } else {
                    fail("Los valorest totales de los productos seleccionados no coinciden en el carrito");
                }

            } catch (Exception e) {
                fail("Error validando precios totales en el carrito");
            }
        }
    }

    public void validarNumeroDeProductosCarrito() {
        try {
            if (metodosJSON.isElementVisible(CarritoPage.CANTIDAD_MAXIMA_PRODUCTOS)) {
                fail("Error la cantidad de productos es superior a la seleccionada");
            }
        } catch (Exception e) {
            fail("Error validando el numero de productos seleccionados en el carrito");
        }

    }


}
