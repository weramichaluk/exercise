package pl.knab.cars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassList {
	public static void main(String[]args){
	List<TerrainCar> terrains = new ArrayList<TerrainCar>();
	
	for(int i = 0; i<15; i++){
		TerrainCar terrain = new TerrainCar();
		terrains.add(terrain);
		terrain.setType(+ i + " Terenowy " );
		//terrain.accelerate();
	}
	
	for(TerrainCar car: terrains){
		System.out.println(car.type);
		System.out.println("Car speed: " + car.speed);
	}
	System.out.println("Liczba elementów w liście: " + terrains.size());
	System.out.println(terrains.isEmpty());
	
	for(int i =3; i<5; i++){
		terrains.remove(i);
	}
	for(TerrainCar car: terrains){
		System.out.println(car.type);
		System.out.println("Car speed: " + car.speed);
	}
	
	System.out.println();
	
	LinkedList<SportsCar> sports = new LinkedList<SportsCar>();
	for(int i = 0; i<15; i++){
		SportsCar sport = new SportsCar();
		sports.add(sport);
		sport.setType(+ i + " Sport Car " );
		//terrain.accelerate();
	}
	System.out.println();
	SportsCar sport1 = new SportsCar();
	sport1.setType("The best one");
	sports.add(0, sport1);
	
	SportsCar last = new SportsCar();
	last.setType("The last one");
	sports.add(14, last);
	
	System.out.println();
	for(SportsCar car: sports){
		System.out.println(car.type);
		car.accelerate();
		System.out.println("Car speed: " + car.speed);
	}
	
	     System.out.println("Trzeci samochód, ale liczymy od zera to : " +sports.get(3).type);
	     
	     System.out.println("Pierwszy : " +sports.get(0).type);
	     System.out.println(sports.indexOf(sport1));
	     System.out.println("Pierwszy : " +sports.get(14).type);
	     System.out.println("Liczba elementów w LinkedList: ");
	     System.out.println(sports.size());
	     sports.clear();
	     
	     System.out.println("Liczba elementów w LinkedList po metodzie clear() : ");
	     System.out.println(sports.size());

  
     
  }

	

}

