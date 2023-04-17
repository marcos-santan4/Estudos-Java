public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Media calculada pelas 3 notas de Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse = """
                Filme: Top Gun: Maverick
                Filme de aventura com galã dos anos 80;
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // == não compara strings, apenas verifica se ambas possuem a mesma posição na string

        int classificacao = (int) (media / 2); // casting -> converte a operação a frente para o tipo de variavel solicitado.
        System.out.println(classificacao);
    }
}