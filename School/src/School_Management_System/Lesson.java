package School_Management_System;
//Panagiotis Georgios Margonis 


import tuc.ece.cs111.util.StandardInputRead;
public class Lesson {
	
	private String lessonName;
	private int lessonCode;
	private Speciality teacherSpeciality;
	
	
	public Lesson(String lessonName,
			Speciality teacherSpeciality,int lessonCode ) {
		
		this.lessonName = lessonName;
		this.lessonCode = lessonCode;
		this.teacherSpeciality = teacherSpeciality;
	}
	
	public Lesson(){

		StandardInputRead sir = new StandardInputRead();
		this.lessonCode = sir.readPositiveInt("Give the code of the lesson");
	}
	

	

	public String getLessonName() {
		return this.lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public int getLessonCode() {
		return this.lessonCode;
	}
	public void setLessonCode(int lessonCode) {
		this.lessonCode = lessonCode;
	}
	public Speciality getTeacherSpeciality() {
		return this.teacherSpeciality;
	}
	public void setTeacherSpeciality(Speciality teacherSpeciality) {
		this.teacherSpeciality = teacherSpeciality;
	}
   
	
	public void print(){
		System.out.println("lesson code =" + lessonCode);
	}
	
	


}
