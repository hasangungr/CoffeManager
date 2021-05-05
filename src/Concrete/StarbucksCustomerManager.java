package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entity.Customer;
//Starbucksýn iþlerini tutan sýnýf
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	IPersonCheckService _person;
	
	public StarbucksCustomerManager(IPersonCheckService _person) {
		
		this._person = _person;
	}
	@Override
	public void save(Customer customer) {
		
		if(_person.CheckIfRealPerson(customer)) {
			System.out.println("Kayýt Yapýldý: "+customer.getFirstName());
		}
		else {
			System.out.println("Kimlik Doðrulama Hatasý");
		}
		
	}
	

	
}
