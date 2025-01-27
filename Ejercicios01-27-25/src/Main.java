import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un numero");
    int numeroIngresado = scanner.nextInt();

    if (numeroIngresado % 2 == 0) {
      System.out.println("El numero es par");
    }
    else {
      System.out.println("El numero es impar");
    }
      scanner.close();
      }

}