package com.seleniumeasy.tasks;

import static com.seleniumeasy.userinterfaces.SeleniumEasyPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.seleniumeasy.interactions.AbrirNavegador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarPractica implements Task {

  public static IngresarPractica deSimpleForm() {
    return instrumented(IngresarPractica.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        AbrirNavegador.enSelenium(),
        WaitUntil.the(BTN_CERRAR_ALERTA, isVisible()).forNoMoreThan(10).seconds(),
        Click.on(BTN_CERRAR_ALERTA),
        Click.on(BTN_INICIAR_PRACTICA),
        Click.on(BTN_SIMPLE_FORM_DEMO));
  }
}
