package structures;

public class Arrays {

  public static void main(String[] Args){

    // Declaracion y creación

    int [] numbers = new int[3];
    System.out.println(numbers);

    String[] names = {"Jesus", "Alberto", "Hernandez"};
    System.out.println(names);

    //Acceso

    System.out.println(numbers[0]);
    System.out.println(names[0]);

    //Modificación
    numbers[0] = 1;
    numbers[1] = 10;
    numbers[2] = 0;

    System.out.println(numbers[1]);
    System.out.println(numbers[2]);

    System.out.println(names[2]);
    names[2] = "Hernandez@gmail.com";
    System.out.println(names[2]);

    boolean[] booleans = new boolean[5];
    System.out.println(booleans[4]);
    




  }
}