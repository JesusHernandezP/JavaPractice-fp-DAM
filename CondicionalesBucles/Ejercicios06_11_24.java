package CondicionalesBucles;

public class Ejercicios06_11_24 {
  public static void main(String[] args) {
//Ejercicio 1:
//Escribe un programa en Java que pida al usuario un número entero e imprima si es par o impar programa.

//    Scanner lectura = new Scanner(System.in);
//    System.out.println("Ingrese un numero entero: ");
//    int num = lectura.nextInt();
//
//    if (num % 2 == 0) {
//      System.out.println(num + " Es un numero es par");
//    } else {
//      System.out.println(num + " Es un numero es impar");
//    }


//Ejercicio 2:
//Crea un programa que use un bucle for para imprimir los números del 1 al 20. Luego, haz que el programa cuente cuántos de estos números son pares e imprima el resultado.

//    int contador = 0;
//    for (int i = 1; i <= 20; i++) {
//
//      if (i % 2 == 0) {
//        contador++;
//
//      }
//
//
//    }
//    System.out.println(" La cantidad de numeros pares es: " + contador);


//    Ejercicio 3:
//    Escribe un programa en el que el usuario ingrese un número del 1 al 12, y el programa le diga el nombre del mes correspondiente. Utiliza switch para hacer esto.

//    System.out.println(" ingresa un numero del 1 al 12");
//    int mes = lectura.nextInt();
//
//    switch (mes) {
//      case 1:
//        System.out.println("Enero");
//        break;
//      case 2:
//        System.out.println("Febrero");
//        break;
//      case 3:
//        System.out.println("Marzo");
//        break;
//      case 4:
//        System.out.println("Abril");
//        break;
//      case 5:
//        System.out.println("Mayo");
//        break;
//      case 6:
//        System.out.println("Junio");
//        break;
//      case 7:
//        System.out.println("Julio");
//        break;
//      case 8:
//        System.out.println("Agosto");
//        break;
//      case 9:
//        System.out.println("Septiembre");
//        break;
//      case 10:
//        System.out.println("Octubre");
//        break;
//      case 11:
//        System.out.println("Noviembre");
//        break;
//      case 12:
//        System.out.println("Diciembre");
//        break;
//    }

//Ejercicio4
//    FizzBuzz: Escribe un programa que imprima los números del 1 al 100. Pero para múltiplos de tres, imprime "Fizz" en lugar del número y para los múltiplos de cinco, imprime "Buzz". Para los números que son múltiplos de tres y cinco, imprime "FizzBuzz".

    for (int i = 1; i < 100; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(i);
      }
    }

  }
}