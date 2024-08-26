package org.jlz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GuiCalculadora {
  private final JTextField numX;
  private final JTextField numY;
  private final JLabel resultado;
  private final JButton btnSumar;
  private final JFrame frame;
  public GuiCalculadora(){
    frame = new JFrame();
    JPanel panel = new JPanel();
    btnSumar = new JButton("Sumar");
    numX = new JTextField(12);
    numY = new JTextField(12);
    resultado = new JLabel();

    frame.add(panel);


    panel.add(numX);
    panel.add(btnSumar);
    panel.add(numY);
    panel.add(resultado);

    panel.setLayout(new FlowLayout());
    frame.setTitle("Calculadora");
    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public double getNumX() {
    return Double.parseDouble(numX.getText());
  }

  public double getNumY() {
    return Double.parseDouble(numY.getText());
  }

  public double getResultado() {
    return Double.parseDouble(resultado.getText());
  }

  public void setResultado(double resultado) {
    this.resultado.setText(String.valueOf(resultado));
  }

  // El evento asociado al boton se asigna mediante una función
  // No directamente creamos el evento en nuestra GUI
  // En este caso el evento lo asigna el controlador
  public void setSumOperationEvent(ActionListener sumaEvent){
    btnSumar.addActionListener(sumaEvent);
  }
  // Menaje de error
  public void messageError(String error){
    JOptionPane.showMessageDialog(frame, error);
  }
}
