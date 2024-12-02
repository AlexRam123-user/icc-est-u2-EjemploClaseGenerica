import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Par<Integer, Double>> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(new Par<>(101, 9.5));
        listaEstudiantes.add(new Par<>(102, 8.7));
        listaEstudiantes.add(new Par<>(103, 7.8));

        System.out.println("Lista de estudiantes y calificaciones:");
        for (Par<Integer, Double> estudiante : listaEstudiantes) {
            System.out.println("ID: " + estudiante.getClave() + " - Calificación: " + estudiante.getValor());
        }

        listaEstudiantes.get(0).setValor(9.8); 
        System.out.println("\nDatos actualizados:");
        listaEstudiantes.forEach(System.out::println);
    
    }
}
