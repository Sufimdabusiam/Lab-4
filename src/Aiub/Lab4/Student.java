package Aiub.Lab4;


public class Student {
		private String name;
		private String id;
		private String dprt;
		private float cgpa;
		
	public Student() {
			
		}
		
	public Student(String name,String id,String dprt,float cgpa) {
			super();
			this.name=name;
			this.id=id;
			this.dprt=dprt;
			this.cgpa=cgpa;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id=id;
		}
		public String getDprt() {
			return dprt;
		}
		public void setDprt(String dprt) {
			this.dprt=dprt;
		}
		public float getCgpa() {
			return cgpa;
		}
		public void setCgpa(float cgpa) {
			this.cgpa=cgpa;
		}

		public void show() {
			System.out.println("ID:"+id+" NAme:"+name+" Dept:"+dprt+" Cgpa:"+cgpa);
		}
	}