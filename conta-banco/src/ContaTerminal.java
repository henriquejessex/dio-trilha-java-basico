import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);
        Integer numero = 0;
        String agencia = "";
        String titular = "";
        Double saldo = 0.0;

        try{
        System.out.println("Bem vindo ao banco!");  
        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite a agencia da conta: ");
        agencia = scanner.next();
        System.out.println("Digite o nome do titular da conta: ");
        titular = scanner.next();
        System.out.println("Digite o saldo inicial da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá, " + titular + "!, obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta é " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
        }catch(InputMismatchException e){
            System.out.println("Erro ao criar conta, tente novamente!");
        }

        

    }
}
