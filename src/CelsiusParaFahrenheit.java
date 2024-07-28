public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        double celsius = 10;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em Celsius é %.2f e a temperatura convertida para Farenheit é %.2f", celsius, fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteiro = (int) fahrenheit;
        System.out.println(fahrenheitInteiro);
    }
}
