package Clases;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    Map<Long,Cliente> clientes=new HashMap();

    public DirectorioTelefonico() {
    }

    public Map<Long, Cliente> getClientes() {
        return clientes;
    }
    
    public boolean agregarCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getTelefono())) {
            return false;
        }else{
            clientes.put(cliente.getTelefono(), cliente);
            return true;
        }
    }

    public boolean buscarCliente(long telefono) {
        if (clientes.containsKey(telefono)) {
            return true;
        }else{
            return false;
        }
    }

    public void buscarTelefono() {
    }

    public void buscarClientes() {
        
    }

    public void borrarCliente(long telefono) {
        clientes.remove(telefono);
    }
}
