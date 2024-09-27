package poo;

public class City {
	//	Attributes
	private String name;
	private String country;
	private int population;
		
	// Constructors
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		setPopulation(population);
	}
	
	public City(String name, int population) {
		this.name = name;
		this.country = "unknow";
		setPopulation(population);
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
		if(population>this.population)
		this.population = population;
	}
	
}
 