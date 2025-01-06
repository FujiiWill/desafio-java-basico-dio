import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Por favor, informe os seguintes dados:");
        System.out.println("Número da conta bancária!");
        Numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Número da Agência!");
        Agencia = sc.nextLine();
        System.out.println("Seu nome completo!");
        NomeCliente = sc.nextLine();
        System.out.println("Informe o valor do primeiro depósito!");
        Saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", NomeCliente, Agencia, Numero, Saldo);


        sc.close();
    }
}
