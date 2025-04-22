import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_002Page {
    private final WebDriver driver;

    @FindBy(id = "file-upload")
    private WebElement inputArchivo;

    @FindBy(id = "file-upload-btn")
    private WebElement btnSubirArchivo;

    @FindBy(id = "file-preview")
    private WebElement previewArchivo;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegaA() {
        driver.get("http://example.com/subida-archivo");
    }

    public void subirArchivo(String nombreArchivo) {
        inputArchivo.sendKeys("/ruta/al/archivo/" + nombreArchivo);
        btnSubirArchivo.click();
    }

    public boolean esCargaExitosa() {
        return previewArchivo.isDisplayed();
    }

    public boolean esVistaPreviaCorrecta() {
        // Aquí irían más validaciones específicas verificando los detalles en previewArchivo
        return previewArchivo.isDisplayed() && previewArchivo.getText().contains("Nombre: documento.pdf");
    }
}