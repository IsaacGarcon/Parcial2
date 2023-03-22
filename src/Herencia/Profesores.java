package Herencia;

import java.util.Scanner;

public class Profesores extends Persona {
    private String gradoEstudio;
    private int numEmpleado;
    private String horario;
    private String facultad;

    public Profesores(String nombre, String apellido, int edad, String gradoEstudio, int numEmpleado, String horario, String facultad) {
        super(nombre, apellido, edad);
        this.gradoEstudio = gradoEstudio;
        this.numEmpleado = numEmpleado;
        this.horario = horario;
        this.facultad = facultad;
    }

    public String getGradoEstudio() {
        return gradoEstudio;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public String getHorario() {
        return horario;
    }

    public String getFacultad() {
        return facultad;
    }
}
