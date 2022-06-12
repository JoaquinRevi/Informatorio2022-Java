import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreyapellido,ciudad, direccion;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        nombreyapellido = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese su direccion: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese su Ciudad: ");
        ciudad = sc.nextLine();
        System.out.println(ciudad+ " - " + direccion + " - " + edad + " - " + nombreyapellido);


    }
}
