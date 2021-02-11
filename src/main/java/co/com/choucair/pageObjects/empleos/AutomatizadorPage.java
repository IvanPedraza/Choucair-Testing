package co.com.choucair.pageObjects.empleos;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AutomatizadorPage {

    private SelenideElement requisitosTexto = $(byClassName("job_description"));
    private SelenideElement informacionTexto = $(byText("kardilam@choucairtesting.com"));
    private SelenideElement applyForJobBoton = $(byValue("Apply for job"));
    private SelenideElement nombreTexto = $(byId("nombre-completo"));
    private SelenideElement correoTexto = $(byId("correo-electronico"));
    private SelenideElement telefonoTexto = $(byId("celular-o-telefono-de-contacto"));
    private SelenideElement estudiosTexto = $(byId("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
    private SelenideElement experienciaTexto = $(byId("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
    private SelenideElement pruebasTexto = $(byId("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
    private SelenideElement salarioTexto = $(byId("cual-es-tu-aspiracion-salarial"));
    private SelenideElement disponibilidadTexto = $(byId("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
    private SelenideElement mensajeTexto = $(byId("mensaje-adicional"));



    public int milisegundos = 3000;

    public String nombre = "Jaime Restrepo";
    public String correo = "jr@hotmail.com";
    public String telefono = "311256365";
    public String estudiosFormales = "Ingeniero Industrial";
    public String experiencia = "1";
    public String automatizacionPruebas = "Me gustaría aprender";
    public String salario = "2200000";
    public String disponibilidad = "Inmediatamente";
    public String mensajeAdicional = "Ninguno";


    public AutomatizadorPage textoRequisitos(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        requisitosTexto.waitUntil(visible, milisegundos);
        requisitosTexto.scrollTo();
        informacionTexto.scrollTo();
        return this;
    }

    public AutomatizadorPage clicBotonApplyForJob(){
        applyForJobBoton.waitUntil(visible, milisegundos).click();
        return this;
    }

    public AutomatizadorPage textoNombre(String nombre){
        nombreTexto.click();
        nombreTexto.setValue(nombre);
        return this;
    }

    public AutomatizadorPage textoCorreo(String correo){
        correoTexto.click();
        correoTexto.setValue(correo);
        return this;
    }

    public AutomatizadorPage textoTelefono(String telefono){
        telefonoTexto.click();
        telefonoTexto.setValue(telefono);
        return this;
    }

    public AutomatizadorPage textoEstudios(String estudiosFormales){
        estudiosTexto.click();
        estudiosTexto.setValue(estudiosFormales);
        estudiosTexto.scrollTo();
        return this;
    }

    public AutomatizadorPage textoExperiencia(String experiencia){
        experienciaTexto.click();
        experienciaTexto.setValue(experiencia);
        return this;
    }

    public AutomatizadorPage textoPruebas(String pruebas){
        pruebasTexto.click();
        pruebasTexto.setValue(pruebas);
        return this;
    }

    public AutomatizadorPage textoSalario(String salario){
        salarioTexto.click();
        salarioTexto.setValue(salario);
        salarioTexto.scrollTo();
        return this;
    }

    public AutomatizadorPage textoDisponibilidad(String disponibilidad){
        disponibilidadTexto.click();
        disponibilidadTexto.setValue(disponibilidad);
        return this;
    }

    public AutomatizadorPage textoMensaje(String mensaje){
        mensajeTexto.click();
        mensajeTexto.setValue(mensaje);
        return this;
    }
}
