public class Profesor extends Persona {
    private String gradoAcademico;
    private String numeroempleado;

    public Profesor() {

    }

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String gradoAcademico, String numeroempleado) {
        this.setNombre(nombre);
        this.setApellidoPaterno(apellidoPaterno);
        this.setApellidoMaterno(apellidoMaterno);

        this.gradoAcademico = gradoAcademico;
        this.numeroempleado = numeroempleado;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getNumeroEmpleado() {
        return numeroempleado;
    }

    public void setNumeroEmpleado(String numeroempleado) {
        this.numeroempleado = numeroempleado;
    }

    @Override
    public String toString() {
        return "Grado académico: " + getGradoAcademico() + super.toString() + " Numero de empleado: " + getNumeroEmpleado();
    }}
