import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;

        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        numero = sc.nextInt();


        for (int i = 1; i <= numero; i++){
            resultado = resultado + i + " ";
            System.out.print(resultado + "\n");

        }
    }
}
