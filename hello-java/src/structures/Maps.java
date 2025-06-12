package structures;

import java.util.HashMap;
import java.util.HashSet;

public class Maps {
  public static void main(String[] Args) {

    //Declaracion y creacion

    HashMap<String, String> names = new HashMap<>(); //forma clasica
    var numbers = new HashMap<Integer, String>(); //forma moderna

    //Tamaño
    System.out.println(names.size());

    // Añadir elementos
    names.put("Jesus", "ja@gmail.com");
    names.put("Hernandez", "her@gmail.com");
    names.put("Pacheco", "pache@gmail.com");
    System.out.println(names.size());

    System.out.println(names);

    //Acceder a los elementos
    System.out.println(names.get("Jesus"));
    System.out.println(names.get("Dev"));


    //Verificar Elementos
    System.out.println(names.containsKey("Jesus"));
    System.out.println(names.containsKey("Dev"));
    System.out.println(names.containsValue("Jesus"));
    System.out.println(names.containsValue("Dev"));

    // Eliminar elementos
    System.out.println(names.remove("Jesus"));
    System.out.println(names.remove("Hernandez"));
    System.out.println(names);

    // limpiar HashMap
    names.clear();
    System.out.println(names);

    //Modificacion de elementos
    names.put("Jesus", "ja@gmail.com");
    System.out.println(names);

    names.put("Jesus", "jahp@gmail.com");
    System.out.println(names);

    names.replace("Jesus", "hernan@gmail.com");//reemplaza el valor si existe
    System.out.println(names);

    names.putIfAbsent("Hola", "hernandez@gmail.com");//Solo añade si no existe
    System.out.println(names);


    //Otras operaciones

    System.out.println(names.isEmpty());
    System.out.println(names.values());
    System.out.println(names);










  }
}