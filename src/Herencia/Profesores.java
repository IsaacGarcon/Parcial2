package Herencia;

import java.util.Scanner;

public class Profesores extends Persona{
    private String Grado_estudio;
    private int Nempleado;
    private String Horario;
    private String facultad;

    public Profesores(String nombre, String apellido, int edad, String Grado_estudio, int Nempleado, String Horario, String facultad){
        super(nombre, apellido, edad);
        this.Grado_estudio = Grado_estudio;
        this.Nempleado = Nempleado;
        this.Horario = Horario;
        this.facultad = facultad;
    }

    public static Profesores agregarDatosProfesores() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos del profesor:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Grado de estudio: ");
        String Grado_estudio = sc.nextLine();

        System.out.print("Numero de empleado: ");
        int Nempleado = sc.nextInt();
        sc.nextLine();

        System.out.print("Horario de trabajo: ");
        String Horario = sc.nextLine();

        System.out.print("Facultad: ");
        String facultad = sc.nextLine();
        sc.nextLine();

        Profesores profesores  = new Profesores(nombre, apellido, edad, Grado_estudio, Nempleado, Horario, facultad);

        return profesores;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nGrado de estudio: " + Grado_estudio +
                "\nNumero de empleado: " + Nempleado +
                "\nHorario: " + Horario +
                "\nFacultad: " + facultad);
    }
}
