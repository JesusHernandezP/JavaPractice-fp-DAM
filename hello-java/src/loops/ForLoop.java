package loops;

import javax.swing.*;

public class ForLoop {

  public static void main(String[] args) {
   /* for (int i = 0; i < 10; i++) {

      System.out.println("hola");
    }*/
    String mail = "";
    int at = 0;
    boolean dot = false;


    do {
      mail = JOptionPane.showInputDialog("introduce un email");


    for (int i = 0; i < mail.length(); i++) {

      if (mail.charAt(i) == '@') at++;
      if (mail.charAt(i)== '.') dot= true;
    }
      if (at == 1 && dot == true) JOptionPane.showMessageDialog(null, "email valido");
      else JOptionPane.showMessageDialog(null, "email invalido");


    }while (!dot);
  }
}