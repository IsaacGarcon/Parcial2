package Herencia;

public class Administrativos extends Persona{

    private String Puesto;
    private String Horario;
    private String Departamento;

    public Administrativos (String nombre, String apellido, int edad, String Puesto, String Horario, String Departamento){
        super(nombre, apellido, edad);
        this.Puesto = Puesto;
        this.Horario = Horario;
        this.Departamento = Departamento;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nPuesto de trabajo: " + Puesto +
                "\nHorario laboral: " + Horario +
                "\nDepartamento: " + Departamento );
    }
}
