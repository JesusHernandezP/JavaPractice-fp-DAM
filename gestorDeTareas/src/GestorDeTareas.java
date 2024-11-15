import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {
  private ArrayList<Tarea> tareas;

  //  Constructor
  public GestorDeTareas() {
    tareas = new ArrayList<>();
  }

//  Metodo para agregar tarea

  public void agregarTarea(String descripcion) {
    tareas.add(new Tarea(descripcion));
  }

  //  Metodo para ver todas las tares
  public void verTareas() {
    if (tareas.isEmpty()) {
      System.out.println("no hay tareas");
    } else {
      for (int i = 0; i < tareas.size(); i++) {
        System.out.println((i + 1) + ". " + tareas.get(i));
      }
    }
  }

//  Metodo para eliminar tarea

  public void eliminarTarea(int indice) {
    if (indice >= 1 && indice <= tareas.size()) {
      tareas.remove(indice - 1);
      System.out.println("Tarea Eliminada");
      }else {
      System.out.println("indice invalido.");
    }
  }

//  Metodo para marcar tarea como completada

public void completarTarea(int indice){
  if (indice >= 1 && indice <= tareas.size()) {
    tareas.get(indice - 1).marcarComoCompletada();
    System.out.println("Tarea marcada como completada");
  }else {
    System.out.println("Indice invalido.");
  }
}





}