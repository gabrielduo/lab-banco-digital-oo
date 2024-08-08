
public class Cliente {
    private String nome;
    private String email;  //novo atributo para contato do cliente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {  //getter para o email
        return email;
    }

    public void setEmail(String email) {  //setter para o email
        this.email = email;
    }
}