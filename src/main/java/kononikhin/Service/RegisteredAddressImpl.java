package kononikhin.Service;

import kononikhin.DAO.ActualAddressDaO;
import kononikhin.DAO.RegisteredAddressDaO;
import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.RegisteredAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisteredAddressImpl implements RegisteredAddressService {

    @Autowired
    RegisteredAddressDaO registeredAddressDaO;

    @Override
    @Transactional
    public RegisteredAddress getRegisteredAddress(int addressId) {
        return registeredAddressDaO.getRegisteredAddress(addressId);
    }
}
