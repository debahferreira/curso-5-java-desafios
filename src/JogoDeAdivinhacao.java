import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int chute;

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente adivinhar o número secreto entre 1 e 100");
            chute = leitura.nextInt();

            if(chute == numeroAleatorio) {
                System.out.println("Parabéns, você adivinhou o número secreto " + numeroAleatorio + ".");
                break;
            } else if (chute < numeroAleatorio){
                System.out.println("O número secreto é maior que " + chute);
                if (i == 4) {
                    System.out.println("Você perdeu!");
                }
            } else {
                System.out.println("O número secreto é menor que " + chute);
                if (i == 4) {
                    System.out.println("Você perdeu!");
                }
            }
        }
    }
}
