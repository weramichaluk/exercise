package pl.knab.cars;

/**
 * 
 *
 * @since 2016-03-15, 22:19:25
 * @author Kacper Roszczyna
 */
public class Car extends AbstractCar{
	//String nazwa;
	//int cena;
/*public Car(String nazwa, int cena){
	this.nazwa=nazwa;
	this.cena=cena;
	System.out.println("Mercedes");
	
}
    public Car() {
	// TODO Auto-generated constructor stub
}*/
	protected String type;
     
    @Override
    public void accelerate() {
        System.out.println("Accelerating a car");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}