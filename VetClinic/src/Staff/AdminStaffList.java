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

	// Instance of the class StaffDataGenerator
	StaffDataGenerator sdg = new StaffDataGenerator();

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
		for (ClinicStaff manager : m) {
			System.out.println(manager);
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
			System.out.println(a);
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
			System.out.println(recep);
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
			System.out.println(cs);
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
			System.out.println(it);
		}}

	public void generateAdminStaff() {
		generateAssistant();
		generateCS();
		generateIt();
        generateManager();
        generateReceptionist();
		}
	}

