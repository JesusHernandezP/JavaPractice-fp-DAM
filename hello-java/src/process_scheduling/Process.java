package process_scheduling;


  public class Process {
    private String id;
    private int llegada;
    private int duracion;
    private int prioridad;
    private int inicio;
    private int fin;
    private int espera;
    private int retorno;
    public Process(String id, int llegada, int duracion, int prioridad) {
      this.id = id;
      this.llegada = llegada;
      this.duracion = duracion;
      this.prioridad = prioridad;
    }
    // Getters y setters
    public String getId() { return id; }
    public int getLlegada() { return llegada; }
    public int getDuracion() { return duracion; }
    public int getPrioridad() { return prioridad; }
    public int getInicio() { return inicio; }
    public void setInicio(int inicio) { this.inicio = inicio; }
    public int getFin() { return fin; }
    public void setFin(int fin) { this.fin = fin; }
    public int getEspera() { return espera; }
    public void setEspera(int espera) { this.espera = espera; }
    public int getRetorno() { return retorno; }
    public void setRetorno(int retorno) { this.retorno = retorno; }
  }