package pl.knab.cars;

/**
 * 
 *
 * @since 2016-03-07, 23:41:39
 * @author Kacper Roszczyna
 */
public class SportsCar extends Car{

   /* public SportsCar(String nazwa, int cena) {
		super(nazwa, cena);
		// TODO Auto-generated constructor stub
	}
*/
	@Override
    public void accelerate() {
        speed += 15;
        System.out.println("SportsCar accelerate: "+speed);
    }
    
    public void drift(){
        System.out.println("SportsCar Drift");
    }
}