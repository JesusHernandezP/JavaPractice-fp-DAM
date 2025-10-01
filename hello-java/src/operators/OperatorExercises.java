package operators;

public class OperatorExercises {

  public static void main(String[] args) {

    // 1. Crea una variable con el resultado de cada operación aritmética.
    System.out.println("1. Crea una variable con el resultado de cada operación aritmética.");
    var a = 5;
    var b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    // 2. Crea una variable para cada tipo de operación de asignación.
    System.out.println("2. Crea una variable para cada tipo de operación de asignación.");
    a = b;
    System.out.println(a);

    a = b * 2;
    System.out.println(a);

    a += 1; // a = a + 1
    System.out.println(a);
    a -= 2; // a = a - 2
    System.out.println(a);
    a *= 2; // a = a * 2
    System.out.println(a);
    a /= 2; // a = a / 2
    System.out.println(a);
    a %= 2; // a = a % 2
    System.out.println(a);

    // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
    System.out.println("3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.\n");
    System.out.println(a != b);
    System.out.println(a < b);
    System.out.println(a <= b);


    // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
    System.out.println("4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.");
    System.out.println(a == b);
    System.out.println(a == 0);
    System.out.println(a > b);


    // 5. Utiliza el operador lógico and.
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && false);
    System.out.println(false && true);

    System.out.println(3 < 2 && 5 == 2);

    // 6. Utiliza el operador lógico or.
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || false);
    System.out.println(false || true);

    System.out.println(3 < 2 || 5 == 2);

    // 7. Combina ambos operadores lógicos.
    System.out.println("7. Combina ambos operadores lógicos.");
    System.out.println(3 < 2 || 5 == 2 && 5 < 2);

    // 8. Añade alguna negación.
    System.out.println("8. Añade alguna negación.");
    System.out.println(!(3 < 2) || 5 == 2);


    // 9. Imprime 3 ejemplos de uso de operadores unarios.
    System.out.println("9. Imprime 3 ejemplos de uso de operadores unarios.");
    System.out.println(+b);
    System.out.println(-b);
    System.out.println(++b);

    // 10. Combina operadores aritméticos, de comparación y lógicos.
    System.out.println("10. Combina operadores aritméticos, de comparación y lógicos.");
    int x = 3;
    int y = 4;
    int z = 5;

    System.out.println((x > 10 && y < 20) || z == 5);

  }
}