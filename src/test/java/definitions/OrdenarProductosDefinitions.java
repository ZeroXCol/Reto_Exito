package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import questions.ValidarDatosCarrito;
import task.*;

public class OrdenarProductosDefinitions {

    @Steps
    AbrirNavegador abrirNavegador;

    @Steps
    Categorias categorias;

    @Steps
    SeleccionarProductos seleccionarProductos;

    @Steps
    CarritoCompras carritoCompras;

    @Steps
    ValidarDatosCarrito validarDatosCarrito;

    @Steps
    CapturaDatos capturaDatos;

    @Given("Ingresar a Exito.com")
    public void ingresarAExitoCom() {
        abrirNavegador.abrirNavegar();
    }

    @And("Seleccionar Categoria")
    public void seleccionarCategoria() {
        categorias.seleccionarCategoria();
    }

    @Then("Seleccionar Productos Aleatoreos")
    public void seleccionarProductosAleatoreos() {
        seleccionarProductos.seleccionarProductosAleatoreos();
    }

    @And("Seleccionar carrito de compras")
    public void seleccionarCarritoCompras() {
        carritoCompras.seleccionarCarritoCompras();
    }

    @And("Validar datos carrito")
    public void validarDatosCarrito() {
        seleccionarProductos.validarNombresCarrito();
        seleccionarProductos.validarPrecioTotalProductosCarrito();
        seleccionarProductos.validarNumeroDeProductosCarrito();

    }


}
