package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) {
        if (customerCheckService.checkIfReelPerson(customer)) {
            super.save(customer);
        }
        else {
            System.out.println("Not a valid person");
        }
    }

}
