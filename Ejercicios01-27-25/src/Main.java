import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


//Ejercicio1
    int num1 = 3;
    int num2 = 5;
    int suma = num1 + num2;

    System.out.println(suma);
//------------------------------- ----------------

//Ejercicio2
    System.out.println("Ingrese un numero entero");
    int numeroEntero = scanner.nextInt();

    if (numeroEntero % 2 == 0) {
      System.out.println("El numero ingresado es par");
    }
    else {
      System.out.println("El numero ingresado es impar");
    }
    scanner.close();
//------------------------------- ----------------


//  Ejercicio3


    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

//------------------------------- ----------------

//Ejercicio4

    int [] arrayNum = {5 , 6, 9, 8, 4};

    for (int i = 0; i < arrayNum.length; i++) {

      System.out.println(arrayNum[i]);
    }
//------------------------------- ----------------

//  Ejercicio5



persona("Jesus" , "34" );

}
     static void persona (String nombre, String edad){
       System.out.println("hola mi nombre es: " + nombre + " y tengo : " + edad);
    }

}