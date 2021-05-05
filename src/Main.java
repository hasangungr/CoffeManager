import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Hasan");
		customer.setLastName("Güngör");
		customer.setId(159);
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(customer);

	}

}
