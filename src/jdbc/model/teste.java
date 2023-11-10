package jdbc.model;

import jdbc.dao.ClienteDAO;

public class teste {
    public static void main(String[] args) throws ClassNotFoundException  {
          Class.forName("com.mysql.jdbc.Driver");
        ClienteDAO cDao = new ClienteDAO();
        for(Cliente c: cDao.consultar()){
            System.out.println(c.getId());
            System.out.println(c.getNome());
        }
    }
}
