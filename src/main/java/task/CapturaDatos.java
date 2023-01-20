package task;

import interactions.MetodosJSON;
import userinterfaces.TelevisoresPage;

import static org.junit.Assert.fail;

public class CapturaDatos {
    MetodosJSON metodosJSON = new MetodosJSON();
    String[] arregloNombreProductos = new String[5];
    Double[] arregloPrecioProducto = new Double[5];
    int[] arregloCapturaCantidadProductos = new int[5];

    private String[] nombreProducto;
    private Double[] precioProducto;
    private int[] cantidadProducto;

    public String[] getNombreProducto() {
        return nombreProducto;
    }

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

    public void ingresarNombresProducto(String numeroRandomProducto, int i) {
        TelevisoresPage.setNombreProducto(numeroRandomProducto);
        String capturaNombreProducto = metodosJSON.capturarTexto(TelevisoresPage.getNombreProducto());
        arregloNombreProductos[i] = capturaNombreProducto;
        setNombreProducto(arregloNombreProductos);
    }

    public void ingresarPrecioProducto(String numeroRandomProducto, int i) {
        TelevisoresPage.setValorProducto(numeroRandomProducto);
        Double capturaValorProducto = metodosJSON.capturarValor(TelevisoresPage.getValorProducto());
        arregloPrecioProducto[i] = capturaValorProducto;
        setPrecioProducto(arregloPrecioProducto);

    }
    public void ingresarCantidadProducto(int numeroRandomCantidadProducto, int i) {
        arregloCapturaCantidadProductos[i] = numeroRandomCantidadProducto;
        setCantidadProducto(arregloCapturaCantidadProductos);
    }
}



