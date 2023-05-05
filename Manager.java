import java.util.HashMap;

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
