import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingresa un numero");
    int num1 = scan.nextInt();
    System.out.println("Ingresa un numero");
    int num2 = scan.nextInt();

//    Realizar suma
    int resultado = sumar(num1, num2);
    System.out.println(" El resultado de la suma: " + resultado);
    System.out.println("-----------------------------------------------------------");

//    Cocinar pasta
    cocinarPasta("Espaguetti", 500);
    System.out.println("------------------------------------------------------------2");


//    Obtener tiempo de coccion de la pasta
    int tiempoCoccion = calcularTiempoDeCocion();
    String respuesta = String.format("el timepo de coccion es :  %d minutos", tiempoCoccion);
    System.out.println(respuesta);

  }

  public static int sumar(int num1, int num2) {
    return num1 + num2;
  }

  public static void cocinarPasta(String tipoDePasta, int CantidadDeAgua) {
    String mensaje = String.format(
            "cocinando , %s. Cantidad de agua %d ml, ", tipoDePasta, CantidadDeAgua
    );
    System.out.println(mensaje);
  }

  public static int calcularTiempoDeCocion() {
    Scanner scan = new Scanner(System.in);
    System.out.println("ingrese el numero del tipo de pasta: ");
    System.out.println("1: espaguetti, 2: macarrones, 3: fideos");
    int claseDePasta = scan.nextInt();
    int tiempo = 0;


    switch (claseDePasta) {
      case 1:
        tiempo = 10;
        break;
      case 2:
        tiempo = 8;
        break;
      case 3:
        tiempo = 5;
        break;
      default:
        System.out.println("tipo de pasta invalido");
        tiempo = 10;
        break;

    }

    return tiempo;
  }

}