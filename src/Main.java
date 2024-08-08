
public class Main {

    public static void main(String[] args) {
        
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setEmail("venilton@example.com");
        
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setEmail("maria@example.com");

        // Criação de contas para Venilton e Maria
        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton, 0.05); // 5% de taxa de juros

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria, 0.03); // 3% de taxa de juros

        //operações na conta de Venilton
        ccVenilton.depositar(100);
        ccVenilton.transferir(50, poupancaVenilton);
        ((ContaPoupanca)poupancaVenilton).aplicarRendimento(); // aplica rendimento

        //operações na conta de Maria
        ccMaria.depositar(200);
        ccMaria.transferir(100, poupancaMaria);
        ((ContaPoupanca)poupancaMaria).aplicarRendimento(); // aplica rendimento

        //imprimir extratos de Venilton
        System.out.println("Extratos de Venilton:");
        ccVenilton.imprimirExtrato();
        poupancaVenilton.imprimirExtrato();

        //imprimir extratos da Maria
        System.out.println("\nExtratos de Maria:");
        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
    }

}
