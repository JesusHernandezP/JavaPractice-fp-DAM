package strings;

public class StringExercises{

  public static void main(String[] args) {
    String name = "Jesus";
    String lastName = "Hernandez";

    // 1. Concatena dos cadenas de texto.
    System.out.println("1. Concatena dos cadenas de texto.");
    System.out.println(name + " " + lastName);

    // 2. Muestra la longitud de una cadena de texto.
    System.out.println("2. Muestra la longitud de una cadena de texto.");
    System.out.println(lastName.length());

    // 3. Muestra el primer y último carácter de un string.
    System.out.println("3. Muestra el primer y último carácter de un string.");
    System.out.println(lastName.charAt(0));
    System.out.println(lastName.charAt(lastName.length()-1 ));

    // 4. Convierte a mayúsculas y minúsculas un string.
    System.out.println("4. Convierte a mayúsculas y minúsculas un string.");
    System.out.println(lastName.toLowerCase());
    System.out.println(lastName.toUpperCase());

    // 5. Comprueba si una cadena de texto contiene una palabra concreta.
    System.out.println("5. Comprueba si una cadena de texto contiene una palabra concreta.");
    System.out.println(name.contains("jesus"));
    System.out.println(name.toUpperCase().contains("JESUS"));

    // 6. Formatea un string con un entero.
    System.out.println("6. Formatea un string con un entero.");
    var age = 35;
    System.out.println("Mi apellido es Hernandez, y tengo 35 años");
    System.out.println(String.format("Mi apellido es %s, y tengo %d años", lastName, age));


    // 7. Elimina los espacios en blanco al principio y final de un string.
    System.out.println("7. Elimina los espacios en blanco al principio y final de un string.");
    System.out.println(" Mi apellido es Hernandez, y tengo 35 años ");
    System.out.println(" Mi apellido es Hernandez, y tengo 35 años ".trim());


    // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
    System.out.println("8. Sustituye todos los espacios en blanco de un string por un guión (-).");
    System.out.println("Mi apellido es Hernandez, y tengo 35 años".replace(" ", "-"));

    // 9. Comprueba si dos strings son iguales.
    System.out.println("9. Comprueba si dos strings son iguales.");
    String a = "hola";
    String b = "hello";
    String c = "hello";
    System.out.println(a.equals(b));
    System.out.println(b.equals(c));

    // 10. Comprueba si dos strings tienen la misma longitud.
    System.out.println("10. Comprueba si dos strings tienen la misma longitud.");
    System.out.println(a.length() == b.length());
    System.out.println(b.length() == c.length());

  }
}