import java.util.ArrayList;

  class Libro {
    String titulo;
    String autor;
    boolean disponible = true;

    public Libro(String titulo, String autor) {
      this.titulo = titulo;
      this.autor = autor;
    }


    public void prestar() {
      if (disponible) {
        disponible = false;
        System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
      } else {
        System.out.println("El libro \"" + titulo + "\" no esta disponible.");
      }
    }

    public void devolver() {
      if (!disponible) {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
      } else {
        System.out.println("El libro \"" + titulo + "\" ya esta disponible.");
      }

    }
  }

  class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();


    public void agregarLibro(Libro libro) {
      libros.add(libro);
    }

    public void mostrarLibrosDisponibles() {
      System.out.println("Libros disponibles: ");
      for (Libro libro : libros) {
        if (libro.disponible) {
          System.out.println("- " + libro.titulo + " de " + libro.autor);

        }
      }
    }

    public void prestarLibro(String titulo) {
      for (Libro libro : libros) {
        if (libro.titulo.equalsIgnoreCase(titulo) && libro.disponible) {
          libro.prestar();
          return;
        }
      }
      System.out.println("El libro \"" + titulo + "\" no esta disponible.");
    }

    public void devolverLibro(String titulo) {
      for (Libro libro : libros) {
        if (libro.titulo.equalsIgnoreCase(titulo) && !libro.disponible) {
          libro.devolver();
          return;
        }
      }
      System.out.println("El libro \"" + titulo + "\" no fue prestado.");
    }

  }
    public class Main {
      public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry"));

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Prestar un libro
        biblioteca.prestarLibro("1984");

        // Mostrar libros disponibles después de prestar
        biblioteca.mostrarLibrosDisponibles();

        // Devolver un libro
        biblioteca.devolverLibro("1984");

        // Mostrar libros disponibles después de devolver
        biblioteca.mostrarLibrosDisponibles();
      }

    }