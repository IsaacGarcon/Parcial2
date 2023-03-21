package Estatico;
import java.util.Scanner;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vector3D v) {
        return this.x == v.x && this.y == v.y && this.z == v.z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la componente x del vector 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la componente y del vector 1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese la componente z del vector 1: ");
        double z1 = scanner.nextDouble();

        Vector3D vector1 = new Vector3D(x1, y1, z1);

        System.out.print("Ingrese la componente x del vector 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la componente y del vector 2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Ingrese la componente z del vector 2: ");
        double z2 = scanner.nextDouble();

        Vector3D vector2 = new Vector3D(x2, y2, z2);

        if (vector1.equals(vector2)) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}
