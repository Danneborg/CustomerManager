package kononikhin.DAO;

import kononikhin.Entities.ActualAddress;

public interface ActualAddressDaO {

    void save(ActualAddress actualAddress);

    ActualAddress getActualAddress(int actualId);
}
