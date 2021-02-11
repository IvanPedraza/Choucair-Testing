package co.com.choucair.stepDefinitions.paginaPrincipal;

import co.com.choucair.pageObjects.paginaPrincipal.PaginaPrincipalPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PaginaPrincipalSteps {
    PaginaPrincipalPage paginaPrincipalPage;

    public PaginaPrincipalSteps(PaginaPrincipalPage paginaPrincipalPage){
        this.paginaPrincipalPage = paginaPrincipalPage;
    }

    @Given("^El usuario abre la pagina principal \"([^\"]*)\"$")
    public void abrirPagina(String url) {
        paginaPrincipalPage.abrirPagina(url);
    }

    @Then("^El usuario deberia ver la imagen de bienvenida de la pagina principal$")
    public void imagenBienvenida(){
        paginaPrincipalPage.validarModalPrincipal();
    }

    @And("^El usuario da click en la seccion Empleos$")
    public void clicBotonEmpleos(){
        paginaPrincipalPage.clicMenuEmpleos();
    }
}
