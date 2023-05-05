import java.util.Stack;

	public class Agency {
	  // Actors stack
	  private Stack<Actor> actors;

	  // Constructor
	  public Agency() {
	    actors = new Stack<Actor>();
	  }

	  // Add an actor to the stack (if not already in the stack)
	  public void addActor(Actor actor) {
	    if (!actors.contains(actor)) {
	      actors.push(actor);
	    }
	  }

	  // Get the actor at the top of the stack
	  public Actor getTopActor() {
	    return actors.peek();
	  }

	  // Remove the actor at the top of the stack
	  public Actor removeTopActor() {
	    return actors.pop();
	  }

	  // Get the number of actors in the stack
	  public int getNumberOfActors() {
	    return actors.size();
	  }

	  // print the actors in the stack
	  public void printActors() {
	      actors.forEach(actor -> {
	          System.out.println(actor.getName());
	      });
	  }
	}
[21:48, 05.05.2023] Sude Naz Öğdem: import java.util.HashMap;

	public class Manager {

	  public HashMap<String, Actor> filterActorsByAge(HashMap<String, Actor> actors, int age) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getAge() > age) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }

	  public HashMap<String, Actor> filterActorsByHeight(HashMap<String, Actor> actors, int height) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getHeight() > height) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }

	  public HashMap<String, Actor> filterActorsByHairColor(HashMap<String, Actor> actors, String hairColor) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getHairColor().equals(hairColor)) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }

	  public HashMap<String, Actor> filterActorsByEyeColor(HashMap<String, Actor> actors, String eyeColor) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getEyeColor().equals(eyeColor)) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }

	  public HashMap<String, Actor> filterActorsByWeight(HashMap<String, Actor> actors, int weight) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getWeight() > weight) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }

	  public HashMap<String, Actor> filterActorsByMovieExperience(HashMap<String, Actor> actors, int movieExperience) {
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getMovieExperience() > movieExperience) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }
	  
	  public HashMap<String, Actor> filterActorsByGender(HashMap<String, Actor> actors, String gender){
	    HashMap<String, Actor> filteredActors = new HashMap<String, Actor>();

	    for (String key : actors.keySet()) {
	      Actor actor = actors.get(key);
	      if (actor.getGender().equals(gender)) {
	        filteredActors.put(key, actor);
	      }
	    }
	    return filteredActors;
	  }
	}
