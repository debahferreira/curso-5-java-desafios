public class Formatar {
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "decoração";
        String mensagem = String.format("%s %s da festa de aniversário estava linda!", letra, palavra);
        System.out.println(mensagem);
    }
}
