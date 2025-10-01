package data_var_cons;

public class DataTypes {


  public static void main(String[] Args){

    int myInt2;
    // Tipos de datos primitivos

    int myInt = 35;
    System.out.println(myInt);

    double myDouble = 1.85;
    System.out.println(myDouble);

    char character = 'A';
    System.out.println(character);

    float myFloat = 2.55f;

    boolean myBoolean = true;
    myBoolean = false;
    System.out.println(myBoolean);

    long myLong = 500;
    System.out.println(myLong);

    byte myByte = 40;
    System.out.println(myByte);

    String myString = "hola mundo"; // no es un dato primitivo, es una clase. Pero es el ma comun de los datos

    //Tipo de dato en tiempo de compilacion

    System.out.println(myString.getClass().getSimpleName());

  }
}