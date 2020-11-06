package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleniumEasyPrincipalPage {
  public static final Target BTN_CERRAR_ALERTA =
      Target.the("Boton alerta").located(By.id("at-cv-lightbox-close"));
  public static final Target BTN_INICIAR_PRACTICA =
      Target.the("Boton iniciar practica").located(By.id("btn_basic_example"));
  public static final Target BTN_SIMPLE_FORM_DEMO =
      Target.the("Boton simple form demo")
          .located(By.xpath("(//a[contains(text(),'Simple Form Demo')])[3]"));

  private SeleniumEasyPrincipalPage() {}
}
