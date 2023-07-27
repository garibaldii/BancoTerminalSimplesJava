import java.util.Scanner;

public class BancoTerminal {
    // Crie o programa chamado BancoTerminal.java para implementar o algorítmo
    // conforme abaixo:

    // O programa deverá simular uma operação de saque onde:

    // Terá uma variável denominada saldo do tipo double contendo o valor inicial
    // igual a 25;

    // Terá uma variável denominada de valor solicitado do tipo double contendo o
    // valor inicial igual a 18;

    // Criar uma expressão relacional para que caso o saldo seja maior que o valor
    // solicitado, o saldo recebe o novo valor como saldo é igual saldo menos o
    // valor solicitado. Caso o saldo seja menor que o valor solicitado, devemos
    // exibir a mensagem "Saldo insuficiente";

    // Imprima o valor do saldo;

    // Em seguida, realize a mesma execução do programana agora com os valores saldo
    // igual a 15 e valor solicitado igual a 22 e exiba o resultado;

    double saldo = 25;


    public void sacar(double valorSolicitado) {
        if (saldo > valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }



    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        BancoTerminal OperacaoSaque = new BancoTerminal();

        System.out.println("Quanto deseja sacar: ");
        
        int operacao1 = input.nextInt();


        OperacaoSaque.sacar(operacao1);

    



        
        
    }
}
