public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 99.90;
        double percentualDesconto = 10;
        double precoComDesconto = (100 - percentualDesconto)/100 * precoOriginal;
        String mensagem = String.format("O novo preço com desconto é de %.2f reais.", precoComDesconto);
        System.out.println(mensagem);
    }
}
