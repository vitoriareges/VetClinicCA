
import java.util.LinkedList;
import java.util.Queue;


import Staff.MedicalStaffList;
import animal.AnimalList;
public class MedServ {
	
	public void Queue () {
		MedicalStaffList vet = new MedicalStaffList();
		vet.getV();
        Queue<String> waitingQueue = new LinkedList<>();
        AnimalList dog = new AnimalList();
        dog.getD();
        
        for(int i = 0 ; i<4; i++)
        // Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add(dog.getD().toString());
        int index= 1;

        System.out.println("The Veterinarian" +vet.getV().get(index) + " will see the following animals : " + waitingQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String animal = waitingQueue.remove();
        System.out.println("Now the veterinarian "+vet.getV().get(index)+ "Has seen the animal: " +animal+ "  | New WaitingQueue : " + waitingQueue);


       
    }


}
