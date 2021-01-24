package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.RegisteredAddress;

public interface RegisteredAddressDaO {

    void save(RegisteredAddress registeredAddress);

    RegisteredAddress getRegisteredAddress(int actualId);
}
