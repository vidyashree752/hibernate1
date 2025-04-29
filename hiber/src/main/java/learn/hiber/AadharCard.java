package learn.hiber;

import jakarta.persistence.*;

@Entity
public class AadharCard {
	@Id
	int aadnum;
	String name;
	String address;
	String gender;
	@OneToOne
	person person;
	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AadharCard(int aadnum, String name, String address, String gender, learn.hiber.person person) {
		super();
		this.aadnum = aadnum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}
	public int getAadnum() {
		return aadnum;
	}
	public void setAadnum(int aadnum) {
		this.aadnum = aadnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AadharCard [aadnum=" + aadnum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", person=" + person + "]";
	}
	
	
	
}
