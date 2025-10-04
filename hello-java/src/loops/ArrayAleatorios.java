package loops;

public class ArrayAleatorios {
  public static void main(String[] args) {

    int[] aleatorio = new int[200];


    for (int i = 0; i < aleatorio.length; i++) {
      aleatorio[i] = (int) (Math.random() * 100);

    }

    /*for (int input : aleatorio)
      System.out.println( "num: " + input);*/
    for (int j = 0; j <aleatorio.length ; j++) {
      System.out.println(j + " num " + aleatorio[j]);
    }

  }
}