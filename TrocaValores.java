import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os valores de A e B
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Imprime os valores antes da troca
        System.out.printf("Antes da troca: A = %d, B = %d%n", a, b);

        // Troca os valores
        int temp = a;
        a = b;
        b = temp;

        // Imprime os valores após a troca
        System.out.printf("Depois da troca: A = %d, B = %d%n", a, b);

        // Fecha o scanner
        scanner.close();
    }
}