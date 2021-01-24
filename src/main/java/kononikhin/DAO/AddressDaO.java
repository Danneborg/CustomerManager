package kononikhin.DAO;

import kononikhin.Entities.RegisteredAddress;

public interface AddressDaO {

    void save(RegisteredAddress registeredAddress);

    RegisteredAddress getCustomer(int addressId);
}
