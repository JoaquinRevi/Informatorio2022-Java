import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    	//Creamos objetos de tipo Empleados
	   	Empleados empleado1 = new Empleados("Jorge","Perez",43111735);
		Empleados empleado2 = new Empleados("Juan","Rodriguez",36114235);
		Empleados empleado3 = new Empleados("Marcos","Martinez",39348172);
		Empleados empleado4 = new Empleados("Cristian","Robinson",38134255);
		Map<Integer,Double> empleadosMap = new HashMap<>();

		//Creamos un Set y cargamoslos empleados
		Set<Empleados> empleados = new HashSet<>();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		//Creamos aleatoriamente Horas trabajas y Valor por hora en cada empleado
		for (Empleados empleado: empleados) {
			empleado.sethorasTrabajasPorDia();
			empleado.setvalorPorHora();
		}
		//Imprimimos por consola los empleados cargados
		for (Empleados empleado: empleados) {
			System.out.println(empleado.toString());
		}
		//Cargamos un Hashmap con el dni como clave y el sueldo como valor
		for (Empleados empleado : empleados){
			empleadosMap.put(empleado.getDNI(), empleado.getsueldo());
		}
		//Imprimimos por consola el DNI y el valor asociado al DNI
		for (Map.Entry<Integer, Double> empleado : empleadosMap.entrySet()){
			System.out.println("DNI: "+empleado.getKey()+"\tSueldo: "+empleado.getValue());
		}





    }
}
