import java.util.InputMismatchException;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        try {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Seu nome completo: " + nome + sobrenome + ", sua idade: " + idade + " anos, e sua altura:" +
                " " + altura);

        } catch (InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser númericos!");
        }
    }
}
