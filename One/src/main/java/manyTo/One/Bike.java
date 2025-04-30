package manyTo.One;

import jakarta.persistence.*;

@Entity
public class Bike {
	@Id
	int modelnum;
	String brand;
	int price;
	@ManyToOne
	person person;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int modelnum, String brand, int price, manyTo.One.person person) {
		super();
		this.modelnum = modelnum;
		this.brand = brand;
		this.price = price;
		this.person = person;
	}
	public int getModelnum() {
		return modelnum;
	}
	public void setModelnum(int modelnum) {
		this.modelnum = modelnum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Bike [modelnum=" + modelnum + ", brand=" + brand + ", price=" + price + ", person=" + person + "]";
	}
	
}
