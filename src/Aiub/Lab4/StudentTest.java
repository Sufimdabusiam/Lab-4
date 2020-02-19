package Aiub.Lab4;

public class StudentTest {

	public static void main(String[]args) {
		Student s1=new Student();
		s1.setName("SUFI");
		s1.setId("17-34597-2");
		s1.setDprt("CSE");
		s1.setCgpa(3);
		s1.show();	
		Student s2=new Student("SUFI","17-34597-2","CSE",3);
		s2.show();

	}

}

