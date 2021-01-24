package kononikhin.Service;

import kononikhin.DAO.ActualAddressDaO;
import kononikhin.Entities.ActualAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ActualAddressImpl implements ActualAddressService{

    @Autowired
    ActualAddressDaO actualAddressDaO;

    @Override
    @Transactional
    public ActualAddress getActualAddress(int addressId) {
        return actualAddressDaO.getActualAddress(addressId);
    }
}
