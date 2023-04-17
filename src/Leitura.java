import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.printf("Qual o ano de lançamento?: ");
        int anoLancamento = leitura.nextInt();
        System.out.printf("De 0 a 5, como você avalia o filme?: ");
        double avaliacao = leitura.nextDouble();

        System.out.printf("Filme: %s \nAno de Lançamento: %d \nAvaliação: %.1f", filme, anoLancamento, avaliacao);
    }
}
