import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int contador = 3;

        while (contador > 0) {
            System.out.printf("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            contador--;
        }

        System.out.printf("Media de avaliações: %.1f", mediaAvaliacao/3);
    }
}
