package pl.knab.cars;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ClassMap {
	

		   public static void main(String[] args) {
		      Map m1 = new HashMap(); 
		      Map<String,SportsCar> sports = new HashMap<String,SportsCar>();
		     SportsCar car = new SportsCar();
		     car.setType("Sportowy");
		     SportsCar car3 = new SportsCar();
		     SportsCar car4 = new SportsCar();
		     SportsCar car2 = new SportsCar();
		     car2.setType("Sport");
		     
		     sports.put("Pierwszy", car);
		     sports.put("Drugi", car2);
		  
		     sports.put("Trzeci", car3);
		     sports.put("Czwarty", car4);
		     System.out.println("Czy to prawda ze w mapie znajduje się obiekt o kluczu Trzeci? ");
		     System.out.println(sports.containsKey("Trzeci"));
		     System.out.println("Liczba elementów w mapie: ");
		     System.out.println(sports.size());
		     System.out.println("Samochód car ma typ: ");
		     System.out.println(car.type);
		     System.out.println("Czy mapa jest pusta? ");
		     System.out.println(sports.isEmpty());
		      sports.clear();
		      System.out.println("Teraz czy jest pusta? ");
		     System.out.println(sports.isEmpty());
		     
//		      m1.put("Zara", "8");
//		      m1.put("Mahnaz", "31");
//		      m1.put("Ayan", "12");
//		      m1.put("Daisy", "14");
//		      System.out.println();
//		      System.out.println(" Map Elements");
//		      System.out.print("\t" + m1);
		   
		}
}
