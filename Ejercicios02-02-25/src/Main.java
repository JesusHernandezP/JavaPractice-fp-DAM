public class Main {
  public static void main(String[] args) {

    User user = new User();
    user.name = "jesus";
    User user2 = new User();
    user2.name = "Hernandez";
    System.out.println(user.id);
    System.out.println(user2.id);
    System.out.println(user.name);
    System.out.println(user2.name);
    user.saludar();
    user2.saludar();

  }


}


//    miMetodo("jesus", 35);
//    int resultado = suma(18, 20);
//    int resultado1 = suma(18, 64, 87);
//    String texto = suma("hola soy un overloading");
//    int arrayResultado =  suma(new int[] {1, 2, 3, 6, 5, 4});
//    System.out.println(resultado);
//    System.out.println(resultado1);
//    System.out.println(texto);
//    System.out.println("array resultado:" + arrayResultado);
//
//  }
//
//  static void miMetodo(String nombre, int edad) {
//    System.out.println("Hola mi nombre es: " + nombre + " tengo: " + edad + " de edad");
//  }
//
//  static int suma(int a, int b) {
//    return a + b;
//  }
//
//  //overloading
//  static int suma(int a, int b, int c) {
//    return a + b + c;
//  }
//
//  static String suma(String d) {
//    return d;
//  }
//
//  static int suma(int [] numeros){
//    int resultado = 0;
//    for (int numero : numeros){
//      resultado += numero;
//    }
//    return resultado;
//  }