package structures;

import java.util.HashSet;

public class Sets {
  public static void main(String[] Args) {

    //Declaracion y creacion

    HashSet<String> names = new HashSet<>(); //forma clasica
    var numbers = new HashSet<Integer>(); //forma moderna

    //tamaño

    System.out.println(names.size());

    // Añadir elementos
    names.add("Jesus");
    names.add("Hernandez");
    names.add("pacheco");
    System.out.println(names.size());
    System.out.println(names);

    numbers.add(10);
    numbers.add(21);
    numbers.add(13);
    System.out.println(numbers);


    //Eliminar elementos
    names.remove("Jesus");
    System.out.println(names.size());

    //Buscar elementos

    System.out.println(names.contains("Jesus"));
    System.out.println(names.contains("jahp88x@gmail.com"));

    // no permite repetidos
    System.out.println(names);
    names.add("pacheco");
    names.add("pacheco");
    names.add("pacheco");
    System.out.println(names);

    //Conjuntos

    //names.addAll(numbers); Error!

    var countries = new HashSet<String>();
    countries.add("España");
    countries.add("Mexico");
    countries.add("Argentina");

    names.addAll(countries);
    System.out.println(names);

    names.removeAll(countries);
    System.out.println(names);

    names.retainAll(countries);
    System.out.println(names);


  }


}