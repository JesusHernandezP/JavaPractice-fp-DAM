public class Metodos {

  public static void saludar() {
    System.out.println("hola, practicando metodos");
  }
//    ----------------------------------------------------------------------

  public static void saludar1(String nombre) {
    System.out.println("hola " + nombre + " bienvenido a metodo con parametro");
  }
//    ----------------------------------------------------------------------

  public static int sumar(int a, int b) {
    return a + b;
  }
//    ----------------------------------------------------------------------

  public static int multiplicar( int a, int b){
    return a * b;
  }
//    ----------------------------------------------------------------------

  public static boolean esPar ( int a){
       return a % 2 == 0;
  }
//    ----------------------------------------------------------------------

  public static void saludoPer(String nombre, int edad){
    System.out.println("hola " + nombre + ", tienes " + edad + " años");
  }
//    ----------------------------------------------------------------------

  public static double calcularDescuento(double precio, double descuento){
    return precio - (precio * descuento);
  }
//    ----------------------------------------------------------------------

  public static double convertirTemperatura(double tempC){
    double tempF = (tempC * 9/5) + 32;
    return tempF;
  }
}