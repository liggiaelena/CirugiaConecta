package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO implements IDao{
    private Connection conn;
    
    public ClienteDAO(){
        conn = new ConnectionFactory().getConnection();
    };
    
    @Override
    public ArrayList<Cliente> consultar() {
        ArrayList<Cliente> lstClientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente;";
        PreparedStatement comando;
        ResultSet resultado;
        try{
            comando = conn.prepareStatement(sql);
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                Cliente cli = new Cliente();
                cli.setId(resultado.getInt("id"));
                cli.setNome(resultado.getString("nome"));
                cli.setNome(resultado.getString("descricao"));
                lstClientes.add(cli);
            }
            return lstClientes;
        }catch(SQLException err){
            throw new RuntimeException(err.getMessage());
        }
    }

    @Override
    public Cliente consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente cadastrar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
