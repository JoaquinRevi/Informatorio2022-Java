import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primero valor");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = sc.nextInt();
        System.out.println("\n"+num1+" + "+num2 + " = " + (num1 + num2) +
                "\n"+num1+" - "+num2 + " = " + (num1 - num2) +
                "\n"+num1+" x "+num2 + " = " + (num1 * num2) +
                "\n"+num1+" / "+num2 + " = " + (num1 / num2) +
                "\n"+num1+" % "+num2 + " = " + (num1 % num2));
    }
}
