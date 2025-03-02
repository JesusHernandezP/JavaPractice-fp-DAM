import java.util.Scanner;

public class AreaTrapecio {
  private double baseMayor;
  private double baseMenor;
  private double altura;

  public void PedirDatos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce los siguientes datos para calcular el área del trapecio:");

    do {
      System.out.print("Base mayor: ");
      baseMayor = sc.nextDouble();
      if (baseMayor <= 0) {
        System.out.println("El valor no es válido. Intenta con un número positivo mayor a 0.");
      }
    } while (baseMayor <= 0);

    do {
      System.out.print("Base menor: ");
      baseMenor = sc.nextDouble();
      if (baseMenor <= 0) {
        System.out.println("El valor no es válido. Intenta con un número positivo mayor a 0.");
      }
    } while (baseMenor <= 0);

    do {
      System.out.print("Altura: ");
      altura = sc.nextDouble();
      if (altura <= 0) {
        System.out.println("El valor no es válido. Intenta con un número positivo mayor a 0.");
      }
    } while (altura <= 0);

  }

  public double CalcularArea() {
    return (baseMayor + baseMenor) * altura / 2;
  }

  public void MostrarResultado() {
    double area = CalcularArea();
    System.out.println("El área del trapecio es: " + area);
  }

}