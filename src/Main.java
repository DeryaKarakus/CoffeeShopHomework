import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new StarbucksCustomerManager((CustomerCheckService) new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Derya","Karakuş","10000000000",new GregorianCalendar(1999,3,15)));







    }
}
