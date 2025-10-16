import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.of("pt","BR"));

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.println("Por favor, digite o número da Conta !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();

        sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + "e seu saldo de " + saldo + " já está disponível para saque");





    }

}
