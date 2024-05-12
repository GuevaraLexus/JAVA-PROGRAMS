import java.util.ArrayList;

public class Department {

	private int ID;
    String Name;
    static ArrayList<Department> DeptList;
    public Department(){
        this.ID=0;
        this.Name="";
        Department.DeptList= new ArrayList<Department>();
    }
    public Department(int ID, String Name){
        this.ID=ID;
        this.Name=Name;
    
    }
    public void AddDepartment(Department Dept){
        DeptList.add(Dept);
    }
    public static ArrayList<String> getAllDepartment(){
        ArrayList<String> List = new ArrayList<String>();
        int i, lmt=DeptList.size();
        for(i=0; i<lmt;i++){
            List.add(String.valueOf(DeptList.get(i).ID)+ " " + DeptList.get(i).Name);
        }
        return List;
    }
	public Object get(int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
