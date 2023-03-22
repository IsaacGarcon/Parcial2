package Herencia;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        boolean seguirAgregando = true;

        while (seguirAgregando) {
            System.out.println("Elija el tipo de persona que desea agregar:");
            System.out.println("1. Estudiante");
            System.out.println("2. Profesor");
            System.out.println("3. Administrativo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante:");
                    System.out.print("Nombre: ");
                    String nombreE = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoE = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadE = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Matricula: ");
                    int matriculaE = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Calificacion: ");
                    double calificacionE = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Licenciatura: ");
                    String licenciaturaE = scanner.nextLine();
                    System.out.print("Semestre: ");
                    int semestreE = scanner.nextInt();
                    scanner.nextLine();

                    Estudiante estudiante = new Estudiante(nombreE, apellidoE, edadE, matriculaE, calificacionE, licenciaturaE, semestreE);
                    personas.add(estudiante);

                    System.out.println("Datos del estudiante:");
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Apellido: " + estudiante.getApellido());
                    System.out.println("Edad: " + estudiante.getEdad());
                    System.out.println("Matricula: " + estudiante.getMatricula());
                    System.out.println("Calificacion: " + estudiante.getCalificacion());
                    System.out.println("Licenciatura: " + estudiante.getLicenciatura());
                    System.out.println("Semestre: " + estudiante.getSemestre());
                    break;

                case 2:
                    System.out.println("Ingrese los datos del profesor:");
                    System.out.print("Nombre: ");
                    String nombreP = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoP = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadP = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Grado de estudio: ");
                    String gradoP = scanner.nextLine();
                    System.out.print("Numero de empleado: ");
                    int numEmpleadoP = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Horario: ");
                    String horarioP = scanner.nextLine();
                    System.out.print("Facultad: ");
                    String facultadP = scanner.nextLine();

                    Profesores profesor = new Profesores(nombreP, apellidoP, edadP, gradoP, numEmpleadoP, horarioP, facultadP);
                    personas.add(profesor);

                    System.out.println("Datos del profesor:");
                    System.out.println("Nombre: " + profesor.getNombre());
                    System.out.println("Apellido: " + profesor.getApellido());
                    System.out.println("Edad: " + profesor.getEdad());
                    System.out.println("Grado de estudio: " + profesor.getGradoEstudio());
                    System.out.println("Numero de empleado: " + profesor.getNumEmpleado());
                    System.out.println("Horario: " + profesor.getHorario());
                    System.out.println("Facultad: " + profesor.getFacultad());
                    break;

                case 3:
                    System.out.println("Ingrese los datos del administrativo:");
                    System.out.print("Nombre: ");
                    String nombreA = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoA = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadA = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Puesto: ");
                    String puestoA = scanner.nextLine();
                    System.out.print("Horario: ");
                    String horarioA = scanner.nextLine();
                    System.out.print("Departamento: ");
                    String departamentoA = scanner.nextLine();

                    Administrativos administrativo = new Administrativos(nombreA, apellidoA, edadA, puestoA, horarioA, departamentoA);
                    personas.add(administrativo);

                    System.out.println("Datos del administrativo:");
                    System.out.println("Nombre: " + administrativo.getNombre());
                    System.out.println("Apellido: " + administrativo.getApellido());
                    System.out.println("Edad: " + administrativo.getEdad());
                    System.out.println("Puesto: " + administrativo.getPuesto());
                    System.out.println("Horario: " + administrativo.getHorario());
                    System.out.println("Departamento: " + administrativo.getDepartamento());
                    break;

                case 4:
                    seguirAgregando = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }
}
