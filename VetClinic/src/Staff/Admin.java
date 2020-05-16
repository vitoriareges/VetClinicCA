package Staff;

public class Admin extends ClinicStaff{

	
	public Admin(String firstName, String surname, int staffID, int salary) {
		super(firstName, surname, staffID, salary);
		// TODO Auto-generated constructor stub
	}


	public class Manager extends ClinicStaff{

		public Manager(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Manager: " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	
	public class Assistant extends ClinicStaff{
		
		
	public Assistant (String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}
	
	@Override
	public String toString() {
		
		return "Assitant: " + firstName + " " + surname + " " + staffID + " " + salary;
	}

	}
	
	
	public class Receptionist extends ClinicStaff{

		public Receptionist(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Receptionist: " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	
	public class CustomerService extends ClinicStaff{

		public CustomerService(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Customer Service Rep: " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	public class ITSupport extends ClinicStaff{

		public ITSupport(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "IT Techie: " + firstName + " " + surname + " " + staffID + " " + salary;
		}
		
	}
	
	
////Method that generates the number ID
	public int generateStaffID (int i) {
		int staffID = 2000; //ID for medical staff starts in 2000
		staffID +=i;
		return staffID;
	}
	
}


