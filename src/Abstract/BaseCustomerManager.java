package Abstract;

import Entity.Customer;
//Ekleme iþini yapan sýnýf
public abstract class BaseCustomerManager implements ICustomerServicie{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi: "+customer.getFirstName());
		
	}

}
