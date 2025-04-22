package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario quiere cargar documentos")
    public void el_usuario_quiere_cargar_documentos() {
        page.navigateToUploadSection();
    }

    @When("Selecciona la opción 'cargar documentos'")
    public void selecciona_la_opcion_cargar_documentos() {
        page.selectUploadDocumentsOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        assertTrue(page.isSingleUploadOptionVisible());
        assertTrue(page.isMultipleUploadOptionVisible());
    }

    @When("Elige 'carga en un solo archivo'")
    public void elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUpload();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        assertTrue(page.isSingleFileBoxEnabled());
    }

    @When("Elige 'cargar documentos por separado'")
    public void elige_cargar_documentos_por_separado() {
        page.selectMultipleFilesUpload();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        assertTrue(page.areMultipleFileBoxesVisible());
    }
}