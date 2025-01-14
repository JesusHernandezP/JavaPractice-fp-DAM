package Suma_Persistencia_MVC;

import java.util.ArrayList;

import java.util.Scanner;

public class SumaView {
  static String leerTexto(String mensaje) {
    System.out.println(mensaje);
    Scanner scanner = new Scanner(System.in);
    String valor = scanner.next();
    System.out.println("Muchas Gracias");
    return valor;
  }

  static int leerNumeroEntero(String mensaje) {
    boolean esNumero = false;
    int valor = 0;

    while (esNumero == false) {
      System.out.println(mensaje);

      try {
        Scanner scanner = new Scanner(System.in);
        valor = scanner.nextInt();
        esNumero = true;

      } catch (Exception e) {
        System.out.println("Por favor, intrudce un numero entero");
      }
    }
    System.out.println("Muchas Gracias");
    return valor;
  }

  static void mostrarTexto(String texto) {
    System.out.println(texto);
  }

  static void mostrarResultados(ArrayList<Integer> pResultados) {
    System.out.println("Resultados almacenados:");
    for (int resultado : pResultados) {
      System.out.println(resultado);
    }
  }
}