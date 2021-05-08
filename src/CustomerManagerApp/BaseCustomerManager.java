package CustomerManagerApp;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Müşteri başarıyla kaydedildi." + customer.getName() + " " + customer.getSurname());
		
	}

}
