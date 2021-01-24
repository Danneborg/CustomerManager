package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.Customer;
import kononikhin.Entities.RegisteredAddress;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void save(Customer customer);

    Customer getCustomer(int customerId);

    void deleteCustomer(int customerId);

    List<Customer> searchCustomers(String searchName);

    void save(Customer customer, RegisteredAddress registeredAddress, ActualAddress actualAddress, Boolean checkbox);
}
