import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        String saldoStr = scanner.nextLine();
        double saldo = Double.parseDouble(saldoStr);

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agencia: " + agencia + ", conta: " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

        scanner.close();
    }
}
