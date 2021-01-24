package kononikhin.Util;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.RegisteredAddress;
import org.springframework.stereotype.Component;

@Component
public class AdressEqualizer {

    public AdressEqualizer() {
    }

    public ActualAddress equalizeAddress(RegisteredAddress registeredAddress,ActualAddress actualAddress) {


        actualAddress.setContry(registeredAddress.getRegContry());
        actualAddress.setRegion(registeredAddress.getRegRegion());
        actualAddress.setCity(registeredAddress.getRegCity());
        actualAddress.setStreet(registeredAddress.getRegStreet());
        actualAddress.setHouse(registeredAddress.getRegHouse());
        actualAddress.setFlat(registeredAddress.getRegFlat());

        return actualAddress;

    }
}
