package task94;

public class Library {
	public Library(String name, String address, String collection) {
		super();
		this.name = name;
		this.address = address;
		this.collection = collection;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	private String name;
	private String address;
	private String collection;
}
