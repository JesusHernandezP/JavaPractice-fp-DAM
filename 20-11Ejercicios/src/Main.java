import java.util.Scanner;

public class Main {
  /*public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese un número:");
    int numeroScan = scan.nextInt();

    for (int i = 1; i <= numeroScan; i++) {
      for (int j = 1; j <= numeroScan + i - 1; j++) {
        if (j <= numeroScan - i) {
          // Imprimir espacios antes del triángulo
          System.out.print(" ");
        } else {
          // Imprimir asteriscos con espacios
          System.out.print(" * ");
        }
      }
      System.out.println(); // Cambiar a la siguiente línea después de cada fila
    }
  }*/


//   Ejercicio2------------------------------------------------------------------------------------

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Definir la matriz
    int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };


    System.out.println("Ingrese un número para buscar en la matriz:");
    int numero = scan.nextInt();

    boolean encontrado = false;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] == numero) {
          System.out.println("El número " + numero + " se encuentra en la fila " + i + " y columna " + j);
          encontrado = true;
          break;
        }
      }
    }
    if (!encontrado) {
      System.out.println("El número " + numero + " no está en la matriz.");
    }

//    Ejercicio3--------------------------------------------------------------------------


  }
}