package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
  public static void  main(String[] args){

    for (int i = 0; i < 5; i++) {
      sendEmail();
    }

    sendEmailToUser("lasjhd@ljash.com");
    sendEmailToUser("lasjhd@ljash.com", "Jesus");

    var users = new ArrayList<>(Arrays.asList("lksdhflkj@lskfdghj.com", "iahdljhsad@kdsjf.com"));
    sendEmailToUser(users);

    var state = sendEmailWithState("");
    System.out.println(state);
  }

// Funcion sin paramaetro y retorno

  public static void sendEmail(){
    System.out.println("Se envia el email");
  }

// Funcion con paramaetro

  public static void sendEmailToUser(String email){
  System.out.println("Se envia el email a: " + email);
}

//Sobrecarga de funciones

  public static void sendEmailToUser(String email, String name){
    System.out.println("Se envia el email a: " + name + " email:" + email);
  }
  public static void sendEmailToUser(ArrayList<String> emails) {
    for (String email : emails) {
      System.out.println("Se envia el email a: " + " email:" + email);
    }
  }

//  Funciones con retorno


  public static boolean sendEmailWithState(String email){
    if (email.isEmpty()){
      return false;
    }
    System.out.println("Se envia el email");

    return true;
  }


}