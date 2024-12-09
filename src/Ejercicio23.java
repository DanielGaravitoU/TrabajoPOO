import java.util.Scanner;

public class Ejercicio23 {
    public Ejercicio23() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número (coeficiente a): ");
        float numeroA = scanner.nextFloat();
        System.out.print("Ingrese el segundo número (coeficiente b): ");
        float numeroB = scanner.nextFloat();
        System.out.print("Ingrese el tercer número (coeficiente c): ");
        float numeroC = scanner.nextFloat();
        float valorRaiz = (float)(Math.pow((double)numeroB, (double)2.0F) - (double)(4.0F * numeroA * numeroC));
        if (valorRaiz < 0.0F) {
            System.out.println("La ecuación no tiene solucion.");
        } else {
            double raizDiscriminante = Math.sqrt((double)valorRaiz);
            double x1 = ((double)(-numeroB) + raizDiscriminante) / (double)(2.0F * numeroA);
            double x2 = ((double)(-numeroB) - raizDiscriminante) / (double)(2.0F * numeroA);
            System.out.println("Las soluciones de la ecuación cuadrática son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}

