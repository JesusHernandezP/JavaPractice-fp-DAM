
import java.util.Scanner;

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


//        int[][] matrizA = {{1, 2}, {3, 4}};
//        int[][] matrizB = {{1, 2}, {3, 4}};
//        int[][] resultado = new int[2][2]; // Corrección en la inicialización

    // Multiplicación de matrices
//        for (int i = 0; i < 2; i++) {
//          for (int j = 0; j < 2; j++) {
//            resultado[i][j] = 0; // Inicializa el valor de resultado[i][j]
//            for (int k = 0; k < 2; k++) {
//              resultado[i][j] += matrizA[i][k] * matrizB[k][j];
//            }
//          }
//        }
//
//        // Imprimir la matriz resultado
//        for (int i = 0; i < 2; i++) {
//          for (int j = 0; j < 2; j++) {
//            System.out.print(resultado[i][j] + " ");
//          }
//          System.out.println();
//        }
//    Ejercicio3
//    Escribe un programa que realice una rotación a la derecha en un array de enteros. Es decir,
//    el último elemento del array debe pasar a ser el primero, y        los demás se desplazan hacia la derecha.

//    int [] num = {1, 2, 3, 4, 5, 6};
//    int last = num[num.length - 1];
//
//    for (int i = num.length - 1; i > 0; i--) {
//      num[i] = num[i - 1];
//    }
//    num[0] = last;
//
//    System.out.println();
//    for (int i = 0; i < num.length; i++) {
//      System.out.println(num[i] + " ");
//
//    }

//    Ejercicio 4: Determinar si un número es positivo, negativo o cero
//    Escribe un programa que haga lo siguiente:
//
//    Pida al usuario que ingrese un número.
//            Determine si el número ingresado es positivo, negativo o cero.
//    Muestra un mensaje correspondiente.
//    Pista:
//
//    Usa la estructura if-else para realizar las comprobaciones.
//    Recuerda utilizar la clase Scanner para recibir el input del usuario.

//    Scanner scan = new Scanner(System.in);
//
//    System.out.println("ingrese un numero");
//    int num = scan.nextInt();
//
//
//    if (num > 0) {
//      System.out.println("positivo");
//    }
//      else if (num < 0) {
//      System.out.println("negativo");
//    }
//      else {
//      System.out.println("es igual a cero");
//    }
//scan.close();

//    Ejercicio4: Contar palabras en una cadena
//
//    Escribe un programa que reciba una cadena de texto del usuario y cuente cuántas palabras contiene.
//    Una palabra es una secuencia de caracteres delimitada por espacios.


//      Scanner scan = new Scanner(System.in);
//
//    System.out.println("ingrese una cadena de texto");
//    String texto = scan.nextLine();
//    String[] palabras = texto.split(" ");
//
//    int cantidadPalabras = palabras.length;
//
//    System.out.println(cantidadPalabras);


//    Ejercicio 5: Par o impar
//    Escribe un programa que pida al usuario un número y determine si es par o impar usando un if-else.
//    Scanner scan = new Scanner(System.in);
//
//    System.out.println("ingrese un numero");
//    int num = scan.nextInt();
//
//    if (num % 2 == 0 ) {
//      System.out.println("el numero es par");
//    }
//    else {
//      System.out.println("el numero es impar");
//    }

//    Ejercicio 2: Sumar los números de un arreglo
//    Crea un programa que sume todos los números de un array. Usa un bucle for para recorrer el array y calcular la suma.

//    int [] num = {1, 2, 3, 4 , 5, 6 ,87 ,65, 35};
//    int suma = 0;
//    for (int i = 0; i < num.length; i++) {
//      suma = suma + num[i];
//      System.out.println(suma);
//    }
//    Ejercicio 3: Contar vocales en una cadena
//    Escribe un programa que reciba una cadena de texto ingresada por el usuario y luego cuente cuántas vocales (a, e, i, o, u) contiene.


/*    System.out.println(" Escribe una cadena de texto ");
    String texto = scan.nextLine();

    int contarvocales = 0;
    int contarConsonantes = 0;

    for (int i = 0; i < texto.length(); i++) {
    char letra = texto.charAt(i);
      if ("aeiouAEIOU".indexOf(letra) != -1){
        contarvocales++;
      }else if (Character.isLetter(letra)){
        contarConsonantes++;
      }
    }
      System.out.println("Hay: " + contarvocales + " vocales");
    System.out.println("Hay: " + contarConsonantes + " consonante");*/


//    System.out.println("ingrese una palabra");
//    String palabra = scan.nextLine().toLowerCase();
//
//    String invertida = "";
//    for (int i = palabra.length() -1 ; i>= 0;  i--) {
//      invertida += palabra.charAt(i);
//    }
//    if (palabra.equals(invertida)) {
//      System.out.println("la palabra es un palindromo");
//    }else {
//      System.out.println("la palabra no es un palindromo");
//    }

  /*  System.out.println("ingrese una palabra");
    String palabra = scan.nextLine().toLowerCase();
    int contarConsonante = 0;

    for (int i = 0; i < palabra.length(); i++) {
    char letra = palabra.charAt(i);
      if (Character.isLetter(letra) && "aeiou".indexOf(letra) == -1) {
        contarConsonante++;
      }
    }
    System.out.println("hay: " + contarConsonante + "consonantes");*/

//  ---------------------------------------------------------------------------------

    /*Ejercicio: Contar la cantidad de palabras en una frase
    Escribe un programa que reciba una frase del usuario y cuente cuántas palabras contiene.*/


    /*System.out.println("ingrese una frase");
    String frase = scan.nextLine();

    String[] palabras = frase.split(" ");

    System.out.println("la frase tiene: " + palabras.length + " palabras") ;*/

//    ---------------------------------------------------------------------------------

/*    Ejercicio 6: Invertir una cadena de texto
    Escribe un programa que invierta una cadena de texto ingresada por el usuario.

            Instrucciones:

    Utiliza un bucle para recorrer la cadena desde el final hacia el inicio.
            Imprime la cadena invertida.*/


    /*System.out.println("ingrese una frase");
    String frase = scan.nextLine();

    String textoInvertido = "";
    for (int i = frase.length() - 1;  i >= 0; i--) {
      textoInvertido += frase.charAt(i);
    }
      System.out.println(textoInvertido);
*/



//-----------------------------------------------------------------------------------------------------------------------

    Scanner scan = new Scanner(System.in);

    System.out.println("ingrese primer numero");
    int num1 = scan.nextInt();
    System.out.println("ingrese segundo numero");
int num2 = scan.nextInt();






  }

}