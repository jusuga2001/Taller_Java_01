import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso> listaCursos;

    public GestionCurso(){
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Scanner objScan){
        System.out.println("Ingrese el nombre del nuevo curso: ");
        String nombre = objScan.next();

        System.out.println("Ingrese el codigo del nuevo curso: ");
        String codigo = objScan.next();

        //validamos que el codigo del curso sea unico
        if (this.buscarCursoPorCodigo(codigo) != null) {
            System.out.println("\nYa existe un curso con este codigo");
        }else {
            Curso objCurso = new Curso(codigo,nombre);
            if (this.listaCursos.add(objCurso)){
                System.out.println("Curso agregado correctamente.");
            }else {
                System.out.println("no se pudo agregar el curso.");
            }
        }

    }

    public void listarTodosLosCursos(){
        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        }else {
            for (Curso iterador : this.listaCursos) {
                System.out.println(iterador.toString());
            }
        }
    }

    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for (Curso temporal: this.listaCursos){
            if (temporal.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temporal;
            }
        }
        return null;
    }
}
