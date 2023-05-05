public class Actor {

		  // instance variables
		  private String name;
		  private String gender;
		  private int age;
		  private String eyeColor;
		  private String hairColor;
		  private int height;
		  private int weight;
		  private int movieExperience;

		  // constructor
		  public Actor(String name, String gender, int age, String eyeColor, String hairColor, int height, int weight, int movieExperience) {
		    this.name = name;
		    this.gender = gender;
		    this.age = age;
		    this.eyeColor = eyeColor;
		    this.hairColor = hairColor;
		    this.height = height;
		    this.weight = weight;
		    this.movieExperience = movieExperience;
		  }

		  // getters
		  public String getName() {
		    return name;
		  }

		  public String getGender() {
		    return gender; 
		  }

		  public int getAge() {
		    return age;
		  }

		  public String getEyeColor() {
		    return eyeColor;
		  }

		  public String getHairColor() {
		    return hairColor;
		  }

		  public int getHeight() {
		    return height;
		  }

		  public int getWeight() {
		    return weight;
		  }

		  public int getMovieExperience() {
		    return movieExperience;
		  }

		  // setters
		  public void setName(String name) {
		    this.name = name;
		  }

		  public void setGender(String gender){
		    this.gender = gender;
		  }

		  public void setAge(int age) {
		    this.age = age;
		  }

		  public void setEyeColor(String eyeColor) {
		    this.eyeColor = eyeColor;
		  }

		  public void setHairColor(String hairColor) {
		    this.hairColor = hairColor;
		  }

		  public void setHeight(int height) {
		    this.height = height;
		  }

		  public void setWeight(int weight) {
		    this.weight = weight;
		  }

		  public void setMovieExperience(int movieExperience) {
		    this.movieExperience = movieExperience;
		  }

		  // toString method
		  @Override
		  public String toString() {
		    return "Name: " + name + "\nGender:" + gender + "\nAge: " + age + "\nEye Color: " + eyeColor + "\nHair Color: " + hairColor + "\nHeight: " + height + "\nWeight: " + weight + "\nMovie Experience: " + movieExperience;
		  }
		}
