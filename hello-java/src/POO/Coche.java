package POO;

public class Coche {

  public Coche (){
    ruedas=4;
    color="amarillo";

  }


  private double ancho;

  private double alto;

  private double peso;

  private String color;

  private int ruedas;


  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    this.alto = alto;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String c) {
    color = c;
  }


  public void setRuedas(int r) {
    if (r < 3 || r > 4) {
      System.out.println("el num de ruedas no puede ser ese");
    } else {
      ruedas = r;
    }
  }

  public int getRuedas() {
    return ruedas;
  }


  void arrancar() {


  }

  void frenar() {


  }

  void acelerar() {


  }

  void girar() {


  }


}