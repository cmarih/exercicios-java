import java.util.Scanner;
public class conversaoCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informa a temperatura em °F: ");
        int tempF = entrada.nextInt();

        int celsius = (tempF - 32) * 5/9;

        System.out.printf("%d°F = %d°C", tempF, celsius);
    }
}
