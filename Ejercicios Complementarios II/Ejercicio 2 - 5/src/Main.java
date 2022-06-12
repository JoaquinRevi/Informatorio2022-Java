import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> horasTrabajadas;
	List <Integer> valorPorHora;
	List <Integer> totales = new ArrayList<>();
	int sum = 0;
	//Cargamos la listas con valores
	horasTrabajadas = Arrays.asList(6,7,8,4,5);
	valorPorHora = Arrays.asList(350,345,550,600,320);
	//agregamos el resultado de la operacion a la lista totales
		for (int i = 0; i < horasTrabajadas.size(); i++) {
			totales.add(horasTrabajadas.get(i)*valorPorHora.get(i));
		}
	//Imprimimos por consola los resultados
		System.out.println(totales);
		for (int total : totales ) {
			sum += total;
		}
		System.out.println("Total Final: $" + sum);
    }
}
