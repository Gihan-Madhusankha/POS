package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.CrudDAO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<Customer, String> {
    public ArrayList<CustomerDTO> getAllCustomersFromAddress(String address) throws SQLException, ClassNotFoundException;
}
