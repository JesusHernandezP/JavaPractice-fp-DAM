package helloworld;

public class HelloWorldExercises {

  public static void main(String[] args) {
    // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
    System.out.println("1. Imprime un mensaje que diga tu nombre en lugar de \"¡Hola Mundo!\"."
    );
    System.out.println("Hola, Jesus");

    // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
    System.out.println("2. Imprime dos líneas: \"Hola\" y luego \"Mundo\" con un solo println.");
    System.out.println("Hola\nMundo");

    // 3. Añade un comentario sobre lo que hace cada línea del programa.
    // Cada linea tiene su comentario listo

    // 4. Crea un comentario en varias líneas.
    /* Esta es la forma
    de comentar
    varias
    lineas
     */

    // 5. Imprime tu edad, tu color favorito y tu ciudad.
    System.out.println("5. Imprime tu edad, tu color favorito y tu ciudad.");
    System.out.println("tengo 35 años");
    System.out.println("Mi color favorito es el azul");
    System.out.println("Vivo en Madrid");

    // 6. Explora los diferentes System.XXX.println(); más allá de "out".
    System.out.println("6. Explora los diferentes System.XXX.println(); más allá de \"out\".");
    System.out.println("out");
    System.err.println("error");

    // 7. Utiliza varios println para imprimir una frase.
    System.out.println("7. Utiliza varios println para imprimir una frase.");
    System.out.println("Estoy utilizando");
    System.out.println("varios println");
    System.out.println("para imprimir una frase");

    // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
    System.out.println("8. Imprime un diseño ASCII (por ejemplo, una cara feliz ");
    System.out.println("─────────▀▀▀▀▀▀──────────▀▀▀▀▀▀▀\n" +
            "──────▀▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀▀▀▀▀▀▀\n" +
            "────▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────▀▀▀\n" +
            "───▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────────▀▀\n" +
            "──▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀───────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀─────▀▀▀▀▀▀▀──────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀▀──────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
            "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
            "──▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
            "───▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀▀\n" +
            "─────▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀▀\n" +
            "──────▀▀▀▀▀▀▀▀▀▀▀───▀▀▀────────▀▀▀\n" +
            "────────▀▀▀▀▀▀▀▀▀──▀▀▀▀▀────▀▀▀▀\n" +
            "───────────▀▀▀▀▀▀───▀▀▀───▀▀▀▀\n" +
            "─────────────▀▀▀▀▀─────▀▀▀▀\n" +
            "────────────────▀▀▀──▀▀▀▀\n" +
            "──────────────────▀▀▀▀\n" +
            "───────────────────▀▀\n");

    // 9. Intenta ejecutar el programa sin el método main y observa el error.
    System.out.println("9. Intenta ejecutar el programa sin el método main y observa el error.");
    System.out.println("java: <identifier> expected");

    //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    System.out.println(" 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?");
    System.out.println("D:\\documentos_hdd\\JavaMouredev\\hello-java\\src\\HelloWorldExercises.java\n" +
            "java: class HelloWorld is public, should be declared in a file named HelloWorld.java");

  }
}