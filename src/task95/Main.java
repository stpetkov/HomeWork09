package task95;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Town> Towns = new HashSet<Town>();
		Town Burgas=new Town("Burgas", "Bulgaria","200 000");
		Towns.add(Burgas);
		Town Varna=new Town("Varna", "Bulgaria","330 000");
		Towns.add(Varna);
		Town Stz=new Town("Stz", "Bulgaria","140 000");
		Towns.add(Stz);
		Town Sofia=new Town("Sofia", "Bulgaria","1 410 000");
		Towns.add(Sofia);
		Town Plovdiv=new Town("Burgas", "Bulgaria","341 000");
		Towns.add(Plovdiv);
		System.out.println(Towns.contains(Varna));
		Towns.remove(Varna);
		System.out.print(Towns.contains(Varna));
	}

}
