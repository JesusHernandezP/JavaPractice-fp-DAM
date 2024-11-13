
public class Main {
  public static void main(String[] args) {

//    int n = 5;
//    for (int i = n; i >= 1; i--) {
//      for (int j = 1; j <= i; j++) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }

    int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    }
  }