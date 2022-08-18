import java.util.Scanner;
public class calcularPesoAltura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso em kg: ");
        String p = scanner.next().replace(",", ".");
        double peso = Double.parseDouble(p);

        System.out.println("Informe sua altura em cm: ");
        String alt = scanner.next().replace(",", ".");
        double altura = Double.parseDouble(alt);

        double imc = peso/(altura * altura);

        System.out.printf("Seu IMC é de %.1f: ",imc);

        scanner.close();
    }
}
