package interactions;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterfaces.TelevisoresPage;

import java.time.Duration;

import static org.junit.Assert.fail;

public class MetodosJSON extends PageObject {

    public void abrirSitioWeb(String url) {
        try {
            getDriver().get(url);
            getDriver().manage().window().maximize();
        } catch (Exception e) {
            fail("Error abriendo el navegador");
        }
    }


    public String capturarTexto(By elemento) {
        String texto = getDriver().findElement(elemento).getText();
        return texto;

    }

    public Double capturarValor(By elemento) {
        String texto = getDriver().findElement(elemento).getText();
        String nuevoTexto = texto.substring(2).replaceAll("\\.", "");
        Double valorProducto = Double.parseDouble(nuevoTexto);
        return valorProducto;
    }

    public int capturarValorCarrito(By elemento) {
        String texto = getDriver().findElement(elemento).getText();
        String nuevoTexto = texto.substring(2).replaceAll("\\.", "");
        int valorTotalProducto = Integer.parseInt(nuevoTexto);
        return valorTotalProducto;
    }

    public void escribir(By elemento, String texto) {
        getDriver().findElement(elemento).clear();
        getDriver().findElement(elemento).sendKeys(new CharSequence[]{texto});
        getDriver().findElement(elemento).sendKeys(Keys.TAB);
    }

    public void presionarTeclaEnter(By elemento) {
        getDriver().findElement(elemento).sendKeys(Keys.ENTER);
    }

    public void escribirAndEnter(By elemento, String texto) {
        getDriver().findElement(elemento).clear();
        getDriver().findElement(elemento).sendKeys(texto);
        getDriver().findElement(elemento).sendKeys(Keys.ENTER);
    }

    public void scrollAElemento(By elemento) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(elemento));
        waitFor(5).seconds();
    }

    public void tiempoDeEspera(String segundos) {
        int sg = Integer.parseInt(segundos);
        waitFor(sg).seconds();
    }

    public void cerrarNavegador() {
        getDriver().quit();
    }

    public void esperarElementoVisible(By elemento) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
            wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        } catch (Exception e) {
            fail(" " + e);
        }
    }

    public void cliquear(By elemento) {
        getDriver().findElement(elemento).click();
    }

    public void recargarPagina() {
        getDriver().navigate().refresh();
    }

    public void rechazarAlerta() {
        WebDriver driver = new ChromeDriver();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void calibrarPagina() {
        esperarElementoVisible(TelevisoresPage.BOTONES_MOSTRAR_MAS);
        scrollAElemento(TelevisoresPage.BOTONES_MOSTRAR_MAS);
        esperarElementoVisible(TelevisoresPage.BOTONES_AGREGAR_TELEVISORES_PAGE);
        scrollAElemento(TelevisoresPage.BOTONES_AGREGAR_TELEVISORES_PAGE);
        esperarElementoVisible(TelevisoresPage.BOTONES_AGREGAR_TELEVISORES_PAGE2);
        scrollAElemento(TelevisoresPage.BOTONES_AGREGAR_TELEVISORES_PAGE2);
    }
}
