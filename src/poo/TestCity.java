package poo;


public class TestCity {
	public static void main(String[] args) {
		City tarbes = new City("Tarbes","France",40000);
		City toulouse = new City("Toulouse","France",450000);
		City paris = new City("Paris","France",2000000);
		City rabat = new City("Rabat",577000);
		
		paris.display();
		toulouse.display();
		tarbes.display();
		rabat.display();
	
		//System.out.println(tarbes.getName() + " " + tarbes.getCountry() + " " + tarbes.getPopulation());
		//System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " " + toulouse.getPopulation());
		//System.out.println(paris.getName() + " " + paris.getCountry() + " " + paris.getPopulation());
		
		//toulouse.setName("Tolosa");
		//toulouse.setPopulation(400000);
 
		//System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " "+ toulouse.getPopulation());
		//System.out.println(rabat.getName() + " " + rabat.getCountry() + " "+ rabat.getPopulation());
		
		//rabat.setCountry("Maroc");
		
		// Afficher les informations de Rabat après 
		//System.out.println(rabat.getName() + " " + rabat.getCountry() + " "+ rabat.getPopulation());
	}
}


 
