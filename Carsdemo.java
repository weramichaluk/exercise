package pl.knab.cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Carsdemo {
public static void main(String[]args){
	
	Car [] auto = new Car[10];
	int i =0;
	Car auto1 = new Car();
	for(Car car: auto){
		car = new Car();
		//ustawiam typ
		car.setType("kombi");
		//przypisuje do kazdego typ
		auto[i++] = car;
		//System.out.println(car);
		
	}
	
	
	
	List<Car> cars = new ArrayList<Car>();
	for(int j=0;j<10;j++){
		Car car = new TerrainCar();
		cars.add(car);
	}
	for(Car car: cars){

		System.out.println(car.type);
	}
	Map<Integer, Car> car1 = new HashMap<Integer, Car>();
	//tworze obiekt
	try{
		Car car= new Car();
		//przypisuje mu nazwe
		car.setType("Fajny");
		Car car2= new Car();
		car.setType("Nowy");
		//wkladam do Map
		car1.put(1, car);
		car1.put(2, car2);
		car1.remove(2);
	}catch(Exception e){
		System.err.println("Error occured");
	}
	
}
Map<String, Car> car1 = new HashMap<String, Car>();
//tworze obiekt
Car carr= new Car();
//przypisuje mu nazwe
//carr.put(carr.getType(),car2);
}
