package loops;

import javax.swing.JOptionPane;

public class FindNumberGame {

  public static void main(String[] args) {

    int aleatorio = (int) (Math.random() * 100) + 1;
    int intentos = 0;
    int numerosUsuario = 0;
    boolean haAdivinado = false;

    // El bucle se ejecuta mientras queden intentos Y no se haya adivinado el número.
    while (intentos < 5 && !haAdivinado) {

      numerosUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intento " + (intentos + 1) + "/5. Introduce un número:"));

      // Se incrementa el contador después de pedir el número.
      intentos++;

      if (aleatorio > numerosUsuario) {
        JOptionPane.showMessageDialog(null, "¡Más alto!");
      } else if (aleatorio < numerosUsuario) {
        JOptionPane.showMessageDialog(null, "¡Más bajo!");
      } else {
        // Si acierta, lo marcamos y mostramos el mensaje de victoria.
        haAdivinado = true;
        JOptionPane.showMessageDialog(null, "¡Correcto! Lo has adivinado en " + intentos + " intentos.");
      }
    }

    // Si el bucle termina porque se acabaron los intentos (y no porque adivinó)...
    if (!haAdivinado) {
      JOptionPane.showMessageDialog(null, "¡Has perdido! Agotaste tus 5 intentos. El número era " + aleatorio + ".");
    }
  }
}