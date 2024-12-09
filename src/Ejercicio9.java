import java.util.Scanner;

public class Ejercicio9 {
    public Ejercicio9() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        float numeroA = scanner.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        float numeroB = scanner.nextFloat();
        if (numeroA > numeroB) {
            System.out.println(numeroA + " es mayor que " + numeroB);
        } else if (numeroA < numeroB) {
            System.out.println(numeroA + " es menor que " + numeroB);
        } else {
            System.out.println(numeroA + " es igual a " + numeroB);
        }

        scanner.close();
    }
}