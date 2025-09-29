package process_scheduling;

import java.util.List;
import java.util.Comparator;
public class Planning {
  // Algoritmo FIFO
  public static void planificarFIFO(List<Process> procesos) {
// Ordenamos por orden de llegada
    procesos.sort(Comparator.comparingInt(Process::getLlegada));
    int tiempoActual = 0;
    for (Process p : procesos) {
// El proceso comienza cuando el procesador esté libre
      int inicio = Math.max(tiempoActual, p.getLlegada());
      p.setInicio(inicio);
      int fin = inicio + p.getDuracion();
      p.setFin(fin);
      int espera = inicio - p.getLlegada();
      p.setEspera(espera);
      int retorno = fin - p.getLlegada();
      p.setRetorno(retorno);
      tiempoActual = fin;
    }
  }
  // Imprime tabla de resultados
  public static void imprimirResultados(List<Process> procesos) {
    System.out.println("Resultado de la planificación FIFO:\n");
    System.out.printf("%-5s %-8s %-9s %-7s %-6s %-7s %-8s%n",
            "ID", "Llegada", "Duración", "Inicio", "Fin", "Espera", "Retorno");
    double totalEspera = 0;
    double totalRetorno = 0;
    for (Process p : procesos) {
      System.out.printf("%-5s %-8d %-9d %-7d %-6d %-7d %-8d%n",
              p.getId(), p.getLlegada(), p.getDuracion(),
              p.getInicio(), p.getFin(), p.getEspera(), p.getRetorno());
      totalEspera += p.getEspera();
      totalRetorno += p.getRetorno();
    }
    double mediaEspera = totalEspera / procesos.size();
    double mediaRetorno = totalRetorno / procesos.size();
    System.out.printf("%nTiempo medio de espera: %.2f%n", mediaEspera);
    System.out.printf("Tiempo medio de retorno: %.2f%n", mediaRetorno);
  }
}