package pl.knab.cars;

/**
 * 
 *
 * @since 2016-03-07, 23:48:18
 * @author Kacper Roszczyna
 */
public class SuperSportsCar extends SportsCar implements Turbo{

   /* public SuperSportsCar(String nazwa, int cena) {
		super(nazwa, cena);
		// TODO Auto-generated constructor stub
	}*/

	@Override
    public void boost() {
        speed += 40;
        System.out.println("SuperSportsCar speed: "+ speed);
    }
    
    @Override
    public void accelerate(){
        speed +=20;
        System.out.println("SuperSportsCar speed: "+speed);
    }

}