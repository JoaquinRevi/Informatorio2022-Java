import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc,valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor ");
        valor = sc.nextInt();
        System.out.println("\nSeleccione la opcion: \n1 Opcion Iterativa\n2 Opcion Recursiva");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("\n" + valor + "! = " + factorialIterativo(valor));
                break;
            case 2:
                System.out.println("\n" + valor + "! = " + factorialRecursivo(valor));
                break;
            default:
                System.out.println("el numero ingresado no corresponde a ninguna opcion");
        }


    }

    private static int factorialIterativo(int x) {
        int resultado = x;
        for(int i  = (x-1) ; i > 0; i--){
            resultado = resultado * i;

        }

        return resultado;
    }

    public static int factorialRecursivo(int x){
        if(x == 1){
            return 1;
        }
        else return x*factorialRecursivo(x-1);
    }
}
