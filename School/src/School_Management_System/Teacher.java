package School_Management_System;
//Panagiotis Georgios Margonis 




import tuc.ece.cs111.util.StandardInputRead;
public class Teacher {
	private String teacherFname;
	private String teacherLname;
	
	private Speciality speciality;
	private int teacherCode;
	

	
	public Teacher(String teacherFname, String teacherLname,
			Speciality speciality,int teacherCode) {
		
		
		this.teacherFname = teacherFname ;
		this.teacherLname = teacherLname;
		this.speciality = speciality;
		
		this.teacherCode = teacherCode;
	}
	public Teacher(){
		
		StandardInputRead sir = new StandardInputRead();
		this.teacherCode = sir.readPositiveInt("dwse tcode");
	}
	
	
	
	

	public String getTeacherFname() {
		return this.teacherFname;
	}
	public void setTeacherFname(String teacherFname) {
		this.teacherFname = teacherFname;
	}
	public String getTeacherLname() {
		return this.teacherLname;
	}
	public void setTeacherLname(String teacherLname) {
		this.teacherLname = teacherLname;
	}
	public Speciality getSpeciality() {
		return this.speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	
	
	public int getTeacherCode() {
		return this.teacherCode;
	}
	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}
	
	
	public void print(){
		System.out.println("lastName:" + teacherLname );
		System.out.println("firtName:" + teacherFname );
		System.out.println("Code:" + teacherCode );
		speciality.print();
	
		
	}
	
	public void printTea(){
	
		
		System.out.println("Code:" + teacherCode );
		
	
		
	}

	public String givesname(){
		return this.speciality.getSpecialityName();
	}
	
	

}
