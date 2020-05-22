package Staff;

import java.util.Random;

public class StaffTaskGenerator {


    private String[] admtask= { "Scanning documents", "Covering Reception", "Answering calls", "Scheduling a Meeting", "Executive Travel", "Preparing Reports", "Calendary creation", "Buying supplies" };

    
    public StaffTaskGenerator() {
    	
    }
    
    public String getRandomData() {
		//return a random task
		
		Random r = new Random();
		
		//pick a task based on length of arrays
		String adm = admtask[r.nextInt(admtask.length)];
						
		return ( "This administrative Staff is performing: " +adm +" task at the moment.");
		
	}


	
}
