package CustomerManagerApp;

import java.util.GregorianCalendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCoffeeShop(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Pelin");
		customer.setSurname("Yavuz");
		customer.setIdTcno("3453453453456");
		customer.setBirthday(new GregorianCalendar(1997, 8, 03).getTime());

		customerManager.save(customer);

	}

}
