package Staff;

import java.util.ArrayList;

public class MedicalStaffList {

	// protected String medical staffData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j = 0;// Counter used for the staffID

	// Number of medical staff to be generated, it is calculated on a percentage
	// level in case the total of medical staff varies
	private int numMedicalStaff = 30; // Total number of medical Staff
	private int numVeterinarian = (int) (numMedicalStaff * 0.25);
	private int numTraineeVet = (int) (numMedicalStaff * 0.1);
	private int numNurse = (int) (numMedicalStaff * 0.35);
	private int numVetAssistant = (int) (numMedicalStaff * 0.20);
	private int petHairStylist = numMedicalStaff - numVeterinarian - numTraineeVet - numNurse - numVetAssistant;

	// ArrayList from the Superclass ClinicStaff where Medical will be Stored
	ArrayList<ClinicStaff> medicalStaff = new ArrayList<ClinicStaff>();
	ArrayList<ClinicStaff>  n= new ArrayList<ClinicStaff>();//nurse
	ArrayList<ClinicStaff> phs = new ArrayList<ClinicStaff>();// pet hair stylist
	ArrayList<ClinicStaff> tv = new ArrayList<ClinicStaff>();//trainee vet
	ArrayList<ClinicStaff> v = new ArrayList<ClinicStaff>();// veterinarian
	ArrayList<ClinicStaff> va = new ArrayList<ClinicStaff>();// vet assist



	// Instance of the class Medical that will be used to create instances of its
	// inner classes
	Medical medicStaff = new Medical(firstName, surname, staffID, salary);

	// Instance of the class StaffDataGenerator, which has all the info to generate Staff members
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instances of the inner classes of the class Medical that will be used to populate the array of the parent class
	Medical.Veterinarian vet;
	Medical.TraineeVet trainVet;
	Medical.Nurse nurse;
	Medical.VeterinarianAssistant vetAssist;
	Medical.PetHairStylist hairStyle;

	//Method that generates all the medical staff and populates the parent class array
	public void generateVet() {
		/// Loop to generate veterinarians
		//note the counter for the staff ID is increasing with each cycle of the for loop
		for (int i = 0; i < numVeterinarian; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			vet = medicStaff.new Veterinarian(medicalParts[0], medicalParts[1], staffID, 0);
			medicalStaff.add(vet);
			v.add(vet);
		}
		for (ClinicStaff vet : v) {
			System.out.println(vet);
		}
		}
	
	public void generateTVet() {
		/// Loop to generate Trainee Veterinarians
		for (int i = 0; i < numTraineeVet; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			trainVet = medicStaff.new TraineeVet(medicalParts[0], medicalParts[1], staffID, 0);
			medicalStaff.add(trainVet);
			tv.add(trainVet);
		}
		for (ClinicStaff tvet : tv) {
			System.out.println(tvet);
		}
	}
	public void generateNurse() {
		/// Loop to generate Nurses
		for (int i = 0; i < numNurse; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			nurse = medicStaff.new Nurse(medicalParts[0], medicalParts[1], staffID, 0);
			medicalStaff.add(nurse);
			n.add(nurse);
		}
		for (ClinicStaff nurse : n) {
			System.out.println(nurse);
		}
	}
	
	public void generateVAssistant() {
		/// Loop to Veterinarian Assistants
		for (int i = 0; i < numVetAssistant; i++,j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			vetAssist = medicStaff.new VeterinarianAssistant(medicalParts[0], medicalParts[1], staffID, 0);
			medicalStaff.add(vetAssist);
			va.add(vetAssist);
		}
		for (ClinicStaff vassist : va) {
			System.out.println(vassist);
		}
	}
	public void generatePHS() {
		/// Loop to Pet Hair Stylists 
		for (int i = 0; i < petHairStylist; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			// Create a class for salary
			int staffID = medicStaff.generateStaffID(j); // Method to generate the id
			hairStyle = medicStaff.new PetHairStylist(medicalParts[0], medicalParts[1], staffID, 0);
			medicalStaff.add(hairStyle);
			phs.add(hairStyle);
		}
		for (ClinicStaff hair : phs) {
			System.out.println(hair);
		}
		}
	
		public void generateMedicalStaff() {
		/// Loop that prints out each element of the medicalStaff ArrayList
		
			generatePHS();
			generateVAssistant();
			generateNurse();
			generateVet();
			generateTVet();
			
		
	}
	}

