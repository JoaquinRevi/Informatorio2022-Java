import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int valorInicio, valorFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de inicio: ");
        valorInicio = sc.nextInt();
        System.out.println("Ingrese el valor final: ");
        valorFinal = sc.nextInt();
        if ((valorFinal > valorInicio)) {
            System.out.println(fizzBuzzFunction(valorInicio, valorFinal));
        } else {
            System.out.println("El primero valor debe ser menor al segundo");
        }

    }

    private static List fizzBuzzFunction(int a, int b) {
        List<String> lista = new ArrayList<>();
        for (int i = a; i < b; i++) {
                if (i % 2 == 0 && i % 3 == 0) lista.add("FizzBuzz");
                else if (i % 2 == 0) lista.add("Fizz");
                else if(i % 3 == 0) lista.add("Buzz");
                else lista.add(String.valueOf(i));

        }
        return lista;
    }

}
