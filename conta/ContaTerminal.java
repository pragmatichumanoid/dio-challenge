package projetos.conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.print("Por favor, digite o nuḿero da Agência:");
        int agencia = scanner.nextInt();
        System.out.println("\nDigite o número da conta corrente:");
        long numeroDaConta = scanner.nextLong();
        System.out.print("informe o valor do saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("\"Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", contam " + numeroDaConta + ", e seu saldo no valor de " + saldo
                + " já está disponível para saque\".");

    }
}
