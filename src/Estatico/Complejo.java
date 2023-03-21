package Estatico;

public class Complejo {
    private double real;
    private double imaginario;

    // Constructor que permite inicializar un objeto de tipo complejo a partir de dos componentes double
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // Getter y Setter para la parte real del número complejo
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    // Getter y Setter para la parte imaginaria del número complejo
    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    // Método para imprimir de manera formateada un número complejo
    public void imprimir() {
        if (imaginario < 0) {
            System.out.println(real + " - " + Math.abs(imaginario) + "i");
        } else {
            System.out.println(real + " + " + imaginario + "i");
        }
    }

    // Método para agregar un número complejo a otro
    public void agregar(Complejo otro) {
        this.real += otro.getReal();
        this.imaginario += otro.getImaginario();
    }

    // Método sobrecargado para agregar dos componentes double a un número complejo
    public void agregar(double real, double imaginario) {
        this.real += real;
        this.imaginario += imaginario;
    }

    // Método main para probar la clase Complejo
    public static void main(String[] args) {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, -2);

        System.out.print("c1 = ");
        c1.imprimir();

        System.out.print("c2 = ");
        c2.imprimir();

        c1.agregar(c2);

        System.out.print("c1 + c2 = ");
        c1.imprimir();

        c1.agregar(2, 3);

        System.out.print("c1 + (2 + 3i) = ");
        c1.imprimir();
    }
}

