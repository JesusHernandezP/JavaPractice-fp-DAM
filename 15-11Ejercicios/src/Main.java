public class Main {
  public static void main(String[] args) {

//    Ejercicio1:
//    Piramede de asteriscos
//    int n = 5; // Altura de la pirámide
//    for (int i = 1; i <= n; i++) {
//      // Espacios: n - i
//      System.out.print(" ".repeat(n - i));
//      // Estrellas: 2 * i - 1
//      System.out.println("*".repeat(2 * i - 1));
//    }

//    Ejercicio2:
//    Bucles anidados para sumar matrices


        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{1, 2}, {3, 4}};
        int[][] resultado = new int[2][2]; // Corrección en la inicialización

        // Multiplicación de matrices
        for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
            resultado[i][j] = 0; // Inicializa el valor de resultado[i][j]
            for (int k = 0; k < 2; k++) {
              resultado[i][j] += matrizA[i][k] * matrizB[k][j];
            }
          }
        }

        // Imprimir la matriz resultado
        for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
            System.out.print(resultado[i][j] + " ");
          }
          System.out.println();
        }
      }
    }