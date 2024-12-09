import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos el valor del lado del triangulo
        System.out.print("Ingrese el valor del lado: ");
        float lado= scanner.nextFloat();

        //Calculamos el Area
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        //Calculamos el perimetro
        double perimetro = (3*lado);

        // Calculamos la altura
        double altura = (Math.sqrt(3) / 2) * lado;

        System.out.println("El Area del triangulo es: "+ area);
        System.out.println("El perimetro del triangulo es: "+ perimetro);
        System.out.println("La altura del triangulo es: "+ altura);

        scanner.close();
    }
}
