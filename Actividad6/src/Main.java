import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Profesor crearProfesor(Scanner scanner) {
        Profesor nuevoProfesor = new Profesor();
        System.out.println("Nombre del profesor del grupo:");
        nuevoProfesor.setNombre( scanner.nextLine() );

        System.out.println("Apellido paterno:");
        nuevoProfesor.setApellidoPaterno( scanner.nextLine() );

        System.out.println("Apellido materno:");
        nuevoProfesor.setApellidoMaterno( scanner.nextLine() );

        System.out.println("Grado academico:");
        nuevoProfesor.setGradoAcademico( scanner.nextLine() );

        System.out.println("Numero empleado:");
        nuevoProfesor.setNumeroEmpleado( scanner.nextLine() );
        return nuevoProfesor;
    }

    private static Alumno crearAlumno(Scanner scanner) {
        Alumno nuevoAlumno = new Alumno();

        System.out.println("Nombre del alumno:");
        nuevoAlumno.setNombre( scanner.nextLine() );

        System.out.println("Apellido paterno:");
        nuevoAlumno.setApellidoPaterno( scanner.nextLine() );

        System.out.println("Apellido materno:");
        nuevoAlumno.setApellidoMaterno( scanner.nextLine() );

        System.out.println("Numero de cuenta:");
        nuevoAlumno.setNumeroDeCuenta( scanner.nextLine() );

        return nuevoAlumno;
    }

    private static void buscarAlumno(Scanner scanner, Grupo grupo) {
        System.out.println("Nombre del alumno a buscar:");
        String nombreBuscar = scanner.nextLine();

        try {
            System.out.println( grupo.getAlumnoByName(nombreBuscar) );
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Grupo nuevoGrupo = new Grupo();

        try( Scanner scanner = new Scanner( System.in ) ) {
            {
                Profesor nuevoProfesor = crearProfesor(scanner);
                nuevoGrupo.setProfesorAsignado(nuevoProfesor);
            }

            boolean bucle = true;

            while( bucle ) {
                System.out.println("1) Añadir alumno");
                System.out.println("2) Listar alumnos");
                System.out.println("3) Obtener alumno por nombre");
                System.out.println("4) Ver información del profesor");
                System.out.println("5) salir");

                switch( scanner.nextInt() ) {
                    case 1:
                        scanner.nextLine();
                        Alumno nuevoAlumno = crearAlumno(scanner);
                        nuevoGrupo.addAlumno(nuevoAlumno);
                        break;
                    case 2:
                        scanner.nextLine();
                        ArrayList<Alumno> listaAlumnos = nuevoGrupo.getListaAlumnos();

                        for( Alumno alumno : listaAlumnos ) {
                            System.out.println(alumno);
                        }
                        break;
                    case 3:
                        scanner.nextLine();
                        buscarAlumno(scanner, nuevoGrupo);
                        break;
                    case 4:
                        scanner.nextLine();
                        System.out.println(nuevoGrupo.getProfesorAsignado());
                        break;
                    case 5:
                        bucle = false;
                        break;
                }
            }
        }
    }
}