import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteProxyTest {

    @BeforeEach
    void setUp(){
        Sistema.adicionarCliente(new Cliente(123,"Davi", "Vassouras", "Barão"));
        Sistema.adicionarCliente(new Cliente(321,"Pedro", "Valença", "Centro"));
    }

    @Test
    public void deveRetornarDadosCliente(){
        ClienteProxy cliente = new ClienteProxy(123);

        assertEquals(Arrays.asList("Davi", "Vassouras", "Barão"), cliente.obterDados());
    }

    @Test
    public void deveRetornarCpfCliente(){
        Funcionario funcionario = new Funcionario("Ana", true);
        ClienteProxy cliente = new ClienteProxy(321);

        assertEquals(321, cliente.obterCpf(funcionario));
    }

    @Test

    public void deveRetornarExcecaoFuncionarioNaoAutorizadoConsultarCp(){
        try{
            Funcionario funcionario = new Funcionario("Anna", false);
            ClienteProxy cliente = new ClienteProxy(123);

            cliente.obterCpf(funcionario);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Funcionário não autorizado!", e.getMessage());
        }
    }

}