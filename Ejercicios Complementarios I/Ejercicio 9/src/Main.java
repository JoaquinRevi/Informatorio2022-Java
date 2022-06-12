import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String texto;
	    char letra;
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        texto = sc.nextLine();
        System.out.print("Ingrese la letra que desea buscar: ");
        letra = sc.next().charAt(0);
	    int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(letra == texto.charAt(i)){
                cont++;
            }
        }
        System.out.println("El numero de veces que aparece la letra "+letra+" es: "+cont);

    }
}
