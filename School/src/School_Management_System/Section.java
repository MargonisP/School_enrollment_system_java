package School_Management_System;
//Panagiotis Georgios Margonis 


import tuc.ece.cs111.util.StandardInputRead;
public class Section {
	
	private String sectionName;
	private int totalNumOfStudents;
	private String sectionCode;
	public Section(String sectionName, int totalNumOfStudents,
			String sectionCode) {
		
		this.sectionName = sectionName;
		this.totalNumOfStudents = totalNumOfStudents;
		this.sectionCode = sectionCode;
	}
	
	
	public Section(){
		StandardInputRead sir = new StandardInputRead();

		this.sectionName = sir.readString("Give a Sname");
		
		
	}
	
	public void print(){
		System.out.println("name is" + sectionName);
		
	}

	public String getSectionName() {
		return this.sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getTotalNumOfStudents() {
		return this.totalNumOfStudents;
	}
	public void setTotalNumOfStudents(int totalNumOfStudents) {
		this.totalNumOfStudents = totalNumOfStudents;
	}
	public String getSectionCode() {
		return this.sectionCode;
	}
	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}
	

	
	

}
