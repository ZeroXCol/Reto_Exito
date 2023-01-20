package task;


import interactions.MetodosJSON;

import static org.junit.Assert.fail;

public class AbrirNavegador {

    MetodosJSON metodosJSON;

    public void abrirNavegar() {

        try {
            metodosJSON.abrirSitioWeb("https://www.exito.com/");
        } catch (Exception e) {
            fail("Error seleccionando el carrito de compras " + e);
        }

    }


}
