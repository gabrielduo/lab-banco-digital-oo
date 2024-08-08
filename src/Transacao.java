
import java.util.Date;

public class Transacao {
    private Date data;
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.data = new Date();  //captura a data e hora atual
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getDetalhes() {
        return String.format("%s - %s - %.2f", data.toString(), tipo, valor);
    }
}