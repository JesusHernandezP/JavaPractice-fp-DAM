public class Coche {
  private String marca;
  private String modelo;
  private int years;
  private int velocidad;

  // Getter y Setter para la marca
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    if (marca != null && !marca.trim().isEmpty()) {
      this.marca = marca;
    } else {
      System.out.println("La marca no puede ser nula o vacía.");
    }
  }

  // Getter y Setter para el modelo
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    if (modelo != null && !modelo.trim().isEmpty()) {
      this.modelo = modelo;
    } else {
      System.out.println("El modelo no puede ser nulo o vacío.");
    }
  }

  // Getter y Setter para el año
  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    if (years > 1885) {
      this.years = years;
    } else {
      System.out.println("El año debe ser mayor a 1885.");
    }
  }

  // Getter y Setter para la velocidad
  public int getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(int velocidad) {
    if (velocidad >= 0 && velocidad <= 300) {
      this.velocidad = velocidad;
    } else {
      System.out.println("La velocidad debe ser entre 0 y 300 km/h.");
    }
  }
}