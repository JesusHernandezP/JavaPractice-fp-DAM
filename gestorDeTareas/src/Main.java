import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    GestorDeTareas gestor = new GestorDeTareas();

    while (true){
      System.out.println("---------------------------------------------------------------");
      System.out.println("Gestor de tareas");
      System.out.println("1. Agregar tarea");
      System.out.println("2. Ver tarea");
      System.out.println("3. Eliminar tarea");
      System.out.println("4. Completar tarea");
      System.out.println("5. Salir");
      System.out.println("Elige una opcion");
      System.out.println("-------------------------------------------------------------------");

      int opcion = scan.nextInt();
      scan.nextLine();

      switch (opcion){
        case 1:
          System.out.println("Ingresa la descripcion de la tarea");
          String descripcion = scan.nextLine();
          gestor.agregarTarea(descripcion);
          break;
        case 2:
          gestor.verTareas();
          break;

        case 3:
          System.out.println("Ingresa el indice de la tarea a elminar: ");
          int eliminarIndice = scan.nextInt();
          gestor.eliminarTarea(eliminarIndice);
          break;
        case 4:
          System.out.println("Ingresa el numero de tarea a completar: ");
          int completarIndice = scan.nextInt();
          gestor.completarTarea(completarIndice);
          break;
        case 5:
          System.out.println("Saliendo.....");
          return;
        default:
          System.out.println("opcion no valida");
      }
    }
  }
}