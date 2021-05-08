package CustomerManagerApp;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean getCheckRealPerson(Customer customer) {

		return true;
	}

}
