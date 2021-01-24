package kononikhin.Service;

import kononikhin.DAO.CustomerDAO;
import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.Customer;
import kononikhin.Entities.RegisteredAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {

        customerDAO.save(customer);

    }

    @Override
    @Transactional
    public Customer getCustomer(int customerId) {
        return customerDAO.getCustomer(customerId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
        customerDAO.deleteCustomer(customerId);
    }

    @Override
    @Transactional
    public List<Customer> searchCustomers(String searchName) {
        return customerDAO.searchCustomers(searchName);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer, RegisteredAddress registeredAddress, ActualAddress actualAddress,Boolean checkbox) {

       customerDAO.save(customer,registeredAddress,actualAddress,checkbox);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer, ActualAddress actualAddress,RegisteredAddress registeredAddress) {
        customerDAO.save(customer,actualAddress,registeredAddress);

    }
}
