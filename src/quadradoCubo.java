import java.util.Scanner;

public class quadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        String num = scanner.next().replace(",", ".");
        double numero = Double.parseDouble(num);

//        double quadrado = numero * numero;
//        double cubo = numero * numero * numero;

        //Utilizando Math para elevar o numero a potência.
        double quadrado = Math.pow(numero,2);
        double cubo = Math.pow(numero,3);

        System.out.printf("o valor %.1f ao qudrado é %.1f, e elevado ao cubo é %.1f.",numero, quadrado, cubo);

        scanner.close();
    }
}
