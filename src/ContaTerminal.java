import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.of("pt", "BR"));

        System.out.println("Por favor, digite qual é a sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, informe qual será o saldo inicial que será depositado na sua conta: ");
        double saldo = Double.parseDouble(scanner.nextLine().replace(",","."));

        String saida = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                              .concat(agencia).concat(", conta ") + numero + " e seu saldo R$"+ saldo + " já está disponível para saque!";
        System.out.println(saida);

        scanner.close();
    }
}
