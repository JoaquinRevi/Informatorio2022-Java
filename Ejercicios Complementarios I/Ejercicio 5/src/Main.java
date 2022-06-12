import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num1,num2;
	    int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = sc.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + multiplicacion(num1,num2));

    }
    public static int multiplicacion(int x, int y){
        int res  = 0;
        for(int i = 0; i < y; i++){
            res = res + x;

        }
        return res;
    }
}
