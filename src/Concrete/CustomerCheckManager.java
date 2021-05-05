package Concrete;

import Abstract.ICustomerServicie;
import Abstract.IPersonCheckService;
import Entity.Customer;
//
public class CustomerCheckManager implements IPersonCheckService {
//Doðrulamayý yapan sýnýflardan biri
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

	


}
