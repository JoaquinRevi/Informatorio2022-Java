import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        //cargamos el ArrayList
        words.add("hello");
        words.add(null);
        words.add("informatory");
        words.add("");
        //filtramos las palabras que sean distintas a null y no contengan string vacios y las imprimimos por consola
        words.stream().filter(word -> word != "" && word != null).forEach(word -> System.out.println(word));

    }
}
