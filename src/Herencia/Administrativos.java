package Herencia;

public class Administrativos extends Persona {
    private String puesto;
    private String horario;
    private String departamento;

    public Administrativos(String nombre, String apellido, int edad, String puesto, String horario, String departamento) {
        super(nombre, apellido, edad);
        this.puesto = puesto;
        this.horario = horario;
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getHorario() {
        return horario;
    }

    public String getDepartamento() {
        return departamento;
    }
}