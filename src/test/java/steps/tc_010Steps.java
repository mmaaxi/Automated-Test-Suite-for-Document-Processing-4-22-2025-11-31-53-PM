package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    private tc_010Page page;

    public tc_010Steps() {
        page = new tc_010Page();
    }

    @Given("que el usuario ha iniciado sesión en el sistema")
    public void que_el_usuario_ha_iniciado_sesion_en_el_sistema() {
        page.iniciarSesion();
    }

    @When("el usuario completa la carga y procesamiento de documentos")
    public void el_usuario_completa_la_carga_y_procesamiento_de_documentos() {
        page.cargarYProcesarDocumentos();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void el_sistema_genera_el_slip_de_salida() {
        Assert.assertTrue(page.isSlipDeSalidaGenerado());
    }

    @Then("el sistema guarda los documentos originales en el historial")
    public void el_sistema_guarda_los_documentos_originales_en_el_historial() {
        Assert.assertTrue(page.isDocumentosOriginalesGuardados());
    }

    @Then("el sistema guarda los datos extraídos en el historial de la solicitud")
    public void el_sistema_guarda_los_datos_extraidos_en_el_historial_de_la_solicitud() {
        Assert.assertTrue(page.isDatosExtraidosGuardados());
    }
}