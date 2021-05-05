package Abstract;

import Entity.Customer;
//Doðrulama iþlerini tutan interface
public interface IPersonCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
