package strings;

public class Strings {
  public static void main(String[] Args) {

    // Cadenas de texto

    //Declaracion
    String name = "Jesus";
    var surname = new String("Hernandez");

    //Operaciones Basicas
    System.out.println(name + " " + surname);

    //Longitud del String
    System.out.println(name.length());

    //obtener caracter
    System.out.println(name.charAt(2));
    System.out.println(name.charAt(name.length() - 1));

    //Subcadena
    System.out.println(name.substring(2));
    System.out.println(name.substring(2, 4));

    //Mayusculas y minusculas
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());

    //Comprobar si contiene algo
    System.out.println("hola, Java".contains("Java"));
    System.out.println("hola, Java".contains("java"));
    System.out.println("hola, Java".toLowerCase().contains("java"));

    //Comparacion
    System.out.println(name.equals("jesus"));
    System.out.println(name.equalsIgnoreCase("jesus"));

    // == vs .equals

    var a = "Brais";
    var b = "Brais";
    var c = new String("Brais");

    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println(a.equals(c));

    //Modificar, Eliminar espacios (TRIM)

    //trim
    System.out.println(" hola , me llamo jesus ".trim());

    //Replace
    System.out.println("hola , me llamo jesus".replace(" ", ""));
    System.out.println("hola , me llamo jesus".replace("jesus", "alberto"));

    //Format
    var age = 35;
    System.out.println(String.format("hola, mi nombre es jesus. tengo 35 años", name, age));

    System.out.println(String.format("hola, mi nombre es %s. tengo %d años", name, age));


    //---------------------------------------------
    String nombre1="Juan";
    String nombre = "juan";
    int longitud = nombre.length();

    System.out.println(nombre.length() +  " tiene " +  longitud);
    System.out.println( "La ultima letra de mi nombre es : " + nombre.charAt(nombre.length()-1));

    String frase = " hola como estas estamos practicando String y necesito escribir un texto largo ";

    String subcadena= frase.substring(4, 26);

    System.out.println(subcadena);

    System.out.println(nombre.equals(nombre1));
    System.out.println(nombre.equalsIgnoreCase(nombre1));

  }
}