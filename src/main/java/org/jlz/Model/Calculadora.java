package org.jlz.Model;

public class Calculadora {
  private double resultado;

  public Calculadora(){
    this.resultado = 0.00;
  }

  public double getResultado() {
    return resultado;
  }

  public void sumarNumeros(double x, double y){
    this.resultado =  x + y;
  }
}
