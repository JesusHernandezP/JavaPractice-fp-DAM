package process_scheduling;

import java.util.ArrayList;
import java.util.List;
public class PlanningSimulator {

  public static void main(String[] args) {
    //Lista de procesos de ejemplo
    List<Process> listaProcesos = new ArrayList<>();
    listaProcesos.add(new Process("P1",0,8,2));
    listaProcesos.add(new Process("P2",1,4,1));
    listaProcesos.add(new Process("P3",2,9,3));
    listaProcesos.add(new Process("P4",3,5,2));
    //Ejecutar FIFO
    Planning.planificarFIFO(listaProcesos);
    //Mostramos la crap
    Planning.imprimirResultados(listaProcesos);
  }
}