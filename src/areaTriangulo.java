import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da base de um triângulo: ");
        String vlBase = scanner.next().replace(",", ".");
        double base = Double.parseDouble(vlBase);

        System.out.println("Informe o valor da altura de um triângulo: ");
        String vlAltura = scanner.next().replace(",", ".");
        double altura = Double.parseDouble(vlAltura);

        double areaCubo = base * altura / 2;

        System.out.printf("A area calculada do triângulo é %.1f.",areaCubo);

        scanner.close();
    }
}
