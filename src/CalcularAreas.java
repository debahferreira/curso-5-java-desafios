import java.util.Objects;
import java.util.Scanner;

public class CalcularAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int lado = 5;
        double raio = 5;
        String areaQuadrado = "área do quadrado";
        String areaCirculo = "área do círculo";

        System.out.println("Você quer calcular a área do quadrado ou a área do círculo?");
        String resposta = leitura.nextLine();

        if (resposta.equals(areaCirculo)) {
            System.out.println(raio * raio * 3.14);
        } else if (resposta.equals(areaQuadrado)) {
            System.out.println(lado * lado);
        }*/

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

