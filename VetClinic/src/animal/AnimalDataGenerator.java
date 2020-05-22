package animal;

import java.util.Random;

public class AnimalDataGenerator {
// Names and conditions based on most popular name for animals on google
		private String[] names = { "Chico", "Bambi", "Guido", "Mimi", "Black", "White", "Suzy", "Willy", "Suzy", "Hopper","Marble","Fluffy", "Rex", "Tido" }; //14
	    private String[] conditions = { "Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Bloat", "Worm", "Rabies","Parvovirus", "Acne" };//12
// Medical conditions based on most recurrent medical conditions for mammal pet animals	    
	    private int ages = 10; // Consider it as months for rodents
	    
	    public AnimalDataGenerator() {
	    	
	    }
	    
	    public String getRandomData() {
			//return a random name
			
			Random r = new Random();
			
			//pick a name, condition and age based on length of arrays
			String name = names[r.nextInt(names.length)];
			String condition = conditions[r.nextInt(conditions.length)];
			int age = r.nextInt(ages);
			
			return ( name + " " + age + " " + condition);
			
		}

	
	
}
