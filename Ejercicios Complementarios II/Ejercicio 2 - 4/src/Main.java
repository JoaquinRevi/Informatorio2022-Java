import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> alumnos;
        alumnos = Arrays.asList("Mateo Martinez","Martin Martinez", "Lucas Alfonzo", "Cristian Rodriguez", "Juan Gomez", "Gabriel Acevedo",
                "Daiana Rey", "Florencia Sanchez","Sara Morales","Sofia Sanchez","Martina Aguilar","Rocio Acevedo");
        List<String> matematicas;
        List<String> programacion;
        List<String> algoritmos;

        //creamos sublistas a partir de la lista alumnos
        matematicas = alumnos.subList(0,4);
        programacion = alumnos.subList(4,8);
        algoritmos = alumnos.subList(8,12);
        //usamos el metodo forEach con una expresion lambda para imprimir los alumnos
        System.out.print("Alumnos del curso de Matematicas: ");
        matematicas.forEach((a) -> System.out.print(a+", "));
        System.out.print("\nAlumnos del curso de Programacion: ");
        programacion.forEach((a) -> System.out.print(a+", "));
        System.out.print("\nAlumnos del curso de Algoritmos: ");
        algoritmos.forEach((a) -> System.out.print(a+", "));
    }
}
