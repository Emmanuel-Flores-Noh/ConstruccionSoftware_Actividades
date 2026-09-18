import java.util.ArrayList;

public class Grupo {
    private final ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private Profesor profesorAsignado = null;

    public Grupo() {

    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void addAlumno(Alumno nuevoAlumno) {
        listaAlumnos.add(nuevoAlumno);
    }

    public Alumno getAlumnoByName(String nombre) throws RuntimeException {
        for(Alumno busquedaActual : listaAlumnos) {
            if( busquedaActual.getNombre().equals(nombre) ) {
                return busquedaActual;
            }
        }

        throw new RuntimeException("El alumno no se ha encontrado en este grupo");
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
}