import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Cliente implements  ICliente{

    private Integer cpf;
    private String nome;
    private String cidade;
    private String bairro;

    public Cliente(int cpf){
        this.cpf = cpf;
        Cliente objeto = Sistema.getCliente(cpf);
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Cliente(Integer cpf, String nome, String cidade, String bairro) {
        this.cpf = cpf;
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Integer getCpf(){
        return cpf;
    }

    @Override
    public List<String> obterDados(){
        return Arrays.asList(this.nome, this.cidade, this.bairro);
    }

    @Override
    public Integer obterCpf(Funcionario funcionario){
        return this.cpf;
    }
}

