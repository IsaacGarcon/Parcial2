package Herencia;
import java.util.Scanner;
public class Estudiante extends Persona {
    private int matricula;
    private double calificacion;
    private String licenciatura;
    private int semestre;

    public Estudiante(String nombre, String apellido, int edad, int matricula, double calificacion, String licenciatura, int semestre) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.licenciatura = licenciatura;
        this.semestre = semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public int getSemestre() {
        return semestre;
    }
}