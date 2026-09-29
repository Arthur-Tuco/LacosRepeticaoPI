import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número ímpar: ");
        int impar = scanner.nextInt();

        if (impar % 2 != 0) {
            System.out.printf("Os números ímpares de 1 até %d são:%n", impar);
            for (int i = 1; i <= impar; i += 2) {
                System.out.print(i + " ");
            }

        } else {
            System.out.println("O número deve ser ímpar");
        }
    }
}
