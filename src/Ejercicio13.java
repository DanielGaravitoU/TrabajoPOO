import java.util.Scanner;

public class Ejercicio13 {
    public Ejercicio13() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor total de la compra: ");
        float valorTotal = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ingrese el color de la bola que le salió: ");
        String color = scanner.nextLine();
        switch (color.toLowerCase()) {
            case "blanco":
                System.out.println("Valor a pagar con descuento (0%): $" + valorTotal);
                break;
            case "verde":
                valorTotal = (float)((double)valorTotal - (double)valorTotal * 0.1);
                System.out.println("Valor a pagar con descuento (10%): $" + valorTotal);
                break;
            case "amarillo":
                valorTotal = (float)((double)valorTotal - (double)valorTotal * (double)0.25F);
                System.out.println("Valor a pagar con descuento (25%): $" + valorTotal);
                break;
            case "azul":
                valorTotal = (float)((double)valorTotal - (double)valorTotal * (double)0.5F);
                System.out.println("Valor a pagar con descuento (50%): $" + valorTotal);
                break;
            case "rojo":
                System.out.println("Valor a pagar con descuento (100%): $0");
                break;
            default:
                System.out.println("El color que ingresaste es inválido.");
        }

        scanner.close();
    }
}