import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int min = 2;
        int max = 1000;
        int multi = 1;

        if ((num >= min) && (num <= max)) {
            do {
                int tabuada = num * multi;
                System.out.printf("%d X %d = %d%n", num, multi, tabuada);
                multi++;
            } while (multi <= 10);
        }else {
            System.out.printf("O número deve estar entre %d e %d", min, max);
        }
    }
}
