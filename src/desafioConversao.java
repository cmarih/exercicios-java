import java.util.Scanner;
 class desafioConversao {
    public static void main(String[] args) {
        //mecanismo de entrada com 3 Strings
        Scanner salario = new Scanner(System.in);

        System.out.print("Informe o 1° Sálario: ");
        String salarioOne = salario.next().replace(",", ".");
        double one = Double.parseDouble(salarioOne);

        System.out.print("Informe o 2° Sálario: ");
        String salarioTwo = salario.next().replace(",", ".");
        double two = Double.parseDouble(salarioTwo);

        System.out.print("Informe o 3° Sálario: ");
        String salarioTree = salario.next().replace(",", ".");
        double tree = Double.parseDouble(salarioTree);

        double mediaSalario = (one + two + tree) / 3;
        System.out.println("A média salárial é de: " + mediaSalario);

        salario.close();

    }
}
