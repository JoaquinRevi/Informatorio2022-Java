import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //Cargamos la lista con numeros ingresados por consola
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero:");
            numeros.add(sc.nextInt());

        }
        //mostramos el tamaño y los valores iterando con un forEach
        System.out.println("El tamaño de la lista es: "+ numeros.size()+"\nSu lista actual es: ");
        for (int numero: numeros) {
            System.out.println("Posición: "+ numeros.indexOf(numero)+ " Valor:" + numero);

        }
        //cargamos valores al inicio de la lista y al final de la misma
        System.out.println("Ingresa un numero para el inicio de la lista:");
        numeros.add(0, sc.nextInt());
        System.out.println("Ingresa un numero para el final de la lista");
        numeros.add(sc.nextInt());
        //mostramos el tamaño final de la lista y sus valores sin iterarlos
        System.out.println("El tamaño de la lista es: "+ numeros.size()+"\nSu lista actual es: "+ numeros);

    }
}
