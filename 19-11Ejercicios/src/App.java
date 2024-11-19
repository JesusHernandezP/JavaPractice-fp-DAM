import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Obtener los números desde el usuario
    int[] numeros = obtenerNumeros(scan);

    // Llamar al método de suma
    int resultado = suma(numeros[0], numeros[1]);

    // Mostrar el resultado
    System.out.println("La suma de los números es: " + resultado);
  }

  public static int[] obtenerNumeros(Scanner scan) {
    int[] numeros = new int[2];


    for (int i = 0; i < numeros.length; i++) {
      System.out.println("numero " + (i + 1) + " ");
      numeros[i] = scan.nextInt();
    }
    return numeros;

  }

  public static int suma (int a, int b){
    return a + b;
  }


}