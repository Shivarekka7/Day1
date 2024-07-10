package Day1;

public class Employee {
 
	 public static void main (String args[]) {
		 EmployeeDetails e=new EmployeeDetails();
		 
		 e.name="shiva";
		 e.id=07;
		 e.salary=25000l;
		 e.isfemale=true;
		 System.out.println(e.name);
		 System.out.println(e.id);
		 System.out.println(e.salary);
		 if(e.isfemale==true) {
			 
		 }
		 
		 
		 
		 
	 }
	
}
	 
class EmployeeDetails{
	 String name;
		int id;
		long salary;
		boolean isfemale;
 }
 
