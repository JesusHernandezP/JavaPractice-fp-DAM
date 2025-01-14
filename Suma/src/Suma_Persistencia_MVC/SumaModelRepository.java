package Suma_Persistencia_MVC;

import java.util.ArrayList;

public class SumaModelRepository {

  private static ArrayList<Integer> resultados = new ArrayList<Integer>();

  static void guardar(int valor) {
    resultados.add(valor);
  }

  static ArrayList<Integer> obtenerResultado() {
    return resultados;
  }

}