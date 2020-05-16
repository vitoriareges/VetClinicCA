package Staff;


public abstract class ClinicStaff {
	
	protected String firstName;
	protected String surname;
	//private String title;
	protected final int staffID;
	protected int salary;
	
	

	public ClinicStaff(String firstName, String surname, int staffID, int salary) {

		this.firstName = firstName;
		this.surname = surname;
		//this.title = title;
		this.staffID = staffID;
		this.salary = 1;
		
	}

}
