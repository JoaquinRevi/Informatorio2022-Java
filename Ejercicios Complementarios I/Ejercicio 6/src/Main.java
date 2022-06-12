import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num1,num2;
        Scanner sc = new Scanner(System.in);
	    System.out.println("Ingrese el primer valor");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = sc.nextInt();
        System.out.println("Resultado: "+ potenciacion(num1,num2));

    }

    private static int potenciacion(int x, int y) {
        int res = x;
        for (int i = 1; i < y; i++) {
            res = res * x;

        }

        return res;
    }
}
