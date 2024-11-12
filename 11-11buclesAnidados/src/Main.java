import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//    for (int i = 1; i <= 2; i++) {
//      for (int j = 1; j <= 3; j++) {
//        System.out.print(i + "," + j + " ");
//      }
//    }

//Ejercicio: Contar vocales en una cadena Escribe un programa que reciba una cadena de texto ingresada por el usuario y
// luego cuente cuántas vocales (a, e, i, o, u) contiene.
//Usa un bucle para recorrer cada carácter de la cadena.
// Usa una estructura de control para verificar si el carácter es una vocal.
// Muestra el número de vocales encontradas.



//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa una cadena de texto:");
//        String cadena = scan.nextLine();
//
//        // Convertimos la cadena a minúsculas para evitar problemas con mayúsculas
//        cadena = cadena.toLowerCase();
//
//        int contadorVocales = 0;
//
//        // Recorrer cada carácter de la cadena
//        for (int i = 0; i < cadena.length(); i++) {
//          char c = cadena.charAt(i); // Obtener el carácter en la posición i
//
//          // Verificar si el carácter es una vocal
//          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//            contadorVocales++;
//          }
//        }
//
//        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);

//    Ejecicio: tabla de multiplicar ingresada por el usuario

    for (int i = 1; i <=10; i++) {
      int j;
      for (j = 1; j <= 10; j++) {
int mul = i * j;
      System.out.println(i + " x " + j + " = " + mul);
      }
    }


  }

    }