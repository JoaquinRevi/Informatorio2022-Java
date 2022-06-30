import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List <Integer> palabras;
        palabras = Arrays.asList(1,2,4,4,4);
        System.out.println(palabras);
        List <Integer> factorial = new ArrayList<>();
        //borramos los elementos repetidos de la lista palabras
        palabras = palabras.stream().distinct().collect(Collectors.toList());
        //a cada elemento de palabras lo pasamos como parametro de la funcion funFactorial y lo agregamos a la lista factorial
        palabras.stream().map(x -> funcFactorial(x)).forEach(x -> factorial.add(x));
        System.out.println(factorial);
    }

    private static int funcFactorial(int x) {
        int res = x;
        for (int i = 1; i < x; i++) {
            res *= i;
        }
        return res;
    }

}
