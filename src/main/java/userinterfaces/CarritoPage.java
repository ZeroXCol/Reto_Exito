package userinterfaces;

import org.openqa.selenium.By;

public class CarritoPage {

    public static By nombreDeProductoCarritoPage;
    public static By valorDeProductoCarritoPage;
    public static By valorTotalProductoCarritoPage;

    public static By cantidadProductoCarritoPage ;
    public static By TOTAL_CARRITO_PAGE = By.xpath("//td[@class='monetary exito-checkout-monetary']");
    public static By CANTIDAD_MAXIMA_PRODUCTOS = By.xpath("//tr[@class='product-item'][6]");


    public static By getNombreDeProductoCarritoPage() {
        return nombreDeProductoCarritoPage;
    }
    public static void setNombreDeProductoCarritoPage(String nombreDeProducto) {
        nombreDeProductoCarritoPage = By.xpath("//a[contains(text(),'*')]".replace("*", nombreDeProducto));
    }

    public static By getValorTotalProductoCarritoPage() {
        return valorDeProductoCarritoPage;
    }

    public static void setValorTotalProductoCarritoPage(String nombreDeProducto) {
       valorDeProductoCarritoPage = By.xpath("(//a[contains(text(),'*')]//following::span[@class='total-selling-price'])[1]".replace("*", nombreDeProducto));
    }

    public static By getValorProductoCarritoPage() {
        return valorTotalProductoCarritoPage;
    }

    public static void setValorProductoCarritoPage(String nombreDeProducto) {
        CarritoPage.valorTotalProductoCarritoPage = By.xpath("(//a[contains(text(),'*')]//following::span[@class='new-product-price'])[1]".replace("*", nombreDeProducto));
    }

    public static By getCantidadProductoCarritoPage() {
        return cantidadProductoCarritoPage;
    }

    public static void setCantidadProductoCarritoPage(String nombreDeProducto) {
        cantidadProductoCarritoPage = By.xpath("(//a[contains(text(),'*')]//following::td[@class='quantity-price']//span[@class='total-selling-price'])[1]".replace("*", nombreDeProducto));
    }
}
