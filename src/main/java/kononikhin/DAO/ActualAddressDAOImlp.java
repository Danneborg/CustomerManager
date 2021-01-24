package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.RegisteredAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActualAddressDAOImlp implements ActualAddressDaO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(ActualAddress actualAddress) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(actualAddress);
    }

    @Override
    public ActualAddress getActualAddress(int addressId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(ActualAddress.class, addressId);
    }
}
