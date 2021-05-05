package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.RHKKPSPublicSoap;

import java.time.ZoneId;
import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfReelPerson(Customer customer) {
        RHKKPSPublicSoap client = new RHKKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(customer.nationalityId, customer.firstName.toUpperCase(Locale.ROOT), customer.lastName.toUpperCase(Locale.ROOT), customer.dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
