package task95;

public class Town {
public Town(String name, String country, String population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
private String name;
private String country;
private String population;
}
