import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        scanner.close();
    }
}
