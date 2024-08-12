import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o número da sua agencia: ");
        String numeroDaAgencia = input.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = input.nextInt();

        System.out.println("Seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroDaAgencia + ", conta número " + numeroDaConta + " e o seu saldo: R$" + saldo + " reais, já está dispónivel para saque.");
    }


}
