import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Alumno> alumnosList = new ArrayList<>();
        Alumno alumno1 = new Alumno("Martin", "Martinez", LocalDate.parse("2000-12-27"));
        Alumno alumno2 = new Alumno("Robin", "Anderson", LocalDate.parse("2002-03-22"));
        Alumno alumno3 = new Alumno("Pepe", "Argento", LocalDate.parse("2003-11-02"));
        Alumno alumno4 = new Alumno("Gloria", "Sanchez", LocalDate.parse("2004-07-23"));
        Alumno alumno5 = new Alumno("Karen", "Sosichi", LocalDate.parse("2008-08-21"));
        alumnosList.add(alumno1);
        alumnosList.add(alumno2);
        alumnosList.add(alumno3);
        alumnosList.add(alumno4);
        alumnosList.add(alumno5);
        Map<String, Integer> alumnosMap = new HashMap<String, Integer>();
        alumnosMap.put(alumno1.getNombreyApellido(), alumno1.getEdad());
        System.out.println(alumnosMap);
    }
}
