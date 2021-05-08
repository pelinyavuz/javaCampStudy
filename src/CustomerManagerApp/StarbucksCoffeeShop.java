package CustomerManagerApp;

public class StarbucksCoffeeShop extends BaseCustomerManager {
	public PersonCheckService checkService;

	public StarbucksCoffeeShop(PersonCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.getCheckRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Geçersiz Musteri Bilgileri");
		}

	}
}
