import java.util.Scanner;
public class conversaoFahrenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informa a temperatura em °C: ");
        int celsius = entrada.nextInt();

        int tempF = (celsius * 9/5) + 32;

        System.out.printf("%d°F = %d°C", celsius, tempF);
    }
}
