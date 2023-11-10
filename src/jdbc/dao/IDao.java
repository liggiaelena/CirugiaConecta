package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;

public interface IDao {
    public ArrayList<Cliente> consultar();
    public Cliente consultar(int id);
    public Cliente cadastrar(Cliente cliente);
    public boolean excluir(int id);
}
