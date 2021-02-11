package co.com.choucair.stepDefinitions.empleos;

import co.com.choucair.pageObjects.empleos.AutomatizadorPage;
import co.com.choucair.pageObjects.empleos.EmpleosPage;
import cucumber.api.java.en.And;

public class AutomatizadorSteps {
    AutomatizadorPage automatizadorPage;

    public AutomatizadorSteps(AutomatizadorPage automatizadorPage){
        this.automatizadorPage = automatizadorPage;
    }

    @And("^El usuario deberia ver los requisitos para el cargo$")
    public void verRequisitos() { automatizadorPage.textoRequisitos(); }

    @And("^el usuario deberia oprimir el boton Apply for job$")
    public void clicApplyJob() { automatizadorPage.clicBotonApplyForJob(); }

    @And("^El usuario deberia llenar el formulario de aplicacion$")
    public void diligenciarFormulario() {
        automatizadorPage.textoNombre(automatizadorPage.nombre);
        automatizadorPage.textoCorreo(automatizadorPage.correo);
        automatizadorPage.textoTelefono(automatizadorPage.telefono);
        automatizadorPage.textoEstudios(automatizadorPage.estudiosFormales);
        automatizadorPage.textoExperiencia(automatizadorPage.experiencia);
        automatizadorPage.textoPruebas(automatizadorPage.automatizacionPruebas);
        automatizadorPage.textoSalario(automatizadorPage.salario);
        automatizadorPage.textoDisponibilidad(automatizadorPage.disponibilidad);
        automatizadorPage.textoMensaje(automatizadorPage.mensajeAdicional);
    }
}
