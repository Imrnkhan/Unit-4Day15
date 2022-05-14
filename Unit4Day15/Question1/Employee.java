package Unit4Day15.Question1;

import java.io.Serializable;

public class Employee implements Serializable {
	private String emId;
	private String name;
	Address address;
	private String email;
	private String password;
	public Employee() {
		super();
	}
	public Employee(String emId, String name, Address address, String email) {
		super();
		this.emId = emId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = "anand123";
	}
	public String getEmId() {
		return emId;
	}
	public void setEmId(String emId) {
		this.emId = emId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}