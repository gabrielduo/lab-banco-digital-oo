
public class ContaPoupanca extends Conta {
    private double taxaJuros;  //novo atributo para taxa de juros

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    //método para aplicar rendimento baseado na taxa de juros
    public void aplicarRendimento() {
        double rendimento = saldo * taxaJuros;
        depositar(rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Rendimento: %.2f", saldo * taxaJuros));
    }
}