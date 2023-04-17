import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("-----Jodo da Adivinhação-----");
        System.out.println("-----------------------------");

        System.out.println("Você tem 5 tentativas!");
        int random = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);
        int tentativas = 5;
        while (tentativas > 0) {
            System.out.printf("Digite um numero: ");
            int numeroUsuario = sc.nextInt();
                if (numeroUsuario == random) {
                    System.out.println("Voce acertou, parabens!");
                    break;
                } else {
                    System.out.println("Voce errou, tente novamente");
                    tentativas--;
                    if (numeroUsuario > random) {
                        System.out.println("Seu numero é maior que o numero secreto");
                    } else {
                        System.out.println("Seu numero é menor que o numero secreto");
                    }
                }

                if (tentativas == 0) {
                    System.out.println("Suas tentativas acabaram, fim de jogo!");
                    break;
                }
        }
    }
}
