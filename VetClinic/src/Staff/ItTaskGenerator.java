package Staff;

import java.util.Random;

public class ItTaskGenerator {


	private String[] ittask = {  "Software updating", "Covering Reception", "Answering calls", "Changing cables", "Updating a computer", "Inputing data on database", "Maintaining notebooks ", "Buying supplies" }; 
    
    
    public ItTaskGenerator() {
    	
    }
    
    public String getRandomData() {
		//return a random task
		
		Random r = new Random();
		
		//pick a task based on length of arrays
		
		String it = ittask[r.nextInt(ittask.length)];
				
		return ( "This IT Staff is performing: " +it +" task at the moment.");
		
	}


	
}

