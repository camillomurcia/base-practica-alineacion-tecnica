package com.seleniumeasy.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SumarPasosStepDefinitions {

  @Before
  public void prepararActor() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) ingresa a la practica de Simple Form Demo$")
  public void que_Felipe_ingresa_a_la_practica_de_Simple_Form_Demo(String nombreActor) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Cuando("^el ingresa los numeros:$")
  public void el_ingresa_los_numeros(List<Map<String, Integer>> numeros) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc).
    // Field names for YourType must match the column names in
    // your feature file (except for spaces and capitalization).
    throw new PendingException();
  }

  @Entonces("^el resultado debe ser (.*)$")
  public void el_resultado_debe_ser(String resultadoEsperado) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Entonces("^el resultado mostrado es correcto$")
  public void el_resultado_mostrado_es_correcto() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}
