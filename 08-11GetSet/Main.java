public class Main {
  public static void main(String[] args) {
    // Objeto
    Coche miCoche = new Coche();

    // valores validos

    miCoche.setMarca("Ford");
    miCoche.setModelo("Mustang");
    miCoche.setYears(2000);
    miCoche.setVelocidad(140);

    // Resultado
    System.out.println("Marca: " + miCoche.getMarca());
    System.out.println("Modelo: " + miCoche.getModelo());
    System.out.println("Año: " + miCoche.getYears());
    System.out.println("Velocidad: " + miCoche.getVelocidad() + " km/h");


  }
}