package School_Management_System;

import tuc.ece.cs111.util.StandardInputRead;
//Panagiotis Georgios Margonis 

public class School {
	
		private String schoolName;
		private Address schoolAdress;
		private int schooltelephone;
		private String schoolType;
		private Teacher[] tea;
		private int numOfTeachers;
		private Section[] sec;
		private int numOfSections;
		private Lesson[] les;
		private int numOfLessons;
		private Program[] pro;
		private int numOfPrograms;
		
		
		

		
		public School() {
			StandardInputRead sir = new StandardInputRead();
			String schoolName = sir.readString("Give School Name");
			Address schoolAdress = new Address();
			
			int schooltelephone = sir.readPositiveInt("Give phone number");
			
			String schoolType = sir.readString("Give Type Name");
			this.schoolName = schoolName;
			this.schoolAdress = schoolAdress;
			this.schooltelephone = schooltelephone;
			this.schoolType = schoolType;
			
			this.tea = new Teacher[100];
			this.numOfTeachers = 0;
			this.sec = new Section[300];
			this.numOfSections = 0;
			this.les= new Lesson[300];
			this.numOfLessons = 0;
			this.pro = new Program[500];
			this.numOfPrograms = 0;
			
			printschool();
		
		}	
			
			
			

		public String getSchoolName() {
			return this.schoolName;
		}


		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}


		public Address getSchoolAdress() {
			return this.schoolAdress;
		}


		public void setSchoolAdress(Address schoolAdress) {
			this.schoolAdress = schoolAdress;
		}


		public int getSchooltelephone() {
			return this.schooltelephone;
		}


		public void setSchooltelephone(int schooltelephone) {
			this.schooltelephone = schooltelephone;
		}


		public String getSchoolType() {
			return this.schoolType;
		}


		public void setSchoolType(String schoolType) {
			this.schoolType = schoolType;
		}
		
		
		public void insertTeacher(String teacherFname,String teacherLname,Speciality speciality ,int teacherCode){
			if(numOfTeachers >= 100)
				System.out.println("Cannot store more than 100");
			else
			{
				tea[numOfTeachers]=new Teacher(teacherFname,teacherLname,speciality,teacherCode);
				numOfTeachers++;
			}
		}
		
	
		
		
		public void insertLesson(String lessonName,
				Speciality teacherSpeciality,int lessonCode){
			
			if(numOfLessons >= 300)
				System.out.println("Cannot store more than 100");
			else
			{
				les[numOfLessons]=new Lesson(lessonName,teacherSpeciality,lessonCode);
				numOfLessons++;
				
				
			}
		}
		
		public void insertSection(String sectionName, int totalNumOfStudents,
				String sectionCode){
			if(numOfSections >= 300)
				System.out.println("Cannot store more than 100");
			else 
			{
				sec[numOfSections]=new Section(sectionName,totalNumOfStudents,sectionCode);
				numOfSections++;
			
			
			}
		}
		
		
		public void insertEggrafh(Section sName,Lesson lCode,Teacher tCode, String day, int time,int  enrollmentCode){
			
			int check=0;
			if(numOfPrograms >= 100)
				System.out.println("Cannot store more than 100");
			else
			{
				for(int i=0;i<numOfPrograms;i++)
				 {
					
				    if(day.equals(pro[i].getDay()) && time==pro[i].getTime() && sName.equals(pro[i].getSName()) && tCode!=pro[i].getTCode()){
				           System.out.println("It is not possible two teachers teaching in the same class");
				           check=1;
				    }
				    else if(day.equals(pro[i].getDay()) && time==pro[i].getTime() && !sName.equals(pro[i].getSName()) && tCode==pro[i].getTCode()){
				          System.out.println("It is not possible one teacher teaching in two different classes in the same time");
				          check=1;
				    }
				    else if(day.equals(pro[i].getDay()) && time==pro[i].getTime() && sName.equals(pro[i].getSName()) && tCode==pro[i].getTCode()){
				          System.out.println("This enrollment has been already stored");
				          check=1;
				     }
				 }
				  
		if(check==0){
				pro[numOfPrograms]=new Program(sName,lCode,tCode,day,time,enrollmentCode);
				numOfPrograms++;
		}
				
				
				}
			}
		
		
		
		public int getNumOfTeachers() {
			return numOfTeachers;
		}

		public int getNumOfLessons() {
			return numOfLessons;
		}

		public int getNumOfSections() {
			return numOfSections;
		}
		
		public int getNumOfPrograms() {
			return numOfPrograms;
		}
		


		
		
	
		public  void deleteEggrafi(int  enrollmentCode){
			int i=0;
			while((i<numOfPrograms)&&(enrollmentCode!=(pro[i].getEnrollmentCode())))
				i++; 
			if(i<numOfPrograms){
				for(int k = i;k<numOfPrograms-1;k++)
					pro[k]=pro[k+1];
				
				
				pro[numOfPrograms-1]=null;
				numOfPrograms--;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		public void printEnrollments(){
			System.out.println("number of enrollments" + numOfPrograms);
			
			for(int i=0;i<numOfPrograms;i++)
				
			    pro[i].print();
		}
		
		
		public void printTeachers(){
			System.out.println("number of teachers =" + numOfTeachers);
			
			for(int i=0;i<numOfTeachers;i++)
				tea[i].print();
			
			
		}
		
		
		public void printLcodes(){
			System.out.println("number of lessons =" + numOfLessons);
			
			for(int i=0;i<numOfLessons;i++)
				les[i].print();
			
			
		}
		
		
		
		
		
		
		public void findOrderOfTeacher(){
			
			StandardInputRead sir = new StandardInputRead();
			
			String surname = sir.readString("Enter Lastname");
			
			int i = 0;
			int k=0;
			
			while(i<this.numOfTeachers){
				
				if(this.tea[i].getTeacherLname().equals(surname) ){
					while(k<this.numOfPrograms){
					if(this.tea[i].getTeacherCode()==this.pro[k].givetCode()){
					this.pro[k].print();
					
					}
					 k++;
					}
				}	
				
				i++;
			}
		}
		
		
		
		
		public void findOrderOfLcode(){
			
			StandardInputRead sir = new StandardInputRead();
			
			int lessoncode = sir.readPositiveInt("Enter lesson code");
			
			int i = 0;
			
			while(i<this.numOfPrograms){
				
				if(this.pro[i].givelCode()== lessoncode) 
					
					this.pro[i].print();
				
				i++;
			}
		}

		
		
		
		public void findOrderOfSection(){
			
			StandardInputRead sir = new StandardInputRead();
			
			String secname = sir.readString("Enter SECTION name");
			
			int i = 0;
				while(i<this.numOfPrograms){
				
				if(this.pro[i].givesectioname().equals(secname) )
					
					this.pro[i].print();
				
				i++;
			}
		}
		
		
		
	public void findOrderOfDay(){
			
			StandardInputRead sir = new StandardInputRead();
			
			String day = sir.readString("Enter Day name");
			
			int i = 0;
				while(i<this.numOfPrograms){
				
				if(this.pro[i].getDay().equals(day) ) 
					
					this.pro[i].print();
				
				i++;
			}
		}
		
		public void printschool(){
			System.out.println("The name of the school is " + schoolName);
		}
		
		

}
