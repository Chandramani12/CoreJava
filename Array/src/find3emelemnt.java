class Employee{
	final String pancardnumber;
	public Employee(String pancardnumber) {
		this.pancardnumber=pancardnumber;
	}
	public String getPancard() {
		return pancardnumber;
	}
}
public class find3emelemnt {
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee("ABC1234");	
		String s1=e.getPancard();
		System.out.println(s1);
		
	}

}
