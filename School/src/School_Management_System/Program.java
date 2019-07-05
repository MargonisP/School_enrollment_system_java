package School_Management_System;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121


public class Program {
	

	
		private Section sName;
		private Lesson lCode;
		private int  enrollmentCode;
	
		private Teacher tCode;
		private String day;
		private int time;
		
		
		
		
		public Program(Section sName,Lesson lCode,Teacher tCode, String day, int time,int  enrollmentCode) {
			
			this.sName = sName;
			this.lCode = lCode;
			this.enrollmentCode = enrollmentCode;
			this.tCode = tCode;
			this.day = day;
			this.time = time;
		}
	
		
		
		

		public Section getSName() {
			return this.sName;
		}




		public void setSName(Section sName) {
			this.sName = sName;
		}




		public Lesson getLCode() {
			return this.lCode;
		}




		public void setLCode(Lesson lCode) {
			this.lCode = lCode;
		}




		public int getEnrollmentCode() {
			return this.enrollmentCode;
		}




		public void setEnrollmentCode(int enrollmentCode) {
			this.enrollmentCode = enrollmentCode;
		}




		public Teacher getTCode() {
			return this.tCode;
		}




		public void setTCode(Teacher tCode) {
			this.tCode = tCode;
		}




		public int getTime() {
			return this.time;
		}




		public void setTime(int time) {
			this.time = time;
		}


		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}
		
		
		public void print() {
			System.out.println("enrollmentcode: " + enrollmentCode);
			System.out.println("day: " + day);
			System.out.println("time: " + time);
			
			sName.print();
			lCode.print();
			tCode.printTea();
		}

		
		
		public String  givesectioname() {
			return sName.getSectionName();
		}
		
		public int givelCode(){
			return lCode.getLessonCode();
		}
		
		public int givetCode(){
			return tCode.getTeacherCode();
		}
		
		

}
