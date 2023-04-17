public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2023) {
            System.out.println("Filmes Lançamentos");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }




    }
}
