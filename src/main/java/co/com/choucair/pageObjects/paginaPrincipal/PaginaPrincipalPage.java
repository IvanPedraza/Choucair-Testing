package co.com.choucair.pageObjects.paginaPrincipal;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PaginaPrincipalPage {

    private SelenideElement choucairImagen = $(byClassName("maintitle"));
    private SelenideElement empleosBoton = $(byId("menu-item-550"));

    public int milisegundos = 3000;

    public PaginaPrincipalPage abrirPagina (String url) {
        System.setProperty("selenide browser", "Chrome");
        open(url);
        return this;
    }

    public PaginaPrincipalPage validarModalPrincipal(){
        choucairImagen.waitUntil(exist, milisegundos);
        return this;
    }

    public PaginaPrincipalPage clicMenuEmpleos(){
        empleosBoton.waitUntil(visible, milisegundos).click();
        return this;
    }
}
