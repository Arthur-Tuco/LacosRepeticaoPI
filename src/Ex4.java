import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorRepeticoes = 0;
        int quantidadePositivos = 0;
        double somaPositivos = 0.0;

        System.out.println("Digite 6 valores (podem ser positivos ou negativos):");

        while (contadorRepeticoes < 6) {
            System.out.printf("Digite o %dº valor: ", contadorRepeticoes + 1);
            double valor = scanner.nextDouble();

            if (valor > 0) {
                somaPositivos += valor;
                quantidadePositivos++;
            }

            contadorRepeticoes++;
        }

        System.out.printf("1. Soma dos valores positivos: %.2f%n", somaPositivos);
        System.out.printf("2. Quantidade de valores positivos: %d%n", quantidadePositivos);

        if (quantidadePositivos > 0) {
            double mediaPositivos = somaPositivos / quantidadePositivos;
            System.out.printf("3. Média dos valores positivos: %.2f%n", mediaPositivos);
        } else {
            System.out.println("3. Média dos valores positivos: Impossível calcular (nenhum número positivo foi digitado).");
        }
    }
}