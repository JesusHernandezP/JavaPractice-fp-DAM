package math;

import java.math.BigInteger;

public class MathClass {


  public static void main (String [] args) {

    int raiz =(int)Math.sqrt(10);

    System.out.println(raiz);
//--------------------------------------------------------------------

    double metodopow= Math.pow(5 , 3);
    System.out.println(metodopow);

//    ------------------------------------------------------------------

    double value  = Math.random();
    System.out.println(value);

//    --------------------------------------------------------------

    BigInteger base = BigInteger.valueOf(25);

    int exponente = 321;

    BigInteger potencia = base.pow(exponente);

    System.out.println(potencia);

//    -----------------------------------------------------------

    int aleatorio =(int) (Math.random()*100);
    System.out.println(aleatorio);

    if (aleatorio <=100) {
      System.out.println("El numero random (" + aleatorio + ")es menor o igual a 100");

    }



  }


}