package Concrete;

import Abstract.ICustomerServicie;
import Abstract.IPersonCheckService;
import Entity.Customer;
//
public class CustomerCheckManager implements IPersonCheckService {
//Do�rulamay� yapan s�n�flardan biri
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

	


}
