package userinterfaces;

import org.openqa.selenium.By;


public class TelevisoresPage {
    private static By itemAgregarProducto;
    private static By nombreProducto;
    private static By valorProducto;
    private static By adicionarMasProductos;
    public static By BOTONES_AGREGAR_TELEVISORES_PAGE = By.xpath("(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 '])");
    public static By BOTONES_AGREGAR_TELEVISORES_PAGE2 = By.xpath("(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 '])[16]");
    public static By CONTADOR_CARRITO_TELEVISORES_PAGE = By.xpath("//div[@class='exito-header-3-x-minicartContainer']//a[@class='exito-header-3-x-minicartLink']");
    public static By BOTONES_ADICIONAR_PRODUCTO_TELEVISORES_PAGE = By.xpath("//section[@class='vtex-product-summary-2-x-container vtex-product-summary-2-x-container--productDefaultDescription vtex-product-summary-2-x-containerNormal vtex-product-summary-2-x-containerNormal--productDefaultDescription overflow-hidden br3 h-100 w-100 flex flex-column justify-between center tc']//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']");
    public static By BOTONES_MOSTRAR_MAS = By.xpath("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-small t-action--small bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer ']");
    public static By ALERTA_DISPONIBILIDAD = By.xpath("//div[contains(text(),'No está disponible la cantidad deseada para')]");
    public static By CERRAR_ALERTA_DISPONIBILIDAD = By.xpath("//div[@class='vtex-alert__close-icon pointer flex items-center pa3 white nr3 nv3']");


    public static By getItemAgregarProducto() {
        return itemAgregarProducto;
    }

    public static void setItemAgregarProducto(String nombreProducto) {
        itemAgregarProducto = By.xpath("(//span[contains(text(),'*')]//following::span[contains(text(),'Agregar')])[1]//ancestor::button".replace("*", nombreProducto));
    }

    public static By getNombreProducto() {
        return nombreProducto;
    }

    public static void setNombreProducto(String numeroRandom) {
        nombreProducto = By.xpath("(//span[@class='vtex-store-components-3-x-productBrand '])[*]".replace("*", numeroRandom));
    }

    public static By getValorProducto() {
        return valorProducto;
    }

    public static void setValorProducto(String numeroRandom) {
        valorProducto = By.xpath("(//div[@class='exito-vtex-components-4-x-PricePDP']//span[@class='exito-vtex-components-4-x-currencyContainer'])[*]".replace("*", numeroRandom));
    }

    public static By getAdicionarMasProductos() {
        return adicionarMasProductos;
    }

    public static void setAdicionarMasProductos(String producto) {
        adicionarMasProductos = By.xpath("(//span[contains(text(),'*')]//following::button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus'])[1]".replace("*", producto));
    }
}

