package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList{
	
		//protected String animalData;
		protected String name;
		protected String condition;
		protected int age;
		
		//Number of animals to be generated
		private int numOfAnimals = 100; //(1000) This can change according to user input
		private int numDogs = (int) (numOfAnimals*0.45);
		private int numCats = (int) (numOfAnimals*0.20);
		private int numRabbits = (int) (numOfAnimals*.05);
		private int numMouse =(int) (numOfAnimals*.05);
		private int numHorse =(int) (numOfAnimals*.05);
		private int numSneak =(int) (numOfAnimals*.05);
		private int numLizzard =(int) (numOfAnimals*.05);
		private int numFish =(int) (numOfAnimals*.05);
		private int numParrot = numOfAnimals - numDogs - numCats - numRabbits - numMouse - numHorse - numSneak - numLizzard - numFish;
		
		
		protected ArrayList<PetAnimals> animals = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> d = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> c = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> r = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> l = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> m = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> f = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> h = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> s = new ArrayList<PetAnimals>();
		protected ArrayList<PetAnimals> p  = new ArrayList<PetAnimals>();
		
		Animal an = new Animal(name, age, condition);
		
		AnimalDataGenerator adg = new AnimalDataGenerator();
		
		//Instances of the inner classes of the class Animal
		Animal.dog dog;
		Animal.cat cat;
		Animal.rabbit rabbit;
		Animal.lizzard lizzard;
		Animal.mouse mouse;
		Animal.fish fish;
		Animal.horse horse;
		Animal.snake snake;
		Animal.parrot parrot;
		
		
	
		//Method that generates the animals
	  public void generateDog() { 
	  ///Loop to generate dogs
	  for (int i=0; i<numDogs; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  dog = an.new dog(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(dog);
		  d.add(dog);
	  }
	  for (PetAnimals dog : d) {
		  System.out.println(dog);
	  }
	  }
	  public void generateCat() { 
	  ///Loop to generate cats
	  for (int i=0; i<numCats; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  cat = an.new cat(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(cat);
		  c.add(cat);
	  }
	  for (PetAnimals cat : c) {
		  System.out.println(cat);
	  }}
	  public void generateRabbit() { 
	///Loop to generate rabbits
	  for (int i=0; i<numRabbits; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  rabbit = an.new rabbit(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(rabbit);
		  r.add(rabbit);
	  }
	  for (PetAnimals rabbit : r) {
		  System.out.println(rabbit);
	  }
	  }
	  
	  public void generateMouse() { 
	///Loop to generate mouses
	  for (int i=0; i<numMouse; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  mouse = an.new mouse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(mouse);
		  m.add(mouse);
	  }
	  for (PetAnimals mouse : m) {
		  System.out.println(mouse);
	  }
	  }
	  
	  public void generateHorse() { 
	  
	///Loop to generate horse
	  for (int i=0; i<numHorse; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  horse = an.new horse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(horse);
		  h.add(horse);
	  }
	  for (PetAnimals horse : h) {
		  System.out.println(horse);
	  }
	  }
	  public void generateLizard() { 
	  
	///Loop to generate lizard
	  for (int i=0; i<numLizzard; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  lizzard = an.new lizzard(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(lizzard);
		  l.add(lizzard);
	  }
	  for (PetAnimals lizard : l) {
		  System.out.println(lizard);
	  }
	  }
	  
	  public void generateSnake() {  
	///Loop to generate sneaks
	  for (int i=0; i<numSneak; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  snake = an.new snake(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(snake);
		  s.add(snake);
	  }
	  for (PetAnimals snake : s) {
		  System.out.println(snake);
	  }
	  }
	  
	  public void generateFish() { 
	///Loop to generate fish
	  for (int i=0; i<numFish; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  fish = an.new fish(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(fish);
		  f.add(fish);
	  }
	  for (PetAnimals fish : f) {
		  System.out.println(fish);
	  }}
	  
	  public void generateParrot() { 
	///Loop to generate parrot
	  for (int i=0; i<numParrot; i++ ) {
		  String animalData = adg.getRandomData();
		  String [] animalParts = animalData.split(" ");
		  parrot = an.new parrot(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
		  animals.add(parrot);
		  p.add(parrot);
	  }
	  for (PetAnimals parrot : p) {
		  System.out.println(parrot);
	  }}
	  
	  public void generateAnimals () { 
	 generateParrot();
	 generateCat();
	 generateDog();
	 generateFish();
	 generateHorse();
	 generateLizard();
	 generateMouse();
	 generateRabbit();
	 generateSnake();
	 
	
	  
	  }
	   
	 }

