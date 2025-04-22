package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    private WebDriver driver;

    private By slipDeSalidaLocator = By.id("slipDeSalidaId");
    private By documentosOriginalesHistorialLocator = By.id("docOriginalesHistorialId");
    private By datosExtraidosHistorialLocator = By.id("datosExtraidosHistorialId");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        // Implementación del inicio de sesión
    }

    public void cargarYProcesarDocumentos() {
        // Implementación de la carga y procesamiento de documentos
    }

    public boolean isSlipDeSalidaGenerado() {
        WebElement slipDeSalida = driver.findElement(slipDeSalidaLocator);
        return slipDeSalida.isDisplayed();
    }

    public boolean isDocumentosOriginalesGuardados() {
        WebElement documentosOriginales = driver.findElement(documentosOriginalesHistorialLocator);
        return documentosOriginales.isDisplayed();
    }

    public boolean isDatosExtraidosGuardados() {
        WebElement datosExtraidos = driver.findElement(datosExtraidosHistorialLocator);
        return datosExtraidos.isDisplayed();
    }
}