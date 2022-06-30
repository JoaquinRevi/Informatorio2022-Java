import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> numeros = new ArrayList<>();
	List<Long> numerosPow2 = new ArrayList<>();
	//cargamos el ArrayList
	numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    //Aplicamos la potencia de 2 a cada valor de numeros y lo agregamos a numerosPow2
    numeros.stream().map(numero -> Math.round(Math.pow(numero,2))).forEach(numero -> numerosPow2.add(numero));
    System.out.println(numerosPow2);
    }
}
