package loops;

import javax.swing.*;

public class ForEachLoop {
  public static void main(String[] args) {

    String[] paises = new String[10];

    for (int i = 0; i <paises.length ; i++) {
    paises[i] = JOptionPane.showInputDialog("entra un pais");

    }
    for (String input : paises)System.out.println("Pais: " + input);
}
}