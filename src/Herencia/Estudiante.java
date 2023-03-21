package Herencia;
import java.util.Scanner;
public class Estudiante extends Persona {
    private int matricula;
    private double calificacion;
    private String licenciatura;
    private int semestre;

    public Estudiante(String nombre, String apellido, int edad, int matricula, double calificacion, String licenciatura, int semestre){
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.licenciatura = licenciatura;
        this.semestre = semestre;
    }


    public static Estudiante agregarDatosAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos del alumno:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Calificación: ");
        double calificacion = sc.nextDouble();
        sc.nextLine();

        System.out.print("Licenciatura: ");
        String licenciatura = sc.nextLine();

        System.out.print("Semestre: ");
        int semestre = sc.nextInt();
        sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, matricula, calificacion, licenciatura, semestre);

        return estudiante;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nMatricula: "+matricula+
                "\nCalificacion: "+calificacion);
    }
}
