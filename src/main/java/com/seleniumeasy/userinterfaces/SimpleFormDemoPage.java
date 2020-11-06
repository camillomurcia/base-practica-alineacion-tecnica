package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimpleFormDemoPage {
  public static final Target TXT_PRIMER_NUMERO =
      Target.the("Input primer numero").located(By.id("sum1"));
  public static final Target TXT_SEGUNDO_NUMERO =
      Target.the("Input segundo numero").located(By.id("sum2"));
  public static final Target BTN_OBTENER_RESULTADO =
      Target.the("Boton obtener resultado").located(By.xpath("//button[contains(.,'Get Total')]"));
  public static final Target LBL_RESULTADO =
      Target.the("Label resultado").located(By.id("displayvalue"));

  private SimpleFormDemoPage() {}
}
