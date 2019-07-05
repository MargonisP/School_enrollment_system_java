package School_Management_System;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121
import tuc.ece.cs111.util.StandardInputRead;
public class Address {

	
	private String street;
	private int streetNumber;
	private String city;
	
	
	public Address(){
		StandardInputRead sir = new StandardInputRead();
		this.street = sir.readString("Give Street");
		this.streetNumber = sir.readPositiveInt("Number");
		this.city = sir.readString("Give city");
	}

	
	public void setStreet(String street){
		this.street = street;
	}
	
	public void setNumber(int streetNumber){
		this.streetNumber = streetNumber;
	}
	
	public void setTown(String city){
		this.city = city;
	}
	
	
	public String getStreet(){
		return this.street;
	}
	
	public int getNumber(){
		return this.streetNumber;
	}
	
	public String getTown(){
		return this.city;
	}
	
	
	public void print(){
		System.out.println("Street = " + street);
		System.out.println("Number = " + streetNumber);
		System.out.println("City = " + city);
	}

	
}
