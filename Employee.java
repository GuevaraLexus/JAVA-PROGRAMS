import java.util.ArrayList;

public class Employee{
	
	private int id;
	private String dept;
	private String name;
	private static ArrayList<Employee> empList;
	
	public Employee(){
        this.id=0;
        this.name="";
        this.dept ="";
        empList= new ArrayList<Employee>();
    }
    public Employee(int id, String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    
	public void AddEmployee(Employee emp) {
		empList.add(emp); 
	}
	
	public static ArrayList<String> GetEmployee(){
		ArrayList<String> List = new ArrayList<String>();
        int j = 0, limit=empList.size();
        for(j=0; j<limit;j++){
            List.add(String.valueOf(empList.get(j).id)+ " " + empList.get(j).name + " " + empList.get(j).dept);
        }
        return List;
	}
	
	public static ArrayList<String> GetEmployee1(){
		ArrayList<String> List = new ArrayList<String>();
        int j = 0, limit=empList.size();
        for(j=0; j<limit;j++){
            List.add(empList.get(j).name + " of " + empList.get(j).dept);
        }
        return List;
	}
	
	public static void main (String[]args) {
		
		Department department= new Department(); 
	    ArrayList<String> DeptList;
	    	department= new Department(1,"ITSD");
	    	department.AddDepartment(department);
	    	department= new Department(2,"Accounting");
	    	department.AddDepartment(department);
	    	department= new Department(3,"Gaming");
	    	department.AddDepartment(department);
	    	department= new Department(4,"Charity");
	    	department.AddDepartment(department);
	     
	    System.out.println("Departments : \n");   
	    DeptList=Department.getAllDepartment();
	    int i, lmt=DeptList.size();
	    for(i=0; i<lmt; i++){
	    	System.out.println(DeptList.get(i));
	    }
	    
	    Employee employee = new Employee();
	    ArrayList<String> empList;
	    	employee = new Employee(1, "John", "Accounting");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(2, "Mark", "Charity");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(3, "Dennis", "ITSD");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(4, "Steve", "Gaming");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(5, "Ada", "ITSD");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(6, "Charles", "ITSD");
	    	employee.AddEmployee(employee);
	    	employee = new Employee(7, "Lexus", "Gaming");
	    	employee.AddEmployee(employee);
	    	
	    System.out.println("\nDATA : \n");
	    empList=GetEmployee();
		int j, limit=empList.size();
		for(j=0; j<limit; j++){
			System.out.println(empList.get(j));
		}
		System.out.println("\nLIST OF EMPLOYEES : \n");
		empList=GetEmployee1();
		for(j=0; j<limit; j++){
			System.out.println(empList.get(j));
		}
	}
}
