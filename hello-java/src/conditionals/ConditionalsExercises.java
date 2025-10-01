package conditionals;

public class ConditionalsExercises {

  public static void main(String[] args) {

    // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
    System.out.println("1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)");
    int age = 18;

    if (age >= 18) {
      System.out.println("El usuario puede votar");
    } else {
      System.out.println("El usuario no tiene edad para votar");
    }

    // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
    System.out.println("2. Declara dos números y muestra cuál es mayor, o si son iguales.");
    int num1 = 2;
    int num2 = 10;

    if (num1 > num2) {
      System.out.println("El numero 1 es mayor");
    } else if (num1 < num2) {
      System.out.println("El numero 2 es mayor");
    } else {
      System.out.println("los numero son iguales");
    }

    // 3. Dado un número, verifica si es positivo, negativo o cero.
    System.out.println("3. Dado un número, verifica si es positivo, negativo o cero.");
    if (num1 > 0) {
      System.out.println("El numero es positivo");
    } else if (num1 < 0) {
      System.out.println("El numero 2 es negativo");
    } else {
      System.out.println("El numero es 0");
    }

    // 4. Crea un programa que diga si un número es par o impar.
    System.out.println("4. Crea un programa que diga si un número es par o impar.");
    if (num1 % 2 == 0) {
      System.out.println("El numero es par");
    }else {
      System.out.println("El numero es impar");
    }

    // 5. Verifica si un número está en el rango de 1 a 100.
    System.out.println("5. Verifica si un número está en el rango de 1 a 100.");
    if (num2 >= 1 && num2 <= 100) {
      System.out.println("El numero esta en el rango de los numero 1 al 100");
    }else {
      System.out.println("El numero esta fuera del rango");
    }

    // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
    System.out.println("6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.");
    var day = 4;

    switch (day) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("No es un dia de la semana");

    }

    // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
    System.out.println("7. Simula un sistema de notas: muestra \"Sobresaliente\", \"Aprobado\" o \"Suspenso\" según la nota (0-100).");
    int notes = 10;
    if( notes >=8 ) {
      System.out.println("Sobresaliente");
    } else if (notes >= 5 && notes <= 7) {
      System.out.println("Aprobado");
    }else {
      System.out.println("Suspenso");
    }

    // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
    System.out.println("8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.");
    if (age >= 15) {
      System.out.println("El usuario puede entrar solo al cine");
    } else {
      System.out.println("El usuario debe ir acompañado");
    }

    // 9. Crea un programa que diga si una letra es vocal o consonante.
    System.out.println("9. Crea un programa que diga si una letra es vocal o consonante.");
    char word = 'x';
    if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
      System.out.println("La letra es una vocal");
    }else {
      System.out.println("La letra es una consonante");
    }

    // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    System.out.println("10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.");
    var a = 5;
    var b = 6;
    var c = 7;
    if (a > b && a > c) {
      System.out.println("El mayor es a: "  + a);
    } else if (b > a && b > c) {
      System.out.println("El mayor es b: "  + b);
    } else {
      System.out.println("El mayor es c: "  + c);
    }



  }
}