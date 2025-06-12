package structures;

import java.util.*;
import java.util.Arrays;

public class StructureExercises {

  public static void main(String[] args) {

    // 1. Crea un Array con 5 valores e imprime su longitud.
    System.out.println("1. Crea un Array con 5 valores e imprime su longitud.");
    int[] num = {5, 6, 8, 9, 4};
    System.out.println(num.length);

    // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
    System.out.println("2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.");
    System.out.println(num[2]);
    num[2] = 20;
    System.out.println(num[2]);

    // 3. Crea un ArrayList vacío.
    System.out.println("3. Crea un ArrayList vacío.");
    ArrayList<String> names = new ArrayList<>();
    System.out.println(names);

    // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
    System.out.println("4. Añade 4 valores al ArrayList y elimina uno a continuación.");
    names.add("hola");
    names.add("esto es");
    names.add("una adicion");
    names.add("de 4 valores");
    System.out.println(names);
    System.out.println(names.remove("una adicion"));
    System.out.println(names);


    // 5. Crea un HashSet con 2 valores diferentes.
    System.out.println("5. Crea un HashSet con 2 valores diferentes.");
    HashSet<Integer> numbers = new HashSet<>();
    System.out.println(numbers.add(25));
    System.out.println(numbers.add(50));
    System.out.println(numbers);


    // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
    System.out.println(numbers.add(25));
    System.out.println(numbers.add(30));
    System.out.println(numbers);

    // 7. Elimina uno de los elementos del HashSet.
    System.out.println("7. Elimina uno de los elementos del HashSet.");
    System.out.println(numbers.remove(50));
    System.out.println(numbers);

    // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
    System.out.println("8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.");
    HashMap<String, Integer> contacts = new HashMap<>();
    System.out.println(contacts.put("jose", 635635635));
    System.out.println(contacts.put("Maria", 563563563));
    System.out.println(contacts.put("pedro", 896896896));
    System.out.println(contacts);

    // 9. Modifica uno de los contactos y elimina otro.
    System.out.println("9. Modifica uno de los contactos y elimina otro.");
    System.out.println(contacts);
    System.out.println(contacts.replace("jose", 874874874));
    System.out.println(contacts);
    System.out.println(contacts.remove("jose"));
    System.out.println(contacts);

    // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
    // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
    System.out.println("10. Dado un Array, transfórmalo en un ArrayList, a " +
            "continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.");

    String[] miArray = {"manzana", "banana", "naranja", "uva"};

// Paso 1: Convertir Array a ArrayList
    List<String> arrayList = new ArrayList<>(Arrays.asList(miArray));
    System.out.println("ArrayList: " + arrayList);

// Paso 2: Convertir ArrayList a HashSet (elimina duplicados)
    Set<String> hashSet = new HashSet<>(arrayList);
    System.out.println("HashSet: " + hashSet);

// Paso 3: Convertir HashSet a HashMap con clave y valor iguales
    Map<String, String> hashMap = new HashMap<>();
    for (String elemento : hashSet) {
      hashMap.put(elemento, elemento); // Clave y valor son lo mismo
    }

    System.out.println("HashMap (clave y valor iguales): " + hashMap);

  }
}