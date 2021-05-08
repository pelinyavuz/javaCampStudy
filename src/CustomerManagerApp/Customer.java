package CustomerManagerApp;

import java.util.Date;

public class Customer{

	public int id;
	public String name;
	public String surname;
	public String idTcno;
	public Date Birthday;

	public Customer() {

	}

	public Customer(int id, String name, String surname, String idTcno, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.idTcno = idTcno;
		Birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdTcno() {
		return idTcno;
	}

	public void setIdTcno(String idTcno) {
		this.idTcno = idTcno;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date date) {
		Birthday = date;
	}

}
