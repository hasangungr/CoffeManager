package Abstract;

import Entity.Customer;
//Ekleme i�ini yapan s�n�f
public abstract class BaseCustomerManager implements ICustomerServicie{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi: "+customer.getFirstName());
		
	}

}
