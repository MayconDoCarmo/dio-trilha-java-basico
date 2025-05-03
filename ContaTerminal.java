import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, insira sua agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, insira o seu nome: ");
        String Nome = scanner.nextLine();

        System.out.println("Por favor, insira o seu saldo: ");
        float Saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso branco! Sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de" + Saldo + " já está disponível para saque");






    }
}
