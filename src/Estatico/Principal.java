package Estatico;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("1. Agregar otra persona");
            System.out.println("2. No agregar más personas");
            System.out.println("3. Imprimir los nombres");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    personas.add(new Persona(nombre, apellido, edad));
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 2);
        Persona.numeroPersonas();
    }
}
