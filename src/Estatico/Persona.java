package Estatico;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    static int numPersonas;

    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        numPersonas ++;
    }
    static void numeroPersonas(){
        System.out.println("Hay "+numPersonas+ "Personas");
    }
}
