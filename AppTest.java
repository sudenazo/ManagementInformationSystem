import java.util.HashMap;
	import java.util.Scanner;

	public class AppTest {
	  public static void main(String[] args) {

	    HashMap<String, Actor> actors = new HashMap<String, Actor>();

	    Actor actor1 = new Actor("Leonardo DiCaprio", "Male", 47, "blue", "yellow", 183, 82, 50);
	    Actor actor2 = new Actor("Jennifer Lawrence", "Female", 31, "green", "black", 165, 52, 40);
	    Actor actor3 = new Actor("Bradd Pitt", "Male", 58, "blue", "yellow", 180, 85, 60);
	    Actor actor4 = new Actor("Margot Robbie", "Female", 31, "blue", "yellow", 168, 53, 45);
	    Actor actor5 = new Actor("Angeline Jolie", "Female", 46, "green", "black", 169, 50, 50);
	    Actor actor6 = new Actor("Dwayne Johnson", "Male", 50, "brown", "none", 196, 118, 55);
	    Actor actor7 = new Actor("Johnny Depp", "Male", 58, "brown", "black", 178, 75, 55);
	    Actor actor8 = new Actor("Tom Cruise", "Male", 59, "green", "black", 170, 73, 65);
	    Actor actor9 = new Actor("Sude Naz Ogdem", "Female", 20, "brown", "brown", 160, 50, 30);
	    Actor actor10 = new Actor("Fulya Dilara Kaya", "Female", 20, "brown", "brown", 173, 54, 32);
	    Actor actor11 = new Actor("Bahadir Arslan", "Male", 22, "brown", "brown", 188, 79, 5);

	    Manager manager = new Manager();
	    Agency agency = new Agency();

	    actors.put("Leonardo DiCaprio", actor1);
	    actors.put("Jennifer Lawrence", actor2);
	    actors.put("Bradd Pitt", actor3);
	    actors.put("Margot Robbie", actor4);
	    actors.put("Angeline Jolie", actor5);
	    actors.put("Dwayne Johnson", actor6);
	    actors.put("Johnny Depp", actor7);
	    actors.put("Tom Cruise", actor8);
	    actors.put("Sude Naz Ogdem", actor9);
	    actors.put("Fulya Dilara Kaya", actor10);
	    actors.put("Bahadir Arslan", actor11);

	    try (Scanner scanner = new Scanner(System.in)) {
	      String input = "";
	      while (true) {
	        System.out.println("1- View an actor\n2- Filter actor and add to agency\n3- View agency\n4- Exit");
	        input = scanner.nextLine();

	        if (input.equals("1")) {
	          System.out.println("Enter actor name");
	          String actorName = scanner.nextLine();

	          if (actors.containsKey(actorName)) {
	            System.out.println("----------------------------------------------------");
	            System.out.println(actors.get(actorName));
	            System.out.println("----------------------------------------------------");
	          } else {
	            System.out.println("Actor not found");
	          }
	        } else if (input.equals("2")) {
	          String filterMood = "";
	          System.out.println(
	              "Enter your choice for filter (age/height/hair/eye/weight/gender)");
	          filterMood = scanner.nextLine();
	          switch (filterMood) {
	            case "age":
	              System.out.println("Enter minimum age: ");
	              int age = scanner.nextInt();
	              scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByAge1 = manager.filterActorsByAge(actors, age);
	              for (String key : filteredActorsByAge1.keySet()) {
	                agency.addActor(filteredActorsByAge1.get(key));
	                System.out.println(filteredActorsByAge1.get(key).getName());
	              }
	              if(filteredActorsByAge1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              break;
	            case "height":
	              System.out.println("Enter minimum height: ");
	              int height = scanner.nextInt();
	              scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByHeight1 = manager.filterActorsByHeight(actors, height);
	              for (String key : filteredActorsByHeight1.keySet()) {
	                agency.addActor(filteredActorsByHeight1.get(key));
	                System.out.println(filteredActorsByHeight1.get(key).getName());
	              }

	              if(filteredActorsByHeight1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              
	              break;
	            case "hair":
	              System.out.println("Enter hair color (brown/yellow/black..): ");
	              String hairColor = scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByHairColor1 = manager.filterActorsByHairColor(actors, hairColor);
	              for (String key : filteredActorsByHairColor1.keySet()) {
	                agency.addActor(filteredActorsByHairColor1.get(key));
	                System.out.println(filteredActorsByHairColor1.get(key).getName());
	              }
	              if(filteredActorsByHairColor1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              break;
	            case "eye":
	              System.out.println("Enter eye color (blue/green/brown..): ");
	              String eyeColor = scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByEyeColor1 = manager.filterActorsByEyeColor(actors, eyeColor);
	              for (String key : filteredActorsByEyeColor1.keySet()) {
	                agency.addActor(filteredActorsByEyeColor1.get(key));
	                System.out.println(filteredActorsByEyeColor1.get(key).getName());
	              }
	              if(filteredActorsByEyeColor1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              break;
	            case "weight":
	              System.out.println("Enter minimum weight: ");
	              int weight = scanner.nextInt();
	              scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByWeight1 = manager.filterActorsByWeight(actors, weight);
	              for (String key : filteredActorsByWeight1.keySet()) {
	                agency.addActor(filteredActorsByWeight1.get(key));
	                System.out.println(filteredActorsByWeight1.get(key).getName());
	              }
	              if(filteredActorsByWeight1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              break;
	            case "gender":
	              System.out.println("Enter gender (Male/Female): ");
	              String gender = scanner.nextLine();
	              HashMap<String, Actor> filteredActorsByGender1 = manager.filterActorsByGender(actors, gender);
	              for (String key : filteredActorsByGender1.keySet()) {
	                agency.addActor(filteredActorsByGender1.get(key));
	                System.out.println(filteredActorsByGender1.get(key).getName());
	              }
	              if(filteredActorsByGender1.size() == 0) {
	                System.out.println("No actors found");
	                System.out.println("----------------------------------------------------");
	              } else {
	                System.out.println("Actors added to agency");
	                System.out.println("----------------------------------------------------");
	              }
	              break;
	          }
	        } else if (input.equals("3")) {
	          agency.printActors();
	        } else if (input.equals("4")) {
	          break;
	        }
	      }
	    }
	  }
	}
