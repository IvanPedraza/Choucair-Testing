package co.com.choucair.pageObjects.empleos;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class EmpleosPage {

    private SelenideElement bannerImagen = $(byClassName("elementor-widget-container"));
    public int milisegundos = 3000;
    private SelenideElement serChoucairBoton = $(byTitle("serchazuleMesa de trabajo 1"));
    private SelenideElement serChoucairTexto = $(byClassName("elementor-widget-container"));
    private SelenideElement convocatoriasBoton = $(byTitle("empleosazuleMesa de trabajo 1"));
    private SelenideElement convocatoriasTexto = $(byText("CONVOCATORIAS"));
    private SelenideElement prepararseBoton = $(byTitle("empleosazulMesa de trabajo 1"));
    private SelenideElement prepararseTexto = $(byText("CURSOS GENERALES PARA INGENIEROS"));
    private SelenideElement empleosDisponiblesTitulo = $(byText("EMPLEOS DISPONIBLES"));
    private SelenideElement keywordTexto = $(byId("search_keywords"));
    private SelenideElement locationTexto = $(byId("search_location"));
    private SelenideElement searchJobBoton = $(byValue("Search Jobs"));
    private SelenideElement automatizadorTexto = $(byText("Automatizador"));
    private SelenideElement automatizadorBoton = $(byText("Automatizador"));

    public EmpleosPage verBanner(){
        bannerImagen.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage clicBotonSerChoucair(){
        serChoucairBoton.waitUntil(visible, milisegundos).click();
        return this;
    }

    public EmpleosPage textoSerChoucair(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        serChoucairTexto.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage clicBotonConvocatorias(){
        convocatoriasBoton.waitUntil(visible, milisegundos).click();
        return this;
    }

    public EmpleosPage textoConvocatorias(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        convocatoriasTexto.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage clicBotonPrepararse(){
        prepararseBoton.waitUntil(visible, milisegundos).click();
        return this;
    }

    public EmpleosPage textoPrepararse(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prepararseTexto.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage textoEmpleos(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        convocatoriasTexto.scrollTo();
        empleosDisponiblesTitulo.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage textoCargo(String cargo){
        keywordTexto.setValue(cargo);
        return this;
    }

    public EmpleosPage textoUbicacion(String ubicacion){
        locationTexto.click();
        locationTexto.setValue(ubicacion);
        return this;
    }

    public EmpleosPage clicBotonSearchJob(){
        searchJobBoton.waitUntil(visible, milisegundos).click();
        return this;
    }

    public EmpleosPage textoAutomatizador(){
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        automatizadorTexto.waitUntil(visible, milisegundos);
        return this;
    }

    public EmpleosPage clicBotonAutomatizador(){
        automatizadorBoton.waitUntil(visible, milisegundos).click();
        return this;
    }
}
