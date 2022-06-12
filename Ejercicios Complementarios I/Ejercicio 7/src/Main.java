import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String palabras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabras = sc.nextLine();
        System.out.println(UpperCase(palabras));

    }
    private static String UpperCase(String string){
        char[] caracteres = string.toCharArray();
        String mayusculas = "";
        for (int i = 0; i < caracteres.length; i++) {
            if((caracteres[i] - 32) >= 65 && (caracteres[i] >= 90))
            {
                mayusculas += (char)(caracteres[i] - 32);

            }else mayusculas += caracteres[i];
        }
        return mayusculas;
    }
}
