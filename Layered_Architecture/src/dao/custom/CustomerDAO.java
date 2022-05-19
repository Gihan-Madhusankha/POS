package dao.custom;

import dao.CrudDAO;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO, String> {
    public ArrayList<CustomerDTO> getAllCustomersFromAddress(String address) throws SQLException, ClassNotFoundException;
}
