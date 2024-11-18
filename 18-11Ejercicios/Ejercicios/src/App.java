
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] almacen = new int[5];
        System.out.println("Ingrese 5 numeros enteros");
        
        for (int i = 0; i < almacen.length; i++) {
            System.out.println("numero " + (i + 1) + " :");
            almacen[i] = scan.nextInt();
        }

        int suma = 0;
        int mayor = almacen[0];
        int menor = almacen[0];

        for (int i = 0; i < almacen.length; i++) {
            suma += almacen[i];

            if (almacen[i] > mayor) {
                mayor = almacen[i];

            } if (almacen[i] < menor) {
                menor = almacen[i];
            } 
        }
        System.out.println("La suma de todos los numeros ingresados es: " + suma);
        System.out.println("El promedio es: " + ((double)suma / almacen.length));
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);

    }

}
