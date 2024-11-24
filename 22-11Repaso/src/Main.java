import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese un numero para verificar si es primo");
    int numero = scan.nextInt();

    boolean resultado = esPrimo(numero);

    if (resultado) {
      System.out.println("es un numero primo");
    } else {
      System.out.println("el numero no es primo");
    }
  }

  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    for (int i = 2; i < numero / 2; i++) {
      if (numero % 1 == 0) {
        return false;
      }
    }

    return true;
  }

}