import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    ----------------------------------------------------------------------

    Metodos.saludar();
//    ----------------------------------------------------------------------

    Metodos.saludar1("carlos");
//    ----------------------------------------------------------------------

    int resultado = Metodos.sumar(15, 15);
    System.out.println(resultado);
//    ----------------------------------------------------------------------

    int resultadoMulti = Metodos.multiplicar(2, 8);
    System.out.println(resultadoMulti);
//    ----------------------------------------------------------------------

    System.out.println("Ingrese un numero entero");
    int esParOimPar = sc.nextInt();
    boolean resultadoParImpar = Metodos.esPar(esParOimPar);

    if (resultadoParImpar) {
      System.out.println("el numero es par");
    } else {
      System.out.println("El numero es impar");
    }
//    ----------------------------------------------------------------------

    System.out.println("ingrese su edad");
    int edad = sc.nextInt();
    sc.nextLine();

    System.out.println("ingrese su nombre");
    String nombre = sc.nextLine();


    Metodos.saludoPer(nombre, edad);
//    ----------------------------------------------------------------------
    System.out.println("ingrese precio del producto");
    double precio = sc.nextDouble();
    double descuento = 0.20;
    double precioFinal = Metodos.calcularDescuento(precio, descuento);
    System.out.println("El precio con descuentos es de: " + precioFinal);
//    ----------------------------------------------------------------------

    System.out.println("Ingrese temperatura en grados Celsius para convertir en fahrenheit");
    double tempC = sc.nextDouble();
    double tempFinal = Metodos.convertirTemperatura(tempC);
    System.out.println("La temperatura en grados Fahrenheit " + tempFinal);
  }

}