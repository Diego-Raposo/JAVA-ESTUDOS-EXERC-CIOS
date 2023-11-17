/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor
de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro
a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo
negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

package org.example;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta = new Conta();
        System.out.print("Enter account number: ");
        int numberConta = sc.nextInt();
        System.out.print("\nEnter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("\nIs there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y') {
            System.out.print("\nEnter initial deposit value: ");
            double depositInitial = sc.nextDouble();
            conta = new Conta(numberConta, name, depositInitial);
        }else if(response == 'n'){
            conta = new Conta(numberConta, name);

        }



        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        System.out.print("\nEnter a deposit value: ");
        double value = sc.nextDouble();
        conta.DepositaValor(value);
        System.out.print("\nUpdated account data: " + conta);
        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        conta.SaqueValor(value);
        System.out.print("\nUpdated account data: " + conta);





        sc.close();

    }

}
