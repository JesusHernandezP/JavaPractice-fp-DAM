package structures;

public class Arrays {

  public static void main(String[] Args){

    // Declaracion y creación

    int [] numbers = new int[3];
    numbers [0] = 2;
    numbers [1] = 2;
    numbers [2] = 2;


    for (int i = 0; i < numbers.length; i++) {
    System.out.println("valor de i: "+ i + " = " + numbers[i]);

    }


    String[] names = {"Jesus", "Alberto", "Hernandez"};
    System.out.println(names[2]);

    //Acceso

    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(names[0]);

    //Modificación
    numbers[0] = 1;
    numbers[1] = 10;
    numbers[2] = 0;

    System.out.println(numbers[1]);
    System.out.println(numbers[2]);

    System.out.println(names[2]);
    names[2] = "Hernandez@gmail.com";
    System.out.println(names[2]);

    boolean[] booleans = new boolean[5];
    System.out.println(booleans[1]);


    //Arrays Bidimensionales

    int [][] matrix = new int[3][4];

    matrix [0][0]=9;
    matrix [0][1]=3;
    matrix [0][2]=8;
    matrix [0][3]=6;

    matrix [1][0]=4;
    matrix [1][1]=5;
    matrix [1][2]=4;
    matrix [1][3]=4;

    matrix [2][0]=7;
    matrix [2][1]=8;
    matrix [2][2]=8;
    matrix [2][3]=8;

    System.out.println("-------------------------------------------------------------------------");

    for (int i = 0; i <3 ; i++) {
      for (int j = 0; j <4; j++) {

        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }


    int [][] matrix2 ={
            {0,5,6,9},
            {7,4,1,4},
            {3,6,1,3}
    };

    for (int [] fila:matrix2){
      System.out.println();
      for (int z : fila){
        System.out.print(z + " ");

      }
    }









  }
 }