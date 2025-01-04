package oopstask1;

//subclass
public class Employee extends Person1 {
	
	String employeeId;
	double salary;
	
	//constructor
	public Employee(String name,int age,String employeeId,double salary)
	
	{    
		super(name,age); //initiaize the person1 attributes using super()
		this.employeeId = employeeId;
		this.salary = salary;
		
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Siya",20,"E12345",60000.0);
		System.out.println("Name: " + emp.name + "\nAge:" + emp.age +"\nEmployeeId:" + emp.employeeId + "\nSalary:" + emp.salary);
	}

}
