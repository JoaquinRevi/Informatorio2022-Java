import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> barajaFrancesa = new ArrayList<>();
        //Agregamos los valores a la Lista barajaFrancesa
        barajaFrancesa = Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
        System.out.println("Lista original: "+ barajaFrancesa);
        //Revertimos la lista
        Collections.reverse(barajaFrancesa); 
        System.out.println("Lista invertida: " + barajaFrancesa);
        //Mezclamos la lista
        Collections.shuffle(barajaFrancesa);
        System.out.println("Lista mezclada: " + barajaFrancesa);




    }
}
