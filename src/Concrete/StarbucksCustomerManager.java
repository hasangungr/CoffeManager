package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entity.Customer;
//Starbucks�n i�lerini tutan s�n�f
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	IPersonCheckService _person;
	
	public StarbucksCustomerManager(IPersonCheckService _person) {
		
		this._person = _person;
	}
	@Override
	public void save(Customer customer) {
		
		if(_person.CheckIfRealPerson(customer)) {
			System.out.println("Kay�t Yap�ld�: "+customer.getFirstName());
		}
		else {
			System.out.println("Kimlik Do�rulama Hatas�");
		}
		
	}
	

	
}
