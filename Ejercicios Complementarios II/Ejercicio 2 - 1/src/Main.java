import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        List<String> ciudades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //Bucle para mostrar las opciones al usuario
        do {
            System.out.println("¿Que desea hacer?\n1: Cargar ciudad\n2: Mostrar ranking\n\n3: Salir");
            opc = sc.nextInt();
            if(opc == 1){
                String nombreCiudad;
                System.out.println("Ingrese una ciudad");
                nombreCiudad= sc.next();
                //Agregamos la ciudad ingresada en la Lista de ciudades
                ciudades.add(nombreCiudad);
            }else if (opc == 2) mostrarRanking(ciudades);
        }while (opc == 1);

    }
    //Metodo para mostrar el Ranking
    private static void mostrarRanking(List<String> ciudades) {
        for (String ciudad: ciudades) {
            System.out.println("#"+(ciudades.indexOf(ciudad)+1)+" - "+ciudad);
        }
    }


}
