package loops;

import javax.swing.*;

public class WhileLoop {

  public static void main(String[] args) {

    String clave = "lunes";

    String pass= "";

    while(clave.equals(pass)==false){
      pass= JOptionPane.showInputDialog("Introduce contraseña");

      if (clave.equals(pass)==false) System.out.println(" La clave es incorrecta");

    }
    System.out.println("Acesso correcto");

  }

}