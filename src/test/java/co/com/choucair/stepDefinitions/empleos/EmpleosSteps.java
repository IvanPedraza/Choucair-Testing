package co.com.choucair.stepDefinitions.empleos;

import co.com.choucair.pageObjects.empleos.EmpleosPage;
import co.com.choucair.pageObjects.paginaPrincipal.PaginaPrincipalPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpleosSteps {
    EmpleosPage empleosPage;

    public EmpleosSteps(EmpleosPage empleosPage){
        this.empleosPage = empleosPage;
    }

    @Given("^El usuario esta en la seccion de empleos$")
    public void verBannerEmpleos() {
        empleosPage.verBanner();
    }

    @When("^El usuario oprima la primera imagen$")
    public void clicSerChoucair() {
        empleosPage.clicBotonSerChoucair();
    }

    @Then("^El usuario deberia ver el texto Ser Choucair$")
    public void verTextoSerChoucair() {
        empleosPage.textoSerChoucair();
    }

    @When("^El usuario oprima la segunda imagen$")
    public void clicConvocatorias() { empleosPage.clicBotonConvocatorias(); }

    @Then("^El usuario deberia ver el texto convocatorias$")
    public void verTextoConvocatorias() { empleosPage.textoConvocatorias(); }

    @When("^El usuario oprima la tercera imagen$")
    public void clicPrepararse() { empleosPage.clicBotonPrepararse(); }

    @Then("^El usuario deberia ver el texto cursos generales para Ingenieros$")
    public void verTextoPrepararse() { empleosPage.textoPrepararse(); }

    @Then("^El usuario se desplaza hacia abajo y deberia ver el texto empleos disponibles$")
    public void verSeccionEmpleosDisponibles() { empleosPage.textoEmpleos();}

    @And("^El usuario digita en cargo \"([^\"]*)\" y Location \"([^\"]*)\"$")
    public void buscarCargoAutomatizador(String cargo, String location){
        empleosPage.textoCargo(cargo);
        empleosPage.textoUbicacion(location);
    }

    @And("^El usuario oprima el boton SEARCH JOBS$")
    public void clicSearchJobs(){ empleosPage.clicBotonSearchJob(); }

    @And("^El usuario deberia ver el empleo Automatizador en la lista$")
    public void verCargoAutomatizador() { empleosPage.textoAutomatizador(); }

    @Then("^El usuario deberia oprimir boton Automatizador$")
    public void clicAutomatizador() { empleosPage.clicBotonAutomatizador(); }

}
