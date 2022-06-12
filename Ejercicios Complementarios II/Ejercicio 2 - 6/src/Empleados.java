import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private String nombre;
    private String apellido;
    private int DNI;
    private List<Integer> horasTrabajadas = new ArrayList<>();
    private List <Integer> valorPorHora = new ArrayList<>();

    public Empleados(String nombre, String apellido, int DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    //metodo para cargar horas trabajas (por temas de agilización son datos aleatorios)
    public void sethorasTrabajasPorDia(){
        for (int i = 0; i < 5; i++) {
            Double random = Math.random();
            this.horasTrabajadas.add((int)Math.round(random*10));
        }
    }
    //metodo para cargar valor por Hora (por temas de agilización son datos aleatorios)
    public void setvalorPorHora(){
        for (int i = 0; i < 5; i++) {
            Double random = Math.random();
            this.valorPorHora.add((int)Math.round((random*10)*120));
        }
    }
    //metodo para obtener el sueldo respecto a las horas trabajadas y el precio de cada hora
    public double getsueldo(){
        double sum = 0;
        for (int i = 0; i < horasTrabajadas.size(); i++) {
            sum += horasTrabajadas.get(i)*valorPorHora.get(i);
        }
        return sum;
    }
    //Metodo toString
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI=" + DNI +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorPorHora=" + valorPorHora +
                '}';
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
