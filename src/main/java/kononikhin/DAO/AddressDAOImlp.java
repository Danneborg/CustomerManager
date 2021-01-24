package kononikhin.DAO;

import kononikhin.Entities.RegisteredAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressDAOImlp implements AddressDaO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(RegisteredAddress registeredAddress) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(registeredAddress);
    }

    @Override
    public RegisteredAddress getCustomer(int addressId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(RegisteredAddress.class, addressId);    }
}
