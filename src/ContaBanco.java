import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    // Construtor
    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Métodos getters para os atributos
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira os dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpe o buffer do teclado

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Crie uma instância da classe ContaBanco com os dados inseridos pelo usuário
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        // Exiba a mensagem com os dados da conta
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() +
                " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        // Feche o scanner
        scanner.close();
    }
}
