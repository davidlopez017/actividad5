import java.util.Scanner;

public class Operaciones {
    public double calcularAreaCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }

    public double calcularAreaCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        return Math.pow(lado, 2);
    }

    public double calcularPerimetroCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        return 4 * lado;
    }

    public double calcularAreaTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        return (base * altura) / 2;
    }

    public double calcularPerimetroTriangulo(Scanner scanner) {
        System.out.println("Ingrese el lado 1 del triángulo:");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el lado 2 del triángulo:");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el lado 3 del triángulo:");
        double lado3 = scanner.nextDouble();
        return lado1 + lado2 + lado3;
    }

    public double calcularAreaRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        return base * altura;
    }

    public double calcularPerimetroRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        return 2 * (base + altura);
    }

    public double calcularAreaPentagono(Scanner scanner) {
        System.out.println("Ingrese el lado del pentágono:");
        double lado = scanner.nextDouble();
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lado, 2);
    }

    public double calcularPerimetroPentagono(Scanner scanner) {
        System.out.println("Ingrese el lado del pentágono:");
        double lado = scanner.nextDouble();
        return 5 * lado;
    }
}
