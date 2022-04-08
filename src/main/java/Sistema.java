import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private static Map<Integer, Cliente> clientes = new HashMap<>();

    public static Cliente getCliente(Integer cpf){
        return clientes.get(cpf);
    }

    public static void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

}
