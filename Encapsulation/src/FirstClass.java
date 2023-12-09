class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
	
	class Employee extends Person{
		float salary;
		
		public Employee(int id,String name,float salary) {
			// TODO Auto-generated constructor stub
			super(id,name);
			this.salary=salary;
		}
	
	void display(){System.out.println(id+" "+name+" "+salary);}  
	}


 public class FirstClass {
	public static void main(String[] args) {
		Employee p=new Employee(1,"chandramani",10000);
		p.display();
			
	}
	
}
