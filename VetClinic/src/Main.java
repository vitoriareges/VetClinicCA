import animal.AnimalList;

import java.util.Scanner;

import Staff.AdminStaffList;
import Staff.MedicalStaffList;

public class Main {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		//AnimalList al = new AnimalList();
		//al.generateAnimals();
		
		//MedicalStaffList msl = new MedicalStaffList();
		//msl.generateMedicalStaff();
		
		//AdminStaffList asl = new AdminStaffList();
		//asl.generateAdminStaff();
		
		  int option;
	        Scanner sc = new Scanner(System.in);
	        
	        do{
	            MenuOptions();
	            option = sc.nextInt();
	            
	            switch(option){
	            case 1:
	                AdminStaff ();
	                break;
	                
	            case 2:
	                MedicalStaff();
	                break;
	                
	            case 3:
	                Animals();
	                break;
	          
	            default:
	                System.out.println("Invalid Option");
	                MenuOptions();
	            }
	            }
	        while(option != 0);
	    }
	  public static void MenuOptions() {
	        System.out.println("Veterinary Clinic Menu");
	        System.out.println("Please Select one of the options bellow using the number given");
	        System.out.println("1 - Admin Staff");
	        System.out.println("2 - Medical Staff");
	        System.out.println("3 - Animals");
	        System.out.println("0 - To leave");
	        System.out.println("Option:");
	    }

	    public static void AdminStaff(){
	        System.out.println("Admin Staff");
	        
	       // AdminStaffList asl = new AdminStaffList();
			//asl.generateAdminStaff();
	        
	        System.out.println("Please Select one of the options bellow using the number given");
	        System.out.println("1 - Assistant");
	        System.out.println("2 -Customer Service");
	        System.out.println("3 - IT Support");
	        System.out.println("4 - Manager");
	        System.out.println("5 - Receptionist");
	        System.out.println("6 - All Medical Staff");
	        System.out.println("0 - To leave");
	        System.out.println("Option:");
	        
	        Scanner sc3 = new Scanner(System.in);
	            int option3 = sc3.nextInt();
	            
	            switch(option3){
	            case 1:
	            	AdminStaffList a = new AdminStaffList();
	            	a.generateAssistant();
	                break;
	                
	            case 2:
	            	AdminStaffList cs = new AdminStaffList();
	     			cs.generateCS();
	                break;
	                
	            case 3:
	            	AdminStaffList it = new AdminStaffList();
	            	it.generateIt();
	                break;
	                
	            case 4:
	            	AdminStaffList m = new AdminStaffList();
	            	m.generateManager();
	            	
	               break;
	               
	            case 5:
	            	AdminStaffList r = new AdminStaffList();
	            	r.generateReceptionist();
		     			
	               break;
	               
	            case 6:
	            	AdminStaffList asl = new AdminStaffList();
	    			asl.generateAdminStaff();
		     			
	               break;
	               
	            default:
	                System.out.println("Invalid Option");
	                AdminStaff();
	            }
	         while(option3 != 0);
	    }
	    
	    
	    public static void MedicalStaff(){
	        System.out.println("Medical Staff");
	        
	    //   MedicalStaffList msl = new MedicalStaffList();
		//	msl.generateMedicalStaff();
	        System.out.println("Please Select one of the options bellow using the number given");
	        System.out.println("1 - Nurse");
	        System.out.println("2 - Pet Hair Stylist");
	        System.out.println("3 - Trainee Veterinarian");
	        System.out.println("4 - Veterinarian");
	        System.out.println("5 - Veterinarian Assistant");
	        System.out.println("6 - All Medical Staff");
	        System.out.println("0 - To leave");
	        System.out.println("Option:");
	        
	        Scanner sc4 = new Scanner(System.in);
	            int option4 = sc4.nextInt();
	            
	            switch(option4){
	            case 1:
	            	 MedicalStaffList nurse = new MedicalStaffList();
	         			nurse.generateNurse();
	                break;
	                
	            case 2:
	            	 MedicalStaffList phs = new MedicalStaffList();
	            	phs.generatePHS();
	     			
	                break;
	                
	            case 3:
	            	 MedicalStaffList tv = new MedicalStaffList();
		            	tv.generateTVet();
	                break;
	                
	            case 4:
	            	 MedicalStaffList vet = new MedicalStaffList();
		            	vet.generateVet();
	               break;
	               
	            case 5:
	            	 MedicalStaffList va = new MedicalStaffList();
		            	va.generateVAssistant();
		     			
	               break;
	               
	            case 6:
	            	MedicalStaffList msl = new MedicalStaffList();
	        		msl.generateMedicalStaff();
		     			
	               break;
	               
	            default:
	                System.out.println("Invalid Option");
	                MedicalStaff();
	            }
	         while(option4 != 0);
	    }
	    
	    
	    public static void Animals(){
	    	 // AnimalList al = new AnimalList();
			//al.generateAnimals();
	        System.out.println("Menu of Animals");        
	        System.out.println("Please Select one of the options bellow using the number given");
	        System.out.println("1 - cat");
	        System.out.println("2 - dog");
	        System.out.println("3 - fish");
	        System.out.println("4 - horse");
	        System.out.println("5 - lizzard");
	        System.out.println("6 - mouse");
	        System.out.println("7 - parrot");
	        System.out.println("8 - rabbit");
	        System.out.println("9 - snake");
	        System.out.println("10 - Search animal by name");
	        System.out.println("0 - To leave");
	        System.out.println("Option:");
	        
	        Scanner sc2 = new Scanner(System.in);
	            int option2 = sc2.nextInt();
	            
	            switch(option2){
	            case 1:
	            	 AnimalList cat = new AnimalList();
	         		cat.generateCat();
	                break;
	                
	            case 2:
	            	 AnimalList dog = new AnimalList();
	        		dog.generateDog();
	                break;
	                
	            case 3:
	            	 AnimalList fish = new AnimalList();
	         		fish.generateFish();
	                break;
	                
	            case 4:
	           	 AnimalList horse = new AnimalList();
	        		horse.generateHorse();
	               break;
	               
	            case 5:
	           	 AnimalList lizard = new AnimalList();
	        		lizard.generateLizard();
	               break;
	               
	            case 6:
	           	 AnimalList mouse = new AnimalList();
	        		mouse.generateMouse();
	               break;
	               
	            case 7:
	           	 AnimalList parrot = new AnimalList();
	        		parrot.generateParrot();
	               break;
	               
	            case 8:
	           	 AnimalList rabbit = new AnimalList();
	        		rabbit.generateRabbit();
	               break;
	               
	            case 9:
	           	 AnimalList snake = new AnimalList();
	        		snake.generateSnake();
	        		
	        		
	            case 10:
	               	AnimalList al = new AnimalList();
	               	al.generateAnimals();
	               	
	        	
	               break;
	          
	            default:
	                System.out.println("Invalid Option");
	                Animals();
	            }
	         while(option2 != 0);
	    }
	       
}


