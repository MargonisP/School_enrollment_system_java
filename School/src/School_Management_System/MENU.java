package School_Management_System;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121
import tuc.ece.cs111.util.StandardInputRead;

public class MENU {
	
	
	private School school;
	private Speciality speciality;
	private Speciality lesspeciality;
	int h=0;
	int k=0;
	int n=0;
	int y=0;

	public MENU(){
		//klhsh ths ShowMenu
		   ShowMENU();
	}

	public void ShowMENU(){
		StandardInputRead sir = new StandardInputRead();
		int choice = 0;
		
		while (choice!=14)
		{
			//emfanizoume to parakatw keimeno.
			System.out.println("Please insert the number of action you wanna do:");
			System.out.println("1. Initialize School");
			System.out.println("2. Insert New Teacher");
			System.out.println("3. Insert New Lesson");
			System.out.println("4.Insert New Section ");
			System.out.println("5. Add a New Enrollment");
			System.out.println("6. delete enrollment");
			System.out.println("7. Find the enrollments of  (based on surname) and print enrollment's characteristics  ");
			System.out.println("8. Find the enrollments of a (based on code lesson ) and print each enrollment's characteristics");
			System.out.println("9. Find the enrollments of a (based on  section name) and print each print enrollment's characteristics");
			System.out.println("10. Find the enrollments of a (based on  day name) and print each enrollment's characteristics");
			System.out.println("11. Print every enrollment (and characteristics)");
			System.out.println("12. Print every teacher id ");
			System.out.println("13. Print every lesson id ");
			System.out.println("14. exit the program");
			
			choice = sir.readPositiveInt("Enter choice");
			
			if (school==null && choice!=1)
			{
				System.out.println("Please insert a school first");
				continue;	
			}
			
			
			switch(choice){
			//ean to choice ginei iso me ena tote.
			case 1:
				//kaleite h Shop(). Omoia gia tis parakatw periptwseis kaleite h analogh synarthsh.
				this.school = new School();
				break;
			case 2:
				insertNewTeacher();
				break;
			case 3:
				insertNewLesson();
				break;
			case 4:
				insertNewSection();
				break;
			case 5:
				insertNewProgram();
				break;
			case 6:
				deleteNewProgram();
				break;
			case 7:
				school.findOrderOfTeacher();
				break;
			case 8:
				school.findOrderOfLcode();
				break;
			case 9:
				school.findOrderOfSection();
				break;
			case 10:
				school.findOrderOfDay();
				break;
			case 11:
				school.printEnrollments();
				break;
			case 12:
			    school.printTeachers();
				break;
			case 13:
				school.printLcodes();
				
			  default:
				break;
			}
		}
	}
	
	
	
	private void insertNewTeacher() {
		h++;		
		if (school.getNumOfTeachers()>=100)
		{
			System.out.println("Customers Full");
			return;
		}
		StandardInputRead sir = new StandardInputRead();
		String name = sir.readString("Give a name");
		String surname = sir.readString("Give a surname");
		
		Speciality expert = new Speciality();
		Teacher teacher = new Teacher(name,surname,expert,h);
		school.insertTeacher(name,surname,expert,h);
	}


	private void insertNewLesson() {
		k++;
		if (school.getNumOfLessons()>=300)
		{
			System.out.println("lessons Full");
			return;
		}
		StandardInputRead sir = new StandardInputRead();
		String lname = sir.readString("Give a lname");
		
		
		Speciality lesspeciality=new Speciality(y);
		Lesson lesson = new Lesson(lname ,lesspeciality,k);
		school.insertLesson(lname ,lesspeciality,k );
	}

	
private void insertNewSection() {
		
		if (school.getNumOfSections()>=300)
		{
			System.out.println("Sections Full");
			return;
		}
		StandardInputRead sir = new StandardInputRead();
		String sname = sir.readString("Give a name");
		
		int totnum = sir.readPositiveInt("Give a total num of teachers");
		String scode = sir.readString("Give a scode");
	
		Section section = new Section( sname,totnum ,scode );
		school.insertSection(sname,totnum ,scode);
	}



private void insertNewProgram() {
	n++;
	
	if (school.getNumOfPrograms()>=100)
	{
		System.out.println("programs Full");
		return;
	}
	StandardInputRead sir = new StandardInputRead();
	String day = sir.readString("Give day");
	int time = sir.readPositiveInt("Give time");
	
	Lesson lCode = new Lesson();
	
	Section  sName = new Section();
	Teacher tCode = new Teacher();
	
	
	
	
	
	
	school.insertEggrafh(sName,lCode,tCode,day,time,n);
	
}


 private void  deleteNewProgram(){

		if (school.getNumOfPrograms()==0)
		{
			System.out.println("pinakas eggrafwn adeios");
			return;
		}
		StandardInputRead sir = new StandardInputRead();
		int enrollmentCode = sir.readPositiveInt("dwse kwdiko eggrafhs");
		school.deleteEggrafi(enrollmentCode);
	 
	 
	 
	 
 }
	



	





	
	
	



		
		
		
		
	
	
	
		

	
	
	
	

}

