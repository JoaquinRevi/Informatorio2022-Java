import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        //cargamos el array
        palabras.add("Batman");
        palabras.add("Aquaman");
        palabras.add("Flash");
        palabras.add("Batgirl");
        palabras.add("Wonder Woman");
        palabras.add("brainiac");
        //filtramos el array por las palabras que empiecen con b y contamos las incidencias
        System.out.println(palabras.stream().filter(x -> x.toLowerCase().startsWith("b")).count());
    }
}
