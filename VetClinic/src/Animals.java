import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class Animals {
    
    Random r = new Random(); // implementing random function
    private String[] animaltype = { "cat", "dog", "ferret", "rabbit" };// array with types of animals
    private String[] names = { "Chico", "Bambi", "Guido", "Mimi", "Black", "White", "Suzy", "Willy", "Suzy", "Hopper",
            "Marble" };
    private String[] condition = { "Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Bloat", "Worm", "Rabies","Parvovirus" };



public Collection<String> listNames(){
    ArrayList<String> animalname = new ArrayList<String>(); // creates an arrray list of names for animals
    for(int i=0; i<this.names.length; i++) {
        animalname.add(names[i]);// populating list with array of names
    }
    return animalname;
}

public Collection<String> listConditions(){
    ArrayList<String> medcond = new ArrayList<String>(); // creates an array list of medical conditions for animals
    for(int i=0; i<this.condition.length;i++){
    medcond.add(this.condition[i]);//populating list with array of conditions
    }
    return medcond;
}
public int age(){
    int animalage;
// criar condição de idade para tipo de animal
return 0;

}

public Collection<String> listCases(){
     ArrayList<String> cases = new ArrayList<String>(); // creates an array list of cases, that will include animal type, animal name, animal age and ilness
return cases;
}
}