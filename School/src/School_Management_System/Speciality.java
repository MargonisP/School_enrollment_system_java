package School_Management_System;
//Panagiotis Georgios Margonis 

import tuc.ece.cs111.util.StandardInputRead;

public class Speciality {
	private String specialityName;
	private String specialityDivision;
	private int specialityCode;
	
	public Speciality(String specialityName,String specialityDivision,int specialityCode){
		
		this.specialityName = specialityName;
		this.specialityDivision = specialityDivision;
		this.specialityCode= specialityCode ;
		
	
	}
	
	
	public Speciality() {
		StandardInputRead sir = new StandardInputRead();
		this.specialityName = sir.readString("Give Speciality name");
		this.specialityDivision = sir.readString("division");
		this.specialityCode= sir.readPositiveInt("Give code");
		
	
	
	}
	
	public Speciality(int specialityCode) {
		StandardInputRead sir = new StandardInputRead();
		this.specialityName = sir.readString("Give Speciality name");
		this.specialityDivision = specialityDivision;
		this.specialityCode= specialityCode;
	
	
	
	}
	
	
	
	public String getSpecialityName() {
		return this.specialityName;
	}
	
	
	public String setSpecialityName(String specialityName) {
		
		return this.specialityName = specialityName;
		
	}
	public String getSpecialityDivision() {
		return this.specialityDivision;
	}
	public void setSpecialityDivision(String specialityDivision) {
		this.specialityDivision = specialityDivision;
	}
	public int getSpecialityCode() {
		return this.specialityCode;
	}
	public void setSpecialityCode(int specialityCode) {
		this.specialityCode = specialityCode;
	}
	
	
	public void print(){
		System.out.println("Section's Name = " + specialityName );
		System.out.println("Section's division = " + specialityDivision);
		System.out.println("Section's code = " + specialityCode);
	}
	
	
	
	
}
