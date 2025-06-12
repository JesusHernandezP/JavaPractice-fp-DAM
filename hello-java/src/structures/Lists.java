package structures;

import java.util.ArrayList;

public class Lists {

  public static void main(String[]Args){

    //Declaracion y creacion

    ArrayList<String> names = new ArrayList<>(); //forma clasica
    var numbers = new ArrayList<Integer>(); //forma moderna

    //Tamaño
    System.out.println(names.size());

    // Añadir elementos
    names.add("Jesus");
    names.add("Hernandez");
    names.add("pacheco");
    System.out.println(names.size());

    //Acceder a los elementos
    System.out.println(names.getFirst());
    System.out.println(names.get(1));
    System.out.println(names.getLast());

    //Modificar los elementos
    names.set(2, "jahp88x@gmail.com");
    System.out.println(names.getLast());

    // Eliminar elementos

    names.remove(2);
    //System.out.println(names.get(2));// YA no existe error!
    System.out.println(names.size());

    //Buscar elementos

    System.out.println(names.contains("Jesus"));
    System.out.println(names.contains("jahp88x@gmail.com"));

    //Limpiar Arraylist

    names.clear();
    System.out.println(names.size());


  }
}