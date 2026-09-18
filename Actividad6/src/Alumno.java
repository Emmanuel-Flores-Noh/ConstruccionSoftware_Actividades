public class Alumno extends Persona {
    private String numeroDeCuenta;

    public Alumno() {

    }

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroDeCuenta) {
        setNombre(nombre);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String toString() {
        return super.toString() + " Numero de cuenta: " + getNumeroDeCuenta();
    }
}