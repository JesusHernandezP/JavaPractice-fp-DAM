package conditionals;

public class Conditionals {
  public static void main(String[] Args) {

    //Condicionales

    var age = 16;

    //If , Else if, Else
    if (age > 18) {
      System.out.println("El usuario es mayor de edad");
    } else if (age == 18) {
      System.out.println("El usuario acaba de cumplir 18");
    } else {
      System.out.println("El usuario no es mayor de edad");
    }

    //Switch

    var day = 1;

    switch (day) {
      case 1:
        System.out.println("lunes");
        break;
      case 2:
        System.out.println("martes");
        break;
      case 3:
        System.out.println("miercoles");
        break;
      default:
        System.out.println("no es lunes, martes ni miercoles");

    }

    



  }

}