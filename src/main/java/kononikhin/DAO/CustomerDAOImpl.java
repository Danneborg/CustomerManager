package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.Customer;
import kononikhin.Entities.RegisteredAddress;
import kononikhin.Util.AdressEqualizer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    AdressEqualizer adressEqualizer;

    @Autowired
    RegisteredAddressDaO registeredAddressDaO;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        Query<Customer> query = session.createQuery("from Customer order by firstName,lastName", Customer.class);

        return query.list();
    }

    @Override
    public void save(Customer customer) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(customer);

    }

    @Override
    public Customer getCustomer(int customerId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Customer.class, customerId);
    }

    @Override
    public void deleteCustomer(int customerId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete  from Customer where id=:customerId");

        query.setParameter("customerId", customerId);

        query.executeUpdate();
    }

    @Override
    public List<Customer> searchCustomers(String searchName) {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        Query query = null;

        // only search by name if theSearchName is not empty
        if (searchName != null && searchName.trim().length() > 0) {

            // search for firstName or lastName
            query = currentSession.createQuery("from Customer where lower(firstName) like :name or lower(lastName) like :name", Customer.class);
            query.setParameter("name", "%" + searchName.toLowerCase() + "%");

        } else {
            // theSearchName is empty
            query = currentSession.createQuery("from Customer", Customer.class);
        }

        // execute query and get result list
        List<Customer> customers = query.getResultList();

        // return the results
        return customers;
    }

    @Override
    public void save(Customer customer, RegisteredAddress registeredAddress, ActualAddress actualAddress, Boolean checkbox) {

        if (checkbox) {
            actualAddress = adressEqualizer.equalizeAddress(registeredAddress, actualAddress);
        }
        Session session = sessionFactory.getCurrentSession();

        customer.setRegisteredAddress(registeredAddress);
        customer.setActualAddress(actualAddress);
        session.persist(customer);
    }

    @Override
    public void save(Customer customer, ActualAddress actualAddress,RegisteredAddress registeredAddress) {

        Session session = sessionFactory.getCurrentSession();


//        RegisteredAddress registeredAddress = registeredAddressDaO.getRegisteredAddress(tempCustomer.getRegisteredAddress().getRegId());

//        customer.setActualAddress(actualAddress);

//        customer.setRegisteredAddress(registeredAddress);

        System.out.println(registeredAddress);
        System.out.println(actualAddress);
        System.out.println(customer);

        session.save(customer);
//        session.saveOrUpdate(actualAddress);

//        session.persist(customer);
    }
}
