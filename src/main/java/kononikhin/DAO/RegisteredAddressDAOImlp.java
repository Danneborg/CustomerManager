package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.RegisteredAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisteredAddressDAOImlp implements RegisteredAddressDaO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(RegisteredAddress registeredAddress) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(registeredAddress);
    }

    @Override
    public RegisteredAddress getRegisteredAddress(int addressId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(RegisteredAddress.class, addressId);
    }
}
