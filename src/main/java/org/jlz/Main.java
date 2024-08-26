package org.jlz;

import org.jlz.Controlador.SumarController;
import org.jlz.Model.Calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Calculadora myCalculator = new Calculadora();
    GuiCalculadora myGuiCalculator = new GuiCalculadora();
    SumarController mySumarController = new SumarController(myCalculator, myGuiCalculator);

  }
}