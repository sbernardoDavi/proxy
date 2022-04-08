public class Funcionario {
    private String nome;
    private boolean vendedor;

    public Funcionario(String nome, boolean vendedor) {
        this.nome = nome;
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVendedor() {
        return vendedor;
    }

    public void setVendedor(boolean vendedor){
        this.vendedor = vendedor;
    }
}
