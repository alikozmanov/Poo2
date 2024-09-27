package poo;

public class City {
	//	Attributes
	private String name;
	private String country;
	private int population;
	
	private static int instanceCount = 0;
		
	// Constructors
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		setPopulation(population);
		instanceCount++;
	}
	
	public City(String name, int population) {
		this.name = name;
		this.country = "unknow";
		setPopulation(population);
		instanceCount++;
	}
	
	// Obtenir le nombre d'instances
	public static int getInstanceCount() {
	        return instanceCount;
	    }
	
	// Accesseurs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
 
	public String getCountry() {
		return country;
	}
 
	public void setCountry(String country) {
		this.country = country;
	}
 
	public int getPopulation() {
		return population;
	}
 
	public void setPopulation(int population) {
		if(population > this.population)
		this.population = population;
	}
	
	// Afficher la méthode diplay
	public void display() {
		System.out.println("Ville de " + name + " en " + country + " ayant " + population + " habitants ");
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + "]";
	}
	
}
 