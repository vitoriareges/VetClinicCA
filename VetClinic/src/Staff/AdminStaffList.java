package Staff;

import java.util.ArrayList;


public class AdminStaffList {
	// protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j = 0; // Counter used for the staffID

	// Number of medical staff to be generated
	private int numAdminStaff = 10;
	private int numManager = (int) (numAdminStaff * 0.1);
	private int numAssistant = (int) (numAdminStaff * 0.2);
	private int numReceptionist = (int) (numAdminStaff * 0.10);
	private int numCustomServ = (int) (numAdminStaff * 0.30);
	private int numIT = numAdminStaff - numManager - numAssistant - numReceptionist - numCustomServ;

	// ArrayList from the Superclass ClinicStaff where Medical will be Stored
	ArrayList<ClinicStaff> administrativeStaff = new ArrayList<ClinicStaff>();
	Admin adminStaff = new Admin(firstName, surname, staffID, salary);
	
	ArrayList<ClinicStaff> a = new ArrayList<ClinicStaff>();//assistant
	ArrayList<ClinicStaff> cs = new ArrayList<ClinicStaff>();// customer service
	ArrayList<ClinicStaff> it = new ArrayList<ClinicStaff>();//it support
	ArrayList<ClinicStaff> m = new ArrayList<ClinicStaff>();// manager
	ArrayList<ClinicStaff> r = new ArrayList<ClinicStaff>();// receptionist
	ArrayList<ClinicStaff> all = new ArrayList<ClinicStaff>();// all staffs


	// Instance of the class StaffDataGenerator
	StaffDataGenerator sdg = new StaffDataGenerator();
	
	// Instance of the class StaffTaskGenerator
	StaffTaskGenerator stg = new StaffTaskGenerator();
	
	//Instance of the class ItTaskGenerator
	ItTaskGenerator itg = new ItTaskGenerator();

	// Instances of the inner classes of the class Medical
	Admin.Manager manager;
	Admin.Assistant assistant;
	Admin.Receptionist receptionist;
	Admin.CustomerService customServ;
	Admin.ITSupport itGuy;

	public void generateManager() {
		/// Loop to generate manager
		for (int i = 0; i < numManager; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			manager = adminStaff.new Manager(adminParts[0], adminParts[1], staffID, 0);
			administrativeStaff.add(manager);
			m.add(manager);
			
		}
		for (ClinicStaff manager: m) {
			String adminTask = stg.getRandomData();
			System.out.println(manager + " " + adminTask);
		}}

	public void generateAssistant() {
		/// Loop to generate assistant
		for (int i = 0; i < numAssistant; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			assistant = adminStaff.new Assistant(adminParts[0], adminParts[1], staffID, 0);
			administrativeStaff.add(assistant);
			a.add(assistant);
		}
		for (ClinicStaff a : a) {
			String adminTask = stg.getRandomData();
			System.out.println(a + " " + adminTask);
		}
	}

	public void generateReceptionist() {
		/// Loop to generate recep
		for (int i = 0; i < numReceptionist; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			receptionist = adminStaff.new Receptionist(adminParts[0], adminParts[1], staffID, 0);
			administrativeStaff.add(receptionist);
			r.add(receptionist);
		}
		for (ClinicStaff recep : r) {
			String adminTask = stg.getRandomData();
			System.out.println(recep + " " + adminTask);
		}
	}
	public void generateCS() {
		/// Loop to generate cs
		for (int i = 0; i < numCustomServ; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			customServ = adminStaff.new CustomerService(adminParts[0], adminParts[1], staffID, 0);
			administrativeStaff.add(customServ);
			cs.add(customServ);
		}
		for (ClinicStaff cs : cs) {
			String adminTask = stg.getRandomData();
			System.out.println(cs + " " + adminTask);
		}}

	public void generateIt() {
		/// Loop to generate it guy
		for (int i = 0; i < numIT; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			itGuy = adminStaff.new ITSupport(adminParts[0], adminParts[1], staffID, 0);
			administrativeStaff.add(itGuy);
			it.add(itGuy);
		}
		
		for (ClinicStaff it : it) {
			String itTask = itg.getRandomData();
			System.out.println(it + " " + itTask);
		}}

	public void generateAdminStaff() {
		generateAssistant() ;
		generateCS();
		generateIt();
		generateManager();
        generateReceptionist();
	}
	
	public void SearchAll() {
		/// Loop to generate all
					
			all.addAll(it);
			all.addAll(a);
			all.addAll(cs); 
			all.addAll(m);
			all.addAll(r); 
        
			for (ClinicStaff all : all) {
				
				System.out.println(all);
			
			
			
		}	
}
	
		}
	

	

