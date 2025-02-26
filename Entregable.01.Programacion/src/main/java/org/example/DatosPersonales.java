package org.example;

import java.util.Scanner;

public class DatosPersonales {
  public static void main(String[] args) {
    // Objeto Scanner para leer lo que escribe el usuario.
    Scanner scanner = new Scanner(System.in);

    // Solicitar el nombre del usuario
    System.out.print("Por favor, ingresa tu nombre: ");
    String nombre = scanner.nextLine();

    // Solicitar la edad del usuario
    System.out.print("Ingresa tu edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine();

    // Solicitar la altura del usuario
    System.out.print("Ingresa tu altura: ");
    double altura = scanner.nextDouble();
    scanner.nextLine();

    // Solicitar si es estudiante o no
    System.out.print("¿Eres estudiante? : ");
    String esEstudiante = scanner.nextLine();

    // Cálculos
    int edadFutura = edad + 5;  // Calcula la edad en 5 años
    double dobleAltura = altura * 2;  // Calcula el doble de la altura

    // Muestra los resultados en la consola
    System.out.println("------------------------------------------------------------------");
    System.out.println("Datos ingresados:");
    System.out.println("Nombre: " + nombre);
    System.out.println("Tu edad actual: " + edad + " años");
    System.out.println("Tu edad en 5 años: " + edadFutura + " años");
    System.out.println("Tu altura actual: " + altura + " metros");
    System.out.println("El doble de tu altura: " + dobleAltura);
    System.out.println(esEstudiante + "Soy estudiante");

    // Se cierra el objeto Scanner
    scanner.close();
  }
}