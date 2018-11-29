package br.com.abc.core.polimorfismo.teste;

import br.com.abc.core.polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.core.polimorfismo.classes.DatabaseDAO;
import br.com.abc.core.polimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAO();
        arquivoDAO.save();
    }
}
