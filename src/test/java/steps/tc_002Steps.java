import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    private WebDriver driver;
    private tc_002Page uploadPage;

    public tc_002Steps() {
        this.driver = Hooks.getDriver();
        this.uploadPage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("el usuario está en la página de subida de archivos")
    public void el_usuario_está_en_la_página_de_subida_de_archivos() {
        uploadPage.navegaA();
    }

    @When("el usuario selecciona un archivo {string} con un tamaño válido")
    public void el_usuario_selecciona_un_archivo_con_un_tamaño_válido(String nombreArchivo) {
        uploadPage.subirArchivo(nombreArchivo);
    }

    @Then("el archivo se carga correctamente")
    public void el_archivo_se_carga_correctamente() {
        Assert.assertTrue(uploadPage.esCargaExitosa());
    }

    @Then("el nombre, tamaño y tipo del archivo se muestran en la vista previa")
    public void el_nombre_tamaño_y_tipo_del_archivo_se_muestran_en_la_vista_previa() {
        Assert.assertTrue(uploadPage.esVistaPreviaCorrecta());
    }
}