import java.util.Scanner;

public class equacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        String vlA = scanner.next().replace(",", ".");
        double a = Double.parseDouble(vlA);

        System.out.println("Informe o valor de B: ");
        String vlB = scanner.next().replace(",", ".");
        double b = Double.parseDouble(vlB);

        System.out.println("Informe o valor de C: ");
        String vlC = scanner.next().replace(",", ".");
        double c = Double.parseDouble(vlC);

        System.out.println("*************************************************************");
        System.out.printf("Sua equação do 2° grau é: %.0fx² + %.0f + %.0f = 0 ", a, b, c);

        //Encontrar o valor de DELTA
        double delta = Math.pow(b,2) - (4 * (a * c));

        //Encontrar os valores de X¹ e X²
        double x1 = (-b +(Math.sqrt(delta)))/(2 * a);
        double x2 = (-b -(Math.sqrt(delta)))/(2 * a);

        System.out.printf("\n******* O valor do DELTA é %.1f.", delta);

        System.out.printf("\n******* O valor do X¹ é %.1f.", x1);

        System.out.printf("\n******* O valor do X² é %.1f.", x2);

        System.out.println("\n*************************************************************");
    }
}
