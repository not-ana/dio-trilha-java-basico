
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nome;
        double saldo;

        //obtendo o nome do cliente
        Scanner reply1 = new Scanner (System.in);
        System.out.println("Digite o nome do cliente: ");
        nome = reply1.nextLine();
        reply1.close();

        //obtendo o número da agência
        Scanner reply2 = new Scanner (System.in);
        System.out.println("Digite o número da agência: ");
        agencia = reply2.nextLine();
        reply2.close();

        //obtendo o número da conta
        System.out.println("Digite o número da conta: ");
        Scanner reply3 = new Scanner (System.in);
        numero = reply3.nextInt();
        reply3.close();

        //obtendo o saldo inicial
        System.out.println("Digite o saldo inicial: ");
        Scanner reply4 = new Scanner (System.in);
        saldo = reply4.nextDouble();
        reply4.close();
        

        //resultado final printado na tela

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ",conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
