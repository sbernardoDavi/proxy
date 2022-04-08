import java.util.List;

public class ClienteProxy implements ICliente{
    private Cliente cliente;
    private Integer cpf;

    public ClienteProxy(Integer cpf){
        this.cpf = cpf;
    }



    @Override
    public List<String> obterDados(){
        if(this.cliente == null){
            this.cliente = new Cliente(this.cpf);
        }
        return this.cliente.obterDados();
    }

    @Override
    public Integer obterCpf(Funcionario funcionario){
        if(!funcionario.isVendedor()){
            throw new IllegalArgumentException("Funcionário não autorizado!");
        }
        if(this.cliente == null){
            this.cliente = new Cliente(this.cpf);
        }
        return this.cliente.obterCpf(funcionario);
    }

}
