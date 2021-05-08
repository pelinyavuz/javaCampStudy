package CustomerManagerApp;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean getCheckRealPerson(Customer customer) {

		//KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;

//		try {
//			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getIdTcno()),
//					customer.getName().toUpperCase(), customer.getName().toUpperCase(),
//					customer.getBirthday().getYear());
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
		return result;

	}

}
